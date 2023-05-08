package controller;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import model.CCAA;
import model.Ciudad;
import model.Provincia;

public class XML_DOM_AEMET {

	private static Document docXML;

	public XML_DOM_AEMET(String nomFile) throws Exception {
		docXML = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(nomFile);
	}
	
	public List<CCAA> getInfo() throws Exception {
		// Obtener cada uno de los listados por separados, y luego, hacer la composición
		List<CCAA> lstCCAA      = getList("ccaa", CCAA.class);
		List<Provincia> lstProv = getList("provincia", Provincia.class);
		List<Ciudad> lstCiu     = getList("ciudad", Ciudad.class);

		// Agregar cada ciudad a la provincia a la que le corresponde:
		for(Ciudad c : lstCiu) {
			for(Provincia p : lstProv) {
				if (c.getCod_ine().substring(0, 2).equals(p.getId().substring(0, 2))) {
					p.addCiudad(c);
					break;
				}
			}
		}

		// Agregar cada provincia a la CCAA a la que le corresponde:
		for(Provincia p : lstProv) {
			for(CCAA a : lstCCAA) {
				if (p.getCcaa().equals(a.getId())) {
					a.addProvincia(p);
					break;
				}
			}
		}

		return lstCCAA;
	}

	@SuppressWarnings("rawtypes")
	private <T> List<T> getList(String tag, Class cls) throws Exception {
		List<T> listado = new ArrayList<T>();
		
		try {
			NodeList nodeList = docXML.getElementsByTagName(tag);
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

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private <T> T getObject(Element elemento, Class cls) throws Exception {
		T obj = null;
		switch (cls.getSimpleName()) {
			case "CCAA" -> {
				String id        = elemento.getAttribute("id");
				String nombre    = elemento.getAttribute("nombre");
				obj = (T) new CCAA(id,nombre);
			}
			case "Provincia" -> {
				String ccaa      = elemento.getAttribute("ccaa");
				String id        = elemento.getAttribute("id");
				String nombre    = elemento.getAttribute("nombre");
				obj = (T) new Provincia(ccaa, id, nombre);
			}
			case "Ciudad" -> {
				String capital   = elemento.getAttribute("capital");
				String cod_ine   = elemento.getAttribute("cod_ine");
				String cod_ine_m = elemento.getAttribute("cod_ine_m");
				String nombre    = elemento.getAttribute("nombre");
				Integer tmax     = Integer.parseInt(elemento.getElementsByTagName("tmax").item(0).getTextContent());
				Integer tmin     = Integer.parseInt(elemento.getElementsByTagName("tmin").item(0).getTextContent());
				obj = (T) new Ciudad(capital, cod_ine, cod_ine_m, nombre, tmax, tmin);
			}
		}
		return obj;
	}

}