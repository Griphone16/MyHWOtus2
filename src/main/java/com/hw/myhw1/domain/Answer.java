package com.hw.myhw1.domain;

public class Answer {
    private String text;
    private boolean correctAnswer;

    public Answer(String text, boolean correctAnswer) {
        this.text = text;
        this.correctAnswer = correctAnswer;
    }

    public Answer() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(boolean correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "text='" + text + '\'' +
                ", correctAnswer=" + correctAnswer +
                '}';
    }
}
