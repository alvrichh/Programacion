package view;

import controller.ArrayLlenoException;
import controller.ArrayVacioException;
import controller.ProductoNoEncontradoException;
import model.NombreVacioException;
import model.PrecioNoValidoException;
import model.Producto;
import model.StockNoValidoException;

public class GestionTienda {

	public static void opcAnadir() {
		String nombre;
		Integer stockMinimo;
		Integer stockActual;
		Double precioUd;
		boolean todoCorrecto = false;

		Producto p = null;
		try {
			nombre = Util.leerString("Nombre: ");
			p = new Producto(nombre);
			try {
				stockMinimo = Util.leerInt("Stock mínimo: ");
				p.setStockMinimo(stockMinimo);
				stockActual = Util.leerInt("Stock actual: ");
				p.setStockActual(stockActual);

				try {
					precioUd = Util.leerDouble("Precio Ud.: ");
					p.setPrecioUd(precioUd);

					todoCorrecto = true;
					
				} catch (PrecioNoValidoException pe) {
					Util.escribirError(pe.getMessage());
				}

			} catch (StockNoValidoException se) {
				Util.escribirError(se.getMessage());
			}

		} catch (NombreVacioException ne) {
			Util.escribirError(ne.getMessage());
		} catch (Exception e) {
			Util.escribirError(e.getMessage());
		}

		if (todoCorrecto) {
			try {
				Principal.ControllerTienda.addProducto(p);
				Util.escribir("Producto creado con éxito.");
			} catch (ArrayLlenoException e) {
				Util.escribirError(e.getMessage());
			}
		}

	}

	public static void opcBorrar() {
		int pos;
		pos = Util.leerInt("Posición del producto a borrar: ");
		try {
			Principal.ControllerTienda.delProducto(pos);
			Util.escribir("Producto borrado con éxito.");
		} catch (ProductoNoEncontradoException e) {
			Util.escribirError(e.getMessage());
		}
	}

	public static void opcObtener() {
		int pos;
		pos = Util.leerInt("Posición del producto a obtener: ");
		try {
			Producto p = Principal.ControllerTienda.getProducto(pos);
			Util.escribir("Producto encontrado con éxito.");
			Util.escribir(p.toString());
		} catch (ProductoNoEncontradoException e) {
			Util.escribirError(e.getMessage());
		}
	}

	public static void opcListar() {
		try {
			Producto[] listado = Principal.ControllerTienda.lstProducto();
			Util.escribir("LISTADO DE PRODUCTOS EN TIENDA");
			for (int i = 0; i < listado.length; i++) {
				Util.escribir(listado[i].toString());
			}
		} catch (ArrayVacioException e) {
			Util.escribirError(e.getMessage());
		}
	}

	public static void opcValor() {
		int pos;
		pos = Util.leerInt("Posición del producto para obtener su valor almacenado: ");
		try {
			Double valor = Principal.ControllerTienda.valorProducto(pos);
			Util.escribir("Producto encontrado con éxito.");
			Util.escribir("Valor = " + valor);
		} catch (ProductoNoEncontradoException e) {
			Util.escribirError(e.getMessage());
		}
	}

}