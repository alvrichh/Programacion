package controller;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import model.*;
public class AlumnosSAX extends DefaultHandler {
	
	private List<Alumno> lstAlumnos = new ArrayList<>();
	private Alumno alumno = null;
	private String dni = null;
	private StringBuilder caracteresLeidos = new StringBuilder();
	
	public AlumnosSAX() {
		
	}
	
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if (qName.equals("alumno")) {
			dni = attributes.getValue("dni");
			alumno = new Alumno();
		}
		caracteresLeidos.setLength(0);
	}


	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
	
		switch(qName) {
		case "dni" -> alumno.setDni(caracteresLeidos.toString());
		case "nombre" -> alumno.setNombre(caracteresLeidos.toString());
		case "apellido" -> alumno.setApellido(caracteresLeidos.toString());
		case "direccion" -> alumno.setDireccion(caracteresLeidos.toString());
		}
		if(qName.equals("alumno")) {
			lstAlumnos.add(alumno);
		}
	}


	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		caracteresLeidos.append(ch, start, length);
	}


	public List<Alumno> getAlumnos() {
		return lstAlumnos;
	}



}
