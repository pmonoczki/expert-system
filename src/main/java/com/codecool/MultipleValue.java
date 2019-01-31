package com.codecool;

import java.util.List;

public class MultipleValue extends Value {

    private boolean selectionType;

    private List<String> param;

    public MultipleValue(List<String> param, boolean selectionType) {

        this.param = param;
        this.selectionType = selectionType;
    }

    public boolean getSelectionType() {
        return this.selectionType;
    }

    public List<String> getInputPatterns() {
        return this.param;
    }
}
