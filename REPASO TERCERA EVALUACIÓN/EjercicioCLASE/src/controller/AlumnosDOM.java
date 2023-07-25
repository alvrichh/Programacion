package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.*;
import org.xml.sax.SAXException;
import model.*;

public class AlumnosDOM {

	private Document docXML;

	public AlumnosDOM(String fileName) throws Exception {
		readXML(fileName);
		writeXML(fileName);
	}
	/*
	 * LEER EL DOCUMENTO
	 */

	private void readXML(String fileName) throws Exception {

		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();

			docXML = db.parse(fileName);
			docXML.getDocumentElement().normalize();

		} catch (ParserConfigurationException e) {
			throw new Exception("FALLO. Parser de configuraci�n." + " " + e.getMessage());
		} catch (SAXException e) {
			throw new Exception("FALLO. Error SAX. " + " " + e.getMessage());
		} catch (IOException e) {
			throw new Exception("FALLO. Error accediendo al fichero: " + fileName + " " + e.getMessage());
		} catch (Exception e) {
			System.err.println("Error" + e.getMessage());

		}

	}

	private void writeXML(String fileName) throws Exception {
		try {
			Transformer t = TransformerFactory.newInstance().newTransformer();
			t.setOutputProperty(OutputKeys.METHOD, "xml");
			t.setOutputProperty(OutputKeys.ENCODING, "utf-8");
			t.transform(new DOMSource(docXML), new StreamResult(fileName));
		} catch (TransformerFactoryConfigurationError e) {
			System.err.println("Error general al escribir " + e.getMessage());
		} catch (TransformerConfigurationException e) {
			System.err.println("Error general al escribir " + e.getMessage());
		} catch (TransformerException e) {
			System.err.println("Error general al escribir " + e.getMessage());
		} catch (Exception e) {
			System.err.println("Error general al escribir " + e.getMessage());
		}
	}

	public void addAlumno(Alumno alumno) throws Exception {

		// Crear nombre
		Node nNombre_tag = docXML.createElement("nombre");
		Node nNombre_value = docXML.createTextNode(alumno.getNombre());
		nNombre_tag.appendChild(nNombre_value);
		// crear apellido
		Node nApellido_tag = docXML.createElement("apellido");
		Node nApellido_value = docXML.createTextNode(alumno.getApellido());
		nApellido_tag.appendChild(nApellido_value);
		// crear direccion
		Node nDireccion_tag = docXML.createElement("direccion");
		Node nDireccion_value = docXML.createTextNode(alumno.getDireccion());
		nDireccion_tag.appendChild(nDireccion_value);
		// creamos elemento raiz
		Node nAlumno_tag = docXML.createElement("alumno");
		nAlumno_tag.appendChild(nNombre_value);
		nAlumno_tag.appendChild(nApellido_value);
		nAlumno_tag.appendChild(nDireccion_value);
		// asignar atributo al elemento raiz
		((Element) nAlumno_tag).setAttribute("dni", alumno.getDni());

		// obtener primero nodo del documentto y se añade como hijo alumno
		Node nRaiz = docXML.getFirstChild().appendChild(nAlumno_tag);
		nRaiz.appendChild(nAlumno_tag);
	}

	public List<Alumno> getAlumnos() throws Exception {
		List<Alumno> listado = new ArrayList<Alumno>();

		try {
			String dni;
			String nombre;
			String apellido;
			String direccion;

			String expression = "/alumnos/alumno";
			NodeList nodeList = (NodeList) XPathFactory.newInstance().newXPath().compile(expression).evaluate(docXML,
					XPathConstants.NODESET);

			for (int i = 0; i < nodeList.getLength(); i++) {
				Node nNode = nodeList.item(i);

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element elemento = (Element) nNode;

					dni = elemento.getAttribute("dni");
					nombre = elemento.getElementsByTagName("nombre").item(0).getTextContent();
					apellido = elemento.getElementsByTagName("apellido").item(0).getTextContent();
					direccion = elemento.getElementsByTagName("direccion").item(0).getTextContent();

					listado.add(new Alumno(dni, nombre, apellido, direccion));
				}
			}
		} catch (XPathExpressionException e) { throw new Exception("FALLO. Error localizando ruta de la expres�n. " + " " + e.getMessage());
		} catch (Exception e) {
		}
		return listado;
	}

}
