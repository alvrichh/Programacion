package controller;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class RecorridoDOM {

	private Document docXML;

	public RecorridoDOM(String nomFile) throws SAXException, IOException, ParserConfigurationException {
		docXML = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(nomFile);
	}

	public List<String> numNodosHijos() {
		List<String> nodos = new ArrayList<String>();

		// Obtener el elemento raíz
		Node raiz = docXML.getDocumentElement();
		// Obtener la lista de nodos hijos del elemento raíz
		NodeList hijos = raiz.getChildNodes();
		// Obtener el número de nodos hijos
		int totalNodosHijos = hijos.getLength();

		for (int i = 0; i < totalNodosHijos; i++) {
			Node nNode = hijos.item(i);
			nodos.add(getNodeType(nNode));
		}

		return nodos;
	}

	public String getNodeType(Node node) {
		String type;
		switch (node.getNodeType()) {
			case Node.ELEMENT_NODE           -> type = "Element";
			case Node.ATTRIBUTE_NODE         -> type = "Attribute";
			case Node.TEXT_NODE              -> type = "Text";
			case Node.CDATA_SECTION_NODE     -> type = "CData section";
			case Node.ENTITY_REFERENCE_NODE  -> type = "Entity reference";
			case Node.ENTITY_NODE            -> type = "Entity";
			case Node.PROCESSING_INSTRUCTION_NODE -> type = "Processing instruction";
			case Node.COMMENT_NODE           -> type = "Comment";
			case Node.DOCUMENT_NODE          -> type = "Document";
			case Node.DOCUMENT_TYPE_NODE     -> type = "Document type";
			case Node.DOCUMENT_FRAGMENT_NODE -> type = "Document fragment";
			case Node.NOTATION_NODE          -> type = "Notation";
			default                          -> type = "???";
		}
		return type;
	}

	public String getXML() throws TransformerException {
	    TransformerFactory transformerFactory = TransformerFactory.newInstance();
	    Transformer transformer = transformerFactory.newTransformer();
	    transformer.setOutputProperty("indent", "yes");
	    transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
	    DOMSource source = new DOMSource(docXML);
	    
	    StringWriter outWriter = new StringWriter();
	    StreamResult result = new StreamResult( outWriter  );
//	    StreamResult result = new StreamResult( System.out );
	    transformer.transform(source, result);

	    String finalString = outWriter.getBuffer().toString();
		return finalString;
	}

	public List<String> mostrarContenidoEtiqueta(String tag) {
		List<String> listado = new ArrayList<String>();

		Node raiz = docXML.getDocumentElement();
		NodeList nodeList = raiz.getChildNodes();

		for (int i = 0; i < nodeList.getLength(); i++) {
			Node nNode = nodeList.item(i);

			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element elemento = (Element) nNode;
				String valor = elemento.getElementsByTagName(tag).item(0).getTextContent();
				listado.add(valor);
			}

		}

		return listado;
	}

}