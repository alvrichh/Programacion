package view;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

import controller.RecorridoDOM;
import controller.RecorridoSAX;

public class Principal {

	final static String FILE_NAME = "alumnos.xml";

	public static void main(String[] args) {

		try {
			mostrarXMLusandoSAX();

			RecorridoDOM gest = new RecorridoDOM(FILE_NAME);
			mostrarInfo(gest);
			mostrarXMLusandoDOM(gest);
			mostrarContenidoEtiqueta(gest);

			System.out.println("\nFin del programa.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void mostrarXMLusandoSAX() throws SAXException, IOException, ParserConfigurationException {
		RecorridoSAX handler = new RecorridoSAX();
		SAXParserFactory.newInstance().newSAXParser().parse(FILE_NAME, handler);

		String xml = handler.getXML();
		System.out.println(xml);
	}

	private static void mostrarInfo(RecorridoDOM gest) {
		List<String> nodos = gest.numNodosHijos();
		System.out.println("Nodos = " + nodos.size());
		nodos.stream().forEach(System.out::println);

	}

	private static void mostrarXMLusandoDOM(RecorridoDOM gest) throws TransformerException {
		String xml = gest.getXML();
		System.out.println(xml);
	}


	private static void mostrarContenidoEtiqueta(RecorridoDOM gest) {
		List<String> listado = gest.mostrarContenidoEtiqueta("curso");
		if (listado.size() == 0) {
			System.out.println("No hay valores.");
		} else {
			listado.stream().forEach(System.out::println);
		}
	}

}