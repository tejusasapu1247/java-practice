package com.demo;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Demo {
	public static void main(String [] args) throws SAXException, IOException {
		DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder=builderFactory.newDocumentBuilder();
			Document doc=builder.parse("demo.xml");
			NodeList list=doc.getElementsByTagName("person");
			
			
			
			
			
			
			
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
