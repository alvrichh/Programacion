package controller;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import model.CCAA;
import model.Ciudad;
import model.Provincia;

public class XML_SAX_AEMET extends DefaultHandler {

	private List<CCAA> lstCCAA = new ArrayList<CCAA>();
	private CCAA ccaa;
	private Provincia provincia;
	private Ciudad ciudad;
	private StringBuilder carateresLeidos = new StringBuilder();
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		switch(qName) {
			case "ccaa" -> {
				String id        = attributes.getValue("id");
				String nombre    = attributes.getValue("nombre");
				ccaa = new CCAA(id, nombre);
				lstCCAA.add(ccaa);
			}
			case "provincia" -> {
				String ccaa      = attributes.getValue("ccaa");
				String id        = attributes.getValue("id");
				String nombre    = attributes.getValue("nombre");
				provincia = new Provincia(ccaa, id, nombre);
			}
			case "ciudad" -> {
				String capital   = attributes.getValue("capital");
				String cod_ine   = attributes.getValue("cod_ine");
				String cod_ine_m = attributes.getValue("cod_ine_m");
				String nombre    = attributes.getValue("nombre");
				Integer tmax     = 0;
				Integer tmin     = 0;
				ciudad = new Ciudad(capital, cod_ine, cod_ine_m, nombre, tmax, tmin);
			}
		}

		carateresLeidos.setLength(0);
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		carateresLeidos.append(ch, start, length);
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		
		switch (qName) {
			case "tmax" -> ciudad.setTmax(Integer.parseInt(carateresLeidos.toString()));
			case "tmin" -> ciudad.setTmin(Integer.parseInt(carateresLeidos.toString()));
		}
		
		switch (qName) {
			case "ciudad"    -> provincia.addCiudad(ciudad);
			case "provincia" -> ccaa.addProvincia(provincia);
		}
	}

	public List<CCAA> getInfo() {
		return lstCCAA;
	}

}