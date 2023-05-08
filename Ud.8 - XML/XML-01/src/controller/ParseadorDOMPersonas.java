package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import model.Persona;

public class ParseadorDOMPersonas {
	
	
	public static List<Persona> parse(String nomFile) throws XPathExpressionException, ParserConfigurationException, SAXException, IOException{
		
		List<Persona> listado = new ArrayList<Persona>();
		
		Document docXML;
		
        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		docXML = docBuilder.parse(nomFile);
		docXML.getDocumentElement().normalize();
		
		NodeList nodeList = docXML.getElementsByTagName("persona");

        for (int i = 0; i < nodeList.getLength(); i++) {
			Node nNode = nodeList.item(i);
			
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element elemento = (Element) nNode;
				
				String nombre = elemento.getElementsByTagName("nombre").item(0).getTextContent();
				Integer edad = Integer.parseInt(elemento.getElementsByTagName("edad").item(0).getTextContent());
				listado.add(new Persona(nombre, edad));
				
			}

        }
		
        return listado;
		
	}

}