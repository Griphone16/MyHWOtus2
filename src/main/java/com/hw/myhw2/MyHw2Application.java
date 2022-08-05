package com.hw.myhw2;

import com.hw.myhw2.domain.Question;
import com.hw.myhw2.service.ReaderCSVService;
import com.hw.myhw2.service.SertificationService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@PropertySource("classpath:application.properties")
@Configuration
@ComponentScan
public class MyHw2Application {

    public static void main(String[] args) {

        //SpringApplication.run(MyHw1Application.class, args);
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("/spring-context.xml");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyHw2Application.class);

        SertificationService sertificationService = context.getBean(SertificationService.class);

        sertificationService.sertificate();

    }

}
