package com.hw.myhw2.dao;

import com.hw.myhw2.domain.Answer;
import com.hw.myhw2.domain.Question;
import org.springframework.beans.factory.annotation.Value;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderCSVDaoSimple implements ReaderCSVDao{

    @Value("${db.fileCSV}")
    private String fileCSV;

    public String getFileCSV() {
        return fileCSV;
    }

    public void setFileCSV(String fileCSV) {
        this.fileCSV = fileCSV;
    }

    @Override
    public List<Question> getAnswers() {
        List<Question> result = new ArrayList<Question>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileCSV));
            String line = null;
            Scanner scanner = null;
            int index = 0;
            while ((line = reader.readLine()) != null ) {

                scanner = new Scanner(line);
                scanner.useDelimiter(";");
                Answer answer = null;
                Question question = new Question();
                while (scanner.hasNext()) {
                    String data = scanner.next();
                    if (index == 0)
                        question.setText(data);
                    else if (index == 1){
                        answer = new Answer();
                        answer.setText(data);}
                    else if (index == 2)    {
                        answer.setCorrectAnswer(Boolean.parseBoolean(data));
                        question.addAnswers(answer);
                    }
                    else if (index == 3){
                        answer = new Answer();
                        answer.setText(data);}
                    else if (index == 4)    {
                        answer.setCorrectAnswer(Boolean.parseBoolean(data));
                        question.addAnswers(answer);
                    }
                    else if (index == 5){
                        answer = new Answer();
                        answer.setText(data);}
                    else if (index == 6)    {
                        answer.setCorrectAnswer(Boolean.parseBoolean(data));
                        question.addAnswers(answer);
                    }
                    index++;
                }
                index = 0;
                result.add(question);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
