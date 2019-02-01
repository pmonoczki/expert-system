package com.codecool;

import java.util.*;

public class Fact {


    private String description;

    private Set<String> evals;

    private Map<String, Boolean> fa;

    public Fact(String sescription) {
        this.description = description;
        this.evals = new HashSet<String>();
        this.fa = new HashMap<String, Boolean>();
    }

    public Set<String> getIdSet() {
        return this.evals;
    }

    public String getDescription() {
        return this.description;
    }

    public void setFactValueById(String id, boolean value) {
        fa.put(id, Boolean.valueOf(value));
    }

    public boolean getValueById(String id) {
        return this.fa.get(id).booleanValue();
    }


}
