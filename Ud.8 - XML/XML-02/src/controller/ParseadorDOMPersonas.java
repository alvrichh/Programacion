package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import model.Persona;

public class ParseadorDOMPersonas {

	public static List<Persona> parse(String nomFile) throws Exception {

		List<Persona> listado = new ArrayList<Persona>();

		try {

			Document docXML = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(nomFile);

			NodeList nodeList = docXML.getElementsByTagName("persona");

			for (int i = 0; i < nodeList.getLength(); i++) {
				Node nNode = nodeList.item(i);

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element elemento = (Element) nNode;

					String nombre = elemento.getElementsByTagName("nombre").item(0).getTextContent();
					Integer edad = Integer.parseInt(elemento.getElementsByTagName("edad").item(0).getTextContent());
					listado.add(new Persona(nombre, edad));

				}

			}
		} catch (ParserConfigurationException | SAXException | IOException e) {
			throw new Exception(e);
		}

		return listado;

	}

	public static void writeXML(String nomFile, List<Persona> listado) throws ParserConfigurationException, TransformerFactoryConfigurationError, TransformerException, SAXException, IOException {

		// Creación del documento XML y le añadiremos los datos del List
		Document docXML = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
		
		Element root = docXML.createElement("personas");
		docXML.appendChild(root);
		
		for (Persona p : listado) {
			Node nNombre = docXML.createElement("nombre");
			nNombre.appendChild(docXML.createTextNode(p.getNombre()));

			Node nEdad = docXML.createElement("edad");
			nEdad.appendChild(docXML.createTextNode(p.getEdad().toString()));

			Node nPersona = docXML.createElement("persona");
			nPersona.appendChild(nNombre);
			nPersona.appendChild(nEdad);
			
			root.appendChild(nPersona);
		}
		
		// Escribir el documento XML en el fichero
		Transformer	t = TransformerFactory.newInstance().newTransformer();
		t.setOutputProperty(OutputKeys.METHOD, "xml");
		t.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		t.transform(new DOMSource(docXML), new StreamResult(nomFile));
		
	}

}