package com.codecool;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public abstract class XMLParser {

    public Element loadXMLDocument(String path) throws ParserConfigurationException, FileNotFoundException {
        InputStream is = new FileInputStream("rules.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document d = db.parse(is);

        return d.getDocumentElement();

    }
}
