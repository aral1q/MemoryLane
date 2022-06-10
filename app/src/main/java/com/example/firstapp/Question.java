package com.example.firstapp;

import java.io.File;

public class Question {
    private String question, first, second, third, fourth, answer;
    private int hint;

    // Constructor
    public Question(String question, String first, String second, String third, String fourth, String answer, int hint) {
        this.question = question;
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.answer = answer;
        this.hint = hint;
    }

    // Getters and Setters
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public String getThird() {
        return third;
    }

    public void setThird(String third) {
        this.third = third;
    }

    public String getFourth() {
        return fourth;
    }

    public void setFourth(String fourth) {
        this.fourth = fourth;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getHint() {
        return hint;
    }

    public void setHint(int hint) {
        this.hint = hint;
    }
}
