package controller;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class XML_DOM {
	
	public static Document docXML;
	
	final String nomFile = "elecciones.xml";
	
	public XML_DOM(String nomFile) throws Exception{
		try {
			docXML = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(nomFile);
		} catch (Exception e) {
			// TODO: handle exception
		}
		}
	
	

}
