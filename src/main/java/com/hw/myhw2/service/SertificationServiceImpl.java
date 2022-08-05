package com.hw.myhw2.service;

import com.hw.myhw2.domain.Answer;
import com.hw.myhw2.domain.Question;
import org.springframework.beans.factory.annotation.Value;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.logging.Logger;

public class SertificationServiceImpl implements SertificationService{

    private final ReaderCSVService readerCSV;

    @Value("${answer.countRightAnswers}")
    private int countRightAnswers;

    public SertificationServiceImpl(ReaderCSVService readerCSV) {
        this.readerCSV = readerCSV;
    }

    @Override
    public boolean sertificate()  {

        List<Question> questions = readerCSV.getAnswers();
        int countRightAnswerings = 0;
        for (int i = 0; i< questions.size(); i++){
            Question question = questions.get(i);

            System.out.println(question.getText());
            List<Answer> answers = question.getAnswers();
            int rightAnswer=-1;
            for (Answer answer:answers) {
                if (answer.isCorrectAnswer())
                    rightAnswer = answers.indexOf(answer)+1;

                System.out.println(answer.getText());

            }
            int ianswer = 0;
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String s = reader.readLine();
                ianswer = Integer.valueOf(s);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            if (ianswer== rightAnswer)
                countRightAnswerings++;

            System.out.println(ianswer);
            System.out.println(rightAnswer);
            System.out.println(countRightAnswerings);

        }
        if (countRightAnswerings >= countRightAnswers) {
            System.out.println("congratulations, you pass the sertification!");
            return true;
        }else {
            System.out.println("Sorry, you fail the sertification!");
            System.out.println("Your score: " + countRightAnswerings);
        }
        return false;
    }
}
