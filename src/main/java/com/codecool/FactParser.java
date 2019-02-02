package com.codecool;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class FactParser extends XMLParser {


    public FactRepository getFactRepositiry() throws IOException, SAXException, ParserConfigurationException {

        FactRepository fp = new FactRepository();


        Element root = super.loadXMLDocument("facts.xml");

        for (int i = 0; i < root.getElementsByTagName("fact").getLength(); i++) {

            Node n = root.getElementsByTagName("fact").item(i);

            if (n.getNodeType() == n.ELEMENT_NODE) {

                Element r = (Element) n;
                String description = r.getElementsByTagName("Description").item(0).getNodeValue();

                for (int j = 0; j < r.getElementsByTagName("Evals").getLength(); j++) {
                    Node n2 = r.getElementsByTagName("evalse").item(i);

                    if (n2.getNodeType() == n2.ELEMENT_NODE) {

                        Element r2 = (Element) n2;
                        Fact f = new Fact(description);


                        for (int k = 0; k < r.getElementsByTagName("Eval").getLength(); k++) {
                            Node n3 = r2.getElementsByTagName("eval").item(i);

                            if (n3.getNodeType() == n3.ELEMENT_NODE) {
                                Element r3 = (Element) n3;

                                f.setFactValueById(r3.getAttribute("id"),
                                        Boolean.valueOf(r3.getNodeValue()).booleanValue());


                            }
                        }
                        fp.addFact(f);


                    }


                }


            }


        }
        return fp;
    }
}
