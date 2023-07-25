package controller;

import java.util.ArrayList;
import java.util.List;

public class ParseSAX {

	private List<cartelera> lstCartelera = new ArrayList<cartelera>();
	private Categoria categoria;
	private Pelicula pelicula;
	private StringBuilder carateresLeidos = new StringBuilder();
	
	
	
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		switch(qName) {
			case "Categoria" -> {
				String pelicula        = attributes.getValue("codigo");
				lstCartelera.add(categoria);
			}
			case "pelicula" -> {
				String pelicula      = attributes.getValue("pelicula");
				String titulo        = attributes.getValue("titulo");
				String director    = attributes.getValue("director");
				categoria = new pelicula(pelicula, titulo, director);
			}
	
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
	
	
public List<cartelera> getInfo() {
	return lstCartelera;
}