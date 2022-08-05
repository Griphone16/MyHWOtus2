package com.hw.myhw2.config;

import com.hw.myhw2.dao.AnswerDao;
import com.hw.myhw2.dao.AnswerDaoSimple;
import com.hw.myhw2.dao.ReaderCSVDao;
import com.hw.myhw2.dao.ReaderCSVDaoSimple;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoConfig {

    @Bean
    public AnswerDao answerDao() {
        return new AnswerDaoSimple();
    }

    @Bean
    public ReaderCSVDao readerCSVDao() {return new ReaderCSVDaoSimple(); }


}
