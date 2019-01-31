package com.codecool;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ESProvider {

    private FactParser fp;

    private RuleParser rp;

    private Map<String, Boolean> qa;

    public ESProvider(FactParser fp, RuleParser rp) {
        this.fp = fp;
        this.rp = rp;
        qa = new HashMap<String, Boolean>();
    }

    public void colletAnswers() throws ParserConfigurationException, SAXException, IOException {
        Iterator it = this.rp.getRuleRepository().getIterator();
        Scanner sc = new Scanner(System.in);
        while (it.hasNext()) {
            Question q = (Question) it.next();

            System.out.println(q.getQuestion());

            this.qa.put(q.getId(), Boolean.valueOf(q.getEvaluatedAnswer(sc.nextLine())));
        }
    }
}
