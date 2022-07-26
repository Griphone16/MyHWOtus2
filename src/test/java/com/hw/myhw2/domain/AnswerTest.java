package com.hw.myhw2.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnswerTest {

    public static final String ANSWER_1 = "answer1";
    public static final String ANSWER_2 = "answer2";

    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("Должен получать Text")
    void getText() {
        Answer answer = new Answer(ANSWER_1, true);
        assertEquals(answer.getText(), ANSWER_1);

    }

    @Test
    @DisplayName("Должен устанавливать Text")
    void setText() {
        Answer answer = new Answer(ANSWER_1, true);
        answer.setText(ANSWER_2);
        assertEquals(answer.getText(), ANSWER_2);

    }

    @Test
    @DisplayName("Должен устанавливать CorrectAnswer")
    void isCorrectAnswer() {
        Answer answer = new Answer(ANSWER_1, true);

        assertEquals(answer.isCorrectAnswer(), true);
    }

    @Test
    @DisplayName("Должен получать CorrectAnswer")
    void setCorrectAnswer() {
        Answer answer = new Answer(ANSWER_1, false);
        answer.setCorrectAnswer(true);
        assertEquals(answer.isCorrectAnswer(), true);
    }
}