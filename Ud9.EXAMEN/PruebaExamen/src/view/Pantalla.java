package view;

import java.util.List;

import controller.CTRLProduct;
import model.Products;

public class Pantalla {

	public static void main(String[] args) {
		
		//MOSTRAR LISTA POR PANTALLA
		mostrarListado();
		
	}

	public static void mostrarListado() {
		try {
			
		CTRLProduct ctrl = new CTRLProduct();
		List<Products> listado = ctrl.getListaProductos();
		listado.stream().forEach(System.out::println);
	}catch (Exception e) {
		System.err.println(e.getMessage());
		}

	}
}
