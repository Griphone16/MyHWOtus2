package com.hw.myhw2.dao;

import com.hw.myhw2.domain.Question;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;




import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class ReaderCSVDaoSimpleTest {

    public static final String FILE_CSV = "FileCSV";

    @Test
    @DisplayName("Должен получать имя файла CSV")
    void getFileCSV() {
        ReaderCSVDaoSimple readerCSVDaoSimple = new ReaderCSVDaoSimple();
        readerCSVDaoSimple.setFileCSV(FILE_CSV);

        assertEquals(readerCSVDaoSimple.getFileCSV(), FILE_CSV);
    }

    @Test
    @DisplayName("Должен устанавливать имя файла CSV")
    void setFileCSV() {
        ReaderCSVDaoSimple readerCSVDaoSimple = new ReaderCSVDaoSimple();
        readerCSVDaoSimple.setFileCSV(FILE_CSV);
        
        assertEquals(readerCSVDaoSimple.getFileCSV(), FILE_CSV);
    }

    @Test
    @DisplayName("Должен считывать вопросы из файла CSV")
    void getAnswers() {
        ReaderCSVDaoSimple readerCSVDaoSimple = new ReaderCSVDaoSimple();
        readerCSVDaoSimple.setFileCSV("E:/My HW Otus/HW.2/src/test/resources/QuestionsTest.csv");
        List<Question> questions = readerCSVDaoSimple.getAnswers();
        assertEquals(questions.size(), 2);

    }
}