package view;

import java.util.ArrayList;
import java.util.List;

import model.*;
import controller.*;
public class Principal {
	
	public static void main(String[] args) {
	
		List<Vivienda> viviendas = new ArrayList<Vivienda>();

		for (Vivienda vivienda : viviendas) {
		    System.out.println("id: " + vivienda.getId());
		    System.out.println("precio: " + vivienda.getPrecio());
		    System.out.println("zonas:");

		    for (Zona zona : vivienda.getZonas()) {
		        System.out.println("- " + zona);
		    }

		}

	}



}
