package controller;

import java.io.FileReader;

import org.xml.sax.helpers.DefaultHandler;

public class LeerJSON {
	

	LeerJSON(){
		
	LeerJSON parser = new LeerJSON();

	try (FileReader reader = new FileReader("viviendas.json")) {



	  } catch (Exception e) {
	  System.err.println("Error al leer el archivo" + e.getMessage());;
	}
}

}