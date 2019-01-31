package com.codecool;

public class Question {


    private String id;

    private String question;

    public String getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public Answer getAnswer() {
        return answer;
    }

    private Answer answer;

    public Question(String id, String question, Answer answer) {
        this.id = id;
        this.question = question;
        this.answer = answer;

    }

    public boolean getEvaluatedAnswer(String input) {
        return this.answer.evaluateAnswerByInput(input);
    }


}
