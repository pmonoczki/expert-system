package com.codecool;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class RuleRepository {

    private List<Question> questions;

    public RuleRepository() {
        this.questions = new ArrayList<Question>();
    }

    public void addQuestion(Question question) {
        this.questions.add(question);
    }


    public void forEachRemaining(Consumer action) {

    }

    public Iterator getIterator() {
        return this.questions.iterator();
    }
}
