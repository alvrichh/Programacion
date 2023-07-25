package controller;

import java.util.StringTokenizer;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class RecorridoSAX extends DefaultHandler {

	private StringBuilder contenidoXML = new StringBuilder();
	private final String IND = "    ";
	private int indentation = 0;

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		indent(indentation);
		contenidoXML.append("<" + qName);
		int numAttributes = attributes.getLength();
		// Para <etiqueta>, escribir sólo la etiqueta.
		// Para <etiqueta att1="Val1" att2="Val2">, escribir: <etiqueta (att1=Val1, att2=Val2)
		if (numAttributes > 0) {
			contenidoXML.append(" (");
			for (int i = 0; i < numAttributes; i++) {
				if (i > 0) {
					contenidoXML.append(", ");
				}
				contenidoXML.append(attributes.getQName(i) + "=" + attributes.getValue(i));
			}
			contenidoXML.append(")");
		}
		contenidoXML.append(">" + "\n");
		indentation++;
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String data = new String(ch, start, length);
		StringTokenizer tok = new StringTokenizer(data);
		if (tok.hasMoreTokens()) {
			indent(indentation);
			contenidoXML.append(data +"\n");
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		indentation--;
		indent(indentation);
		contenidoXML.append("</" + qName + ">" + "\n");
	}

	private void indent(int indentation) {
		for (int i = 0; i < indentation; i++) {
			contenidoXML.append(IND);
		}
	}

	public String getXML() {
		return contenidoXML.toString();
	}

}