package view;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import controller.EliminarProductoException;
import controller.ControllerException;
import controller.CtrlProductos;
import controller.ProductoNoEncontradoException;
import model.Producto;
import model.LineaDeProductos;

public class GestProductos {

	static CtrlProductos ctrlP = new CtrlProductos();

	/**
	 * Mostrar el listado completo de productos
	 */
	static void mostrarListadoCompleto() {
		try {
			List<Producto> listado = ctrlP.getListadoCompleto();
			listado.stream().forEach(System.out::println);
		} catch (ControllerException e) {
			Util.escribirError(e.getMessage());
		}
	}

	/**
	 * Mostrar el listado de productos filtrado al stock
	 */
	static void mostrarListadoFiltro() {
		try {
			Integer stock = Util.leerInt("Stock superior a: ");
			List<Producto> listado = ctrlP.getProductosConStockSuperiorA(stock);
			listado.stream().forEach(System.out::println);
		} catch (ControllerException e) {
			Util.escribirError(e.getMessage());
		}
	}

	/**
	 * Mostrar los productos por categoría
	 */
	static void mostrarProductosPorCategoria() {
		try {
			Map<LineaDeProductos, List<Producto>> mapa = ctrlP.getProductosPorCategoriaV2();
			for (Entry<LineaDeProductos, List<Producto>> entry : mapa.entrySet()) {
				Util.escribir("\n" + "LINEA DE PRODUCTO: " + entry.getKey().getProductLine());
				for (Producto p : entry.getValue()) {
					Util.escribir("\t" + "PRODUCTO:" + "[" + p.getProductCode() + "] " + p.getProductName());
				}
			}
		} catch (ControllerException e) {
			Util.escribirError(e.getMessage());
		}

	}

	/**
	 * Pedir al usuario por el código de un producto Obtener ese producto de la BD
	 * Mostrar ese producto
	 */
	static void obtenerUnProducto() {
		try {
			String code = Util.leerString("Escriba el code: ");
			Producto p = ctrlP.getProductoPorCodigo(code);
			Util.escribir(p.toString());
		} catch (ProductoNoEncontradoException e) {
			Util.escribir(e.getMessage());
		} catch (ControllerException e) {
			Util.escribirError(e.getMessage());
		}
		
	}

	/**
	 * Pedir al usuario por el código de un producto Obtener ese producto de la BD
	 * Borrar ese productode la BD
	 */
	static void eliminarUnProducto() {
		try {
			String code = Util.leerString("Escriba el code: ");
			Producto p = ctrlP.getProductoPorCodigo(code);
			ctrlP.delProducto(p);
			Util.escribir("Se ha eliminado correctamente el producto: " + p);
		} catch (ProductoNoEncontradoException e) {
			Util.escribir(e.getMessage());
		} catch (EliminarProductoException e) {
			Util.escribir(e.getMessage());
		} catch (ControllerException e) {
			Util.escribirError(e.getMessage());
		}
	}

	/**
	 * Pedir todos los datos de un producto para insertarlo en la BD
	 */
	static void insertarUnProducto() {
	}

}