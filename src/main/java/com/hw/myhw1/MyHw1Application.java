package com.hw.myhw1;

import com.hw.myhw1.domain.Question;
import com.hw.myhw1.service.ReaderCSVService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class MyHw1Application {

    public static void main(String[] args) {

        //SpringApplication.run(MyHw1Application.class, args);
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("/spring-context.xml");
        ReaderCSVService readerCSV = context.getBean(ReaderCSVService.class);

        List<Question> questions = readerCSV.getAnswers();
        for (Question question: questions) {
            System.out.println(question);
        }
    }

}
