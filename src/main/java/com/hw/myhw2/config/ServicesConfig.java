package com.hw.myhw2.config;

import com.hw.myhw2.dao.ReaderCSVDao;
import com.hw.myhw2.service.QuestionService;
import com.hw.myhw2.service.QuestionServiceImpl;
import com.hw.myhw2.service.ReaderCSVService;
import com.hw.myhw2.service.ReaderCSVServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicesConfig {

    @Bean
    public QuestionService questionService() { return new QuestionServiceImpl();    }

    @Bean
    public ReaderCSVService readerCSVService(ReaderCSVDao dao) {return new ReaderCSVServiceImpl(dao);   }
}
