package com.hw.myhw1.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

    public static final String QUESTION_1 = "Question1";
    public static final String QUESTION_2 = "question2";
    public static final String ANSWER_1 = "Answer1";

    @Test
    @DisplayName("������ �������� Text")
    void getText() {

        Question question = new Question(QUESTION_1);
        assertEquals(question.getText(), QUESTION_1);

    }

    @Test
    @DisplayName("������ ������������� Text")
    void setText() {
        Question question = new Question(QUESTION_1);
        question.setText(QUESTION_2);
        assertEquals(question.getText(), QUESTION_2);
    }

    @Test
    @DisplayName("������ �������� Answers")
    void getAnswers() {

    }

    @Test
    @DisplayName("������ ������������� Answers")
    void setAnswers() {
    }

    @Test
    @DisplayName("������ ��������� Answers")
    void addAnswers() {
        Question question = new Question(QUESTION_1);
        Answer answer = new Answer(ANSWER_1, true);
        question.addAnswers(answer);
        assertEquals(question.getAnswers().size(),1);
    }
}