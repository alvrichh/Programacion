package view;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import controller.XML_DOM_AEMET;
import controller.XML_HTTP;
import controller.XML_SAX_AEMET;
import model.CCAA;
import model.Ciudad;
import model.Provincia;

public class Principal {

	public static void main(String[] args) throws Exception {

		String FILE_NAME = "PB.xml";
		
		updateInfo();
		
//		List<CCAA> info = usandoDOM(FILE_NAME);
		List<CCAA> info = usandoSAX(FILE_NAME);

		for (CCAA a : info) {
			System.out.println("\nCCAA: " + a.getNombre());
			for (Provincia p : a.getProvincia()) {
				System.out.println("\n\tProvincia: " + p.getNombre());
				for (Ciudad c : p.getCiudad()) {
					System.out.println("\t\t" + c.getNombre() + " [" + c.getTmax() + "," + c.getTmin() + "]");
				}
			}
		}

		System.out.println("\n\nFin del programa.");
	}
	
	
	private static void updateInfo() throws MalformedURLException, IOException {
	    LocalDate fechaActual = LocalDate.now();
	    DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	    String fechaFormateada = fechaActual.format(formatoFecha);
	    
	    String url = "https://www.aemet.es/es/api-eltiempo/temperaturas/" + fechaFormateada + "/PB";
	    
	    System.out.print("Actualizando datos...");
	    XML_HTTP gest = new XML_HTTP();
	    gest.updateInfo(url, "PB.xml");
	    System.out.println("\tACTUALIZADO !");
	}

	private static List<CCAA> usandoDOM(String nomFile) throws Exception {
		XML_DOM_AEMET gest = new XML_DOM_AEMET(nomFile);
		return gest.getInfo();
	}
	
	private static List<CCAA> usandoSAX(String nomFile) throws Exception {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser = factory.newSAXParser();
		XML_SAX_AEMET gest = new XML_SAX_AEMET();
		saxParser.parse(nomFile, gest);

		return gest.getInfo();
	}

}