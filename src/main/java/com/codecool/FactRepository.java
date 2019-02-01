package com.codecool;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FactRepository {

    private List<Fact> facts;

    public FactRepository() {
        facts = new ArrayList<Fact>();
    }

    public Iterator getIterator() {
        return this.facts.iterator();
    }
}
