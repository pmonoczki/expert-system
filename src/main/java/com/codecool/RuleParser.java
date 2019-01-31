package com.codecool;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RuleParser extends XMLParser {

    public RuleRepository getRuleRepository() throws IOException, SAXException, ParserConfigurationException {
        RuleRepository rr = new RuleRepository();

        Element root = super.loadXMLDocument("rulex.xml");
        for (int i = 0; i < root.getElementsByTagName("Rule").getLength(); i++) {
            Node n = root.getElementsByTagName("Rule").item(i);

            if (n.getNodeType() == n.ELEMENT_NODE) {

                Element r = (Element) n;

                String id = r.getAttribute("id");
                String question = r.getElementsByTagName("Question").item(0).getNodeValue();
                Answer a = new Answer();


                for (int j = 0; j < r.getElementsByTagName("Answer").getLength(); j++) {
                    Node n2 = r.getElementsByTagName("Answer").item(j);
                    if (n2.getNodeType() == n2.ELEMENT_NODE) {

                        Element r2 = (Element) n2;


                        for (int k = 0; k < r2.getElementsByTagName("Selection").getLength(); k++) {
                            Node n3 = r2.getElementsByTagName("Selection").item(k);
                            if (n3.getNodeType() == n3.ELEMENT_NODE) {
                                Element r3 = (Element) n3;
                                boolean st = (Boolean.valueOf(r3.getAttribute("value"))).booleanValue();

                                for (int l = 0; l < r3.getElementsByTagName("SingleValue").getLength(); l++) {
                                    Node n4 = r3.getElementsByTagName("SingleValue").item(l);
                                    if (n4.getNodeType() == n4.ELEMENT_NODE) {
                                        Element r5 = (Element) n4;

                                        String inp = r5.getAttribute("value");
                                        List<String> ll = new ArrayList<String>();
                                        ll.add(inp);

                                        SingleValue s = new SingleValue(ll, st);
                                        a.addValue(s);

                                    }


                                }
                            }


                        }

                    }
                }
                Question qq = new Question(id, question, a);
                getRuleRepository().addQuestion(qq);
            }
        }


        return rr;
    }
}
