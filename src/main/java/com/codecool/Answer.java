package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Answer {

    private List<Value> values;

    public Answer() {
        this.values = new ArrayList<Value>();
    }

    public void addValue(Value value) {
        this.values.add(value);
    }

    public boolean evaluateAnswerByInput(String input) {

        for (Value value : values) {
            for (String a : value.getInputPatterns()) {
                if (a.equals(input))
                    return value.getSelectionType();
            }
        }
        //TODO: what if the input is not exist
    }
}
