package controller;

public class ParseDOMTemo {
	import javax.xml.parsers.DocumentBuilderFactory;
	import javax.xml.parsers.DocumentBuilder;
	import org.w3c.dom.Document;
	import org.w3c.dom.NodeList;
	import org.w3c.dom.Node;
	import org.w3c.dom.Element;
	import java.util.ArrayList;
	import java.util.List;

	    public static void main(String[] args) {
	        try {
	            // Crea un objeto DocumentBuilderFactory
	            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

	            // Crea un objeto DocumentBuilder
	            DocumentBuilder builder = factory.newDocumentBuilder();

	            // Parsea el archivo XML y crea un objeto Document
	            Document doc = builder.parse("MiDocumento.xml");

	            // Obtiene una lista de nodos "book" del documento
	            NodeList nodeList = doc.getElementsByTagName("book");

	            // Crea una lista de libros para almacenar los resultados
	            List<Book> books = new ArrayList<>();

	            // Recorre los nodos "book" y extrae la información para cada libro
	            for (int i = 0; i < nodeList.getLength(); i++) {
	                Node node = nodeList.item(i);
	                if (node.getNodeType() == Node.ELEMENT_NODE) {
	                    Element element = (Element) node;
	                    String category = element.getAttribute("category");
	                    String title = element.getElementsByTagName("title").item(0).getTextContent();
	                    String author = element.getElementsByTagName("author").item(0).getTextContent();
	                    int year = Integer.parseInt(element.getElementsByTagName("year").item(0).getTextContent());
	                    double price = Double.parseDouble(element.getElementsByTagName("price").item(0).getTextContent());
	                    Book book = new Book(category, title, author, year, price);
	                    books.add(book);
	                }
	            }

	            // Imprime la lista de libros
	            for (Book book : books) {
	                System.out.println(book.toString());
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
	