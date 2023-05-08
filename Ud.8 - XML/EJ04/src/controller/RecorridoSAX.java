package controller;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class RecorridoSAX {
    
    private static final String XML_FILE = "colegio.xml";
    
    public static void main(String[] args) throws Exception {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        saxParser.parse(XML_FILE, new DefaultHandler() {
            
            boolean isAlumno = false;
            String dni = "";
            String nombre = "";
            String apellidos = "";
            int curso = 0;
            
            public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                if (qName.equalsIgnoreCase("alumno")) {
                    isAlumno = true;
                    dni = attributes.getValue("dni");
                }
            }
            
            public void endElement(String uri, String localName, String qName) throws SAXException {
                if (qName.equalsIgnoreCase("alumno")) {
                    System.out.println("DNI: " + dni);
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Apellidos: " + apellidos);
                    System.out.println("Curso: " + curso);
                    System.out.println("--------------------");
                    isAlumno = false;
                    dni = "";
                    nombre = "";
                    apellidos = "";
                    curso = 0;
                } else if (qName.equalsIgnoreCase("nombre")) {
                    nombre = getText();
                } else if (qName.equalsIgnoreCase("apellidos")) {
                    apellidos = getText();
                } else if (qName.equalsIgnoreCase("curso")) {
                    curso = Integer.parseInt(getText());
                }
            }
            
            public void characters(char ch[], int start, int length) throws SAXException {
                if (isAlumno && !getText().isEmpty()) {
                    if (qName.equalsIgnoreCase("nombre")) {
                        nombre = getText();
                    } else if (qName.equalsIgnoreCase("apellidos")) {
                        apellidos = getText();
                    } else if (qName.equalsIgnoreCase("curso")) {
                        curso = Integer.parseInt(getText());
                    }
                }
            }
            
            private String getText() {
                return new String(ch, start, length).trim();
            }
            
        });
    }
}
