package com.codecool;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.List;

public class SingleValue extends Value {


    private boolean selectionType;

    private List<String> param;

    public SingleValue(List<String> param, boolean selectionType) {

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
