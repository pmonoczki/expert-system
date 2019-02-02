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
                String question = r.getElementsByTagName("Question").item(0).getNodeValue();


            }


        }


        return fp;
    }
}
