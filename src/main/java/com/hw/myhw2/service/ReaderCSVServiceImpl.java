package com.hw.myhw2.service;



import com.hw.myhw2.dao.ReaderCSVDao;
import com.hw.myhw2.domain.Question;

import java.util.List;

public class ReaderCSVServiceImpl implements ReaderCSVService{
    private final ReaderCSVDao dao;

    public ReaderCSVServiceImpl(ReaderCSVDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Question> getAnswers() {
        return dao.getAnswers();
    }
}
