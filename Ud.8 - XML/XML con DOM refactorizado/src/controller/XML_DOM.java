package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.XMLConstants;
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

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import model.Arbitro;
import model.Jugador;

public class XML_DOM {

	/**
	 * En el objeto docXML se almacena todo el fichero XML
	 */
	private Document docXML;
	
	/**
	 * El método constructor inicia la lectura del fichero XML
	 */
	public XML_DOM(String fileName) throws Exception {
		readXML(fileName);
	}

	/**
	 * Leer el fichero XML y lo guarda en el objeto docXML
	 */
	private void readXML(String fileName) throws Exception {
		try {
			// Abrir el fichero XML
	        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
	          
	        // La siguiente propiedad es opcional pero recomendada. Previene ataques como XML External Entities (XXE)
	        docBuilderFactory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);

	        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
			docXML = docBuilder.parse(fileName);
			docXML.getDocumentElement().normalize();
		}
		catch (ParserConfigurationException e) { throw new Exception("FALLO. Parser de configuración." + " " + e.getMessage()); }
		catch (SAXException e)                 { throw new Exception("FALLO. Error SAX. " + " " + e.getMessage()); }
		catch (IOException e)                  { throw new Exception("FALLO. Error accediendo al fichero: " + fileName+ " " + e.getMessage()); }
		catch (Exception e)                    { throw new Exception("FALLO. General." + " " + e.getMessage()); }
	}

	/**
	 * Estribe el objeto docXML en un fichero 
	 */
	public void writeXML(String fileName) throws Exception {
		try {
			Transformer	t = TransformerFactory.newInstance().newTransformer();
			t.setOutputProperty(OutputKeys.METHOD, "xml");
			t.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
//			t.setOutputProperty(OutputKeys.INDENT, "yes");
//			t.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
			t.transform(new DOMSource(docXML), new StreamResult(fileName));
		}
		catch (TransformerFactoryConfigurationError e) { throw new Exception("FALLO. No se puede configurar la factoría."+ " " + e.getMessage()); }
		catch (TransformerConfigurationException e)    { throw new Exception("FALLO. No se puede transformar la configuración."+ " " + e.getMessage()); }
		catch (TransformerException e)                 { throw new Exception("FALLO. No se puede transformar el contenido."+ " " + e.getMessage()); }
		catch (Exception e)                            { throw new Exception("FALLO. General."+ " " + e.getMessage()); }
	}
	
	/**
	 * Borra del objeto docXML el nodo de tipo Jugador cuyo valor de número se pasa por parámetro  
	 */
	public boolean delJugador(Integer numero) throws Exception {
		boolean borrado = false;
		
		try {
			// Obtener todo los nodos de tipo jugador
			NodeList nodeList = getNodeList("/game/jugador");
	
			Integer num;
	        for (int i = 0; i < nodeList.getLength(); i++) {
				Node nNode = nodeList.item(i);
				// Nos aseguramos que el nodo es de tipo Element
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element elemento = (Element) nNode;
					num = Integer.parseInt(elemento.getAttribute("numero"));
					// Si el atributo número del jugador coincide con el del parámetro entonces se borra del docXML
					if (num.equals(numero)) {
	                    docXML.getDocumentElement().removeChild(nNode);
	                    borrado = true;
	                    break;
					}
				}
	
	        }
		}
		catch (XPathExpressionException e) { throw new Exception("FALLO. Error localizando ruta de la expresión. " + " " + e.getMessage()); }
		catch (Exception e)                { throw new Exception("FALLO. General." + " " + e.getMessage()); }

		return borrado;
	}

	/**
	 * Añade al docXML un nuevo nodo de tipo jugador, según el objeto que se pasa por parámetro 
	 */
	public void addJugador(Jugador jugador) {

		// Crear un elemento <nombre>
		Node nNombre = docXML.createElement("nombre");
		Node nNombre_txt = docXML.createTextNode(jugador.getNombre());
		nNombre.appendChild(nNombre_txt);

		// Crear un elemento <apellidos> (simplificando el código Java)
		Node nApellidos = docXML.createElement("apellidos");
		nApellidos.appendChild(docXML.createTextNode(jugador.getApellidos()));

		// Crear un elemento <nick>
		Node nNick = docXML.createElement("nick");
		nNick.appendChild(docXML.createTextNode(jugador.getNick()));

		// Crear un elemento <puntos>
		Node nPuntos = docXML.createElement("puntos");
		nPuntos.appendChild(docXML.createTextNode(jugador.getPuntos().toString()));

		// Crear un elemento <jugador> que será el nodo raiz
		Node nJugador = docXML.createElement("jugador");

			//... se le añade el atributo "numero"
			((Element) nJugador).setAttribute("numero", jugador.getNumero().toString());
	
			//... se le añaden los elementos anteriores
			nJugador.appendChild(nNombre);
			nJugador.appendChild(nApellidos);
			nJugador.appendChild(nNick);
			nJugador.appendChild(nPuntos);

		// Se obtiene el primer nodo del documento y se le añade, como hijo, el elemento Jugador
		Node nRaiz = docXML.getFirstChild();
		nRaiz.appendChild(nJugador);

		// De una forma equivalente, pero simplificada:
		// docXML.getFirstChild().appendChild(nJugador);
	}
	
	/**
	 *  Obtiene un List de objetos Jugador
	 */
	public List<Jugador> getJugadores() throws Exception {
		return getList("/game/jugador", Jugador.class);
	}

	/**
	 *  Obtiene un List de objetos Arbitro
	 */
	public List<Arbitro> getArbitros() throws Exception {
		return getList("/game/arbitro", Arbitro.class);
	}
	
	/**
	 *  Recupera un listado de nodos del docXML según una expresión de búsqueda
	 */
	private NodeList getNodeList(String expression) throws XPathExpressionException {
		return (NodeList) XPathFactory.newInstance().newXPath().compile(expression).evaluate(docXML, XPathConstants.NODESET);
	}
	
	/**
	 * Obtiene del docXML, según una expresión de búsqueda, un List del tipo de objetos que se indiquen
	 */
	@SuppressWarnings("rawtypes")
	private <T> List<T> getList(String expression, Class cls) throws Exception {
		List<T> listado = new ArrayList<T>();
		
		try {
			NodeList nodeList = getNodeList(expression);
			for (int i = 0; i < nodeList.getLength(); i++) {
				Node nNode = nodeList.item(i);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					listado.add( getObject((Element) nNode, cls) );
				}
			}
		}
		catch (XPathExpressionException e) { throw new Exception("FALLO. Error localizando ruta de la expresión. " + " " + e.getMessage()); }
		catch (Exception e)                { throw new Exception("FALLO. General." + " " + e.getMessage()); }

		return listado;
	}

	/**
	 * Devuelve un objeto del tipo que se indique, extrayendo los valores de un Element 
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private <T> T getObject(Element elemento, Class cls) throws Exception {
		T obj = null;
		switch (cls.getSimpleName()) {
			case "Jugador":
				obj = (T) new Jugador( Integer.parseInt(elemento.getAttribute("numero"))
		                             , elemento.getElementsByTagName("nombre").item(0).getTextContent()
		                             , elemento.getElementsByTagName("apellidos").item(0).getTextContent()
		                             , elemento.getElementsByTagName("nick").item(0).getTextContent()
		                             , Integer.parseInt(elemento.getElementsByTagName("puntos").item(0).getTextContent())
		                             );
				break;
			case "Arbitro":
				obj = (T) new Arbitro( Integer.parseInt(elemento.getAttribute("colegiado"))
		                             , elemento.getElementsByTagName("nombre").item(0).getTextContent()
		                             , elemento.getElementsByTagName("ciudad").item(0).getTextContent()
		                             );
				break;
		}
		return obj;
	}

}