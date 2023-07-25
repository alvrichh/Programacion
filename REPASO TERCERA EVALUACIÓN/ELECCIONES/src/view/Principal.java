package view;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import controller.Controller_JSON;
import controller.XML_SAX;
import model.Votacion;

public class Principal {
	
	public static void main(String[] args) {
		
		final String FILE_NAME = "elecciones.xml";

		try {
			
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			
			XML_SAX handler = new XML_SAX();
			saxParser.parse(FILE_NAME, handler);
			
			List<Votacion> listado = handler.getVotaciones();
			System.out.println("SUPUESTAMENTE AQUÍ ESTÁ EL LISTADO:");
			System.out.println(listado);

			for (Votacion votacion : listado) {
				System.out.println(Controller_JSON.printJson(FILE_NAME, listado));
				}
			//listado.stream().forEach(System.out::println);
			
			
			System.out.println("\nFin del programa");
						
		}
		catch (IOException ioe) { System.err.println(ioe.getMessage());}
		catch (SAXException saxe) { System.err.println(saxe.getMessage());}
		catch (ParserConfigurationException pce) { System.err.println(pce.getMessage());}
		catch (Exception e) {System.err.println(e.getMessage()); }
	}


}
/* todas las etiquetas img todos los headers en un map
 * 
 *  
 *  
 *  
 *  */
