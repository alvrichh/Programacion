package view;

import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class Principal {

	public static void main(String[] args) throws Exception {

				
	private static List<lstCartelera> usandoSAX(String nomFile) throws Exception {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser = factory.newSAXParser();
		ParseSAX gest = new ParseSAX();
		saxParser.parse(nomFile, gest);

	}

}
}