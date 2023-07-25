package view;

import java.util.List;

import controller.ControllerException;
import controller.CtrlPedidos;
import controller.InsertarProductoEnPedidoException;
import controller.ProductoNoEncontradoException;
import model.OrderDetail;
import model.Product;

public class GestPedidos {

	static CtrlPedidos ctrlP = new CtrlPedidos();

	/**
	 * Añadir un producto a un pedido
	 */
	public static void addProductoEnPedido() {

		Integer orderNumber;
		String productCode;
		Integer quantityOrdered;
		Double priceEach;
		Integer orderLineNumber;

		Product p = null;

		Boolean existe = null;

		// PEDIR EL NÚMERO DEL PEDIDO.
		// Requisito: El pedido debe existir
		do {
			orderNumber = Util.leerInt("\nIntroduzca número del pedido: "); // Ej. 10100
			try {
				existe = ctrlP.existsOrder(orderNumber);
			} catch (ControllerException e) {
				Util.escribirError("Error consultado si existe ese pedido." + e.getMessage());
			}
			if (!existe) Util.escribir("No existe ese pedido.");
		} while (!existe);
		
		// PEDIR EL CÓDIGO DEL PRODUCTO.
		// Requisito: El producto debe existir
		do {
			productCode = Util.leerString("\nIntroduzca código del producto: "); // Ej. S10_1678
			try {
				p = ctrlP.getProductByCode(productCode);
				existe = (p != null);
			} catch (ControllerException | ProductoNoEncontradoException e) {
				Util.escribirError("Error consultado si existe ese producto." + e.getMessage());
			}
			if (!existe)
				Util.escribir("No existe ese producto.");
		} while (!existe);

		// PEDIR LA CANTIDAD DE ESE PRODUCTO.
		// Requisito 1: la cantidad debe ser positiva
		// Requisito 2: ese producto debe tener stock suficiente
		boolean cantidadValida;
		do {
			quantityOrdered = Util.leerInt("\nCantidad = ");
			cantidadValida = true;
			if (quantityOrdered <= 0) {
				cantidadValida = false;
				Util.escribir("La cantidad debe ser positiva.");
			}
			if (quantityOrdered > p.getQuantityInStock()) {
				cantidadValida = false;
				Util.escribir("La cantidad debe ser no puede superar el sotock actual (" + p.getQuantityInStock() + ").");
			}

		} while (!cantidadValida);

		// OBTENER EL MSRP ACTUAL DEL PRODUCTO.
		/*
		 * MSRP es un acrónimo de “Manufacturer Suggested Retail Price” (precio sugerido
		 * de venta al público del fabricante). Es decir, es el precio que el fabricante
		 * de autos sugiere a un concesionario sobre un vehículo.
		 */
		priceEach = p.getMsrp();

		// OBTENER EL SIGUIENTE NUMERO DE LINEA DE PEDIDO
		// Estrategia 1: consultar cuál es el número de líneas que ya tiene el pedido
		// Estrategia 2: Obtener el listado de detalles y conocer el número de elementos en la lista
		try {
			orderLineNumber = ctrlP.lastOrderLineNumber(orderNumber);			// Estrategia 1
			orderLineNumber = ctrlP.getListadoOrderDetalis(orderNumber).size();	// Estrategia 2

			orderLineNumber++;
		} catch (ControllerException e) {
			orderLineNumber = 0;
		}

		OrderDetail od = new OrderDetail();
		od.setOrderNumber(orderNumber);
		od.setProductCode(productCode);
		od.setQuantityOrdered(quantityOrdered);
		od.setPriceEach(priceEach);
		od.setOrderLineNumber(orderLineNumber);

		try {

			ctrlP.addProductoEnPedido(od);
			Util.escribir("\nProducto insertado con éxito.");

		} catch (ControllerException | InsertarProductoEnPedidoException e) {
			Util.escribirError("Error añadiendo el producto al pedido." + e.getMessage());
		}

	}

	/**
	 * Mostrar con detalle los datos de un pedido, dado su número. Incluyendo el
	 * importe total del mismo.
	 */
	public static void mostrarDetallePedido() {
		try {
			System.out.println("\n");
			Integer orderNumber = Util.leerInt("Introduzca número de pedido: "); // Ej. 10100
			List<OrderDetail> listadoDetallePedido = ctrlP.getListadoOrderDetalis(orderNumber);
			if (listadoDetallePedido.size() == 0) {
				Util.escribir("El pedido " + orderNumber + " no tiene asociado productos.");
			} else {
				// cabecera del pedido
				Util.escribir("\nLinea\tCant\tPrecio\tProducto");
				Util.escribir("-----\t----\t------\t------------------------");
				// líneas de detalle
				Double suma = 0.0;
				for (OrderDetail detalle : listadoDetallePedido) {
					try {
						Product p = ctrlP.getProductByCode(detalle.getProductCode());

						Util.escribirEnLinea(detalle.getOrderLineNumber().toString());
						Util.escribirEnLinea("\t" + detalle.getQuantityOrdered());
						Util.escribirEnLinea("\t" + detalle.getPriceEach());
						Util.escribir("\t" + p.getProductName());

						suma += detalle.getPriceEach() * detalle.getQuantityOrdered();
					} catch (ProductoNoEncontradoException e) {
						Util.escribirError("No se ha podido encontrar el producto: " + detalle.getProductCode());
					}
				}
				// pie del pedido
				System.out.printf("\nImporte total del pedido = %.2f \n", suma);
			}
		} catch (ControllerException e) {
			Util.escribirError(e.getMessage());
		}

	}

}