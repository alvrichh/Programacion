package view;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

import controller.ParseadorDOMPersonas;
import controller.ParseadorDOMPersonas;
import model.Persona;

public class Principal {
	public static void main(String[] args) {
		
		try {
			List<Persona> listado = ParseadorDOMPersonas.parse("personas.xml");
			listado.stream().forEach(System.out::println);
		} catch (XPathExpressionException | ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
		
	}
	}
