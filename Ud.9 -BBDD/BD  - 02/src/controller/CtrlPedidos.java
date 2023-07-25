package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bdm.ConexionBD;
import model.OrderDetail;
import model.Product;

public class CtrlPedidos {

	/**
	 * Obtener el listado completo de OrderDetails.
	 */
	public List<OrderDetail> getListadoOrderDetalis(Integer orderNumber) throws ControllerException {
		List<OrderDetail> listado = new ArrayList<OrderDetail>();
		try {
			ConexionBD.openConnection();

			ResultSet resultadoQuery = ConexionBD.query("SELECT * FROM orderdetails WHERE orderNumber = " + orderNumber + " ORDER BY orderlinenumber");
			while (resultadoQuery.next()) {
				OrderDetail elemento = new OrderDetail();

				elemento.setOrderNumber(resultadoQuery.getInt("orderNumber"));
				elemento.setProductCode(resultadoQuery.getString("productCode"));
				elemento.setQuantityOrdered(resultadoQuery.getInt("quantityOrdered"));
				elemento.setPriceEach(resultadoQuery.getDouble("priceEach"));
				elemento.setOrderLineNumber(resultadoQuery.getInt("orderLineNumber"));

				listado.add(elemento);
			}
		} catch (SQLException sqle) {
			throw new ControllerException("ERROR: No se puede obtener el listado completo. " + sqle.getMessage());
		}

		finally {
			ConexionBD.closeConnection();
		}

		return listado;
	}

	/**
	 * Obtener un objeto Producto.
	 */
	public Product getProductByCode(String code) throws ProductoNoEncontradoException, ControllerException {

		Product p = null;

		try {
			ConexionBD.openConnection();

			ResultSet resultadoQuery = ConexionBD.query("SELECT * FROM products WHERE productCode = '" + code + "'");
			if (resultadoQuery.next()) {
				p = new Product();

				p.setProductCode(resultadoQuery.getString("productCode"));
				p.setProductName(resultadoQuery.getString("productName"));
				p.setProductLine(resultadoQuery.getString("productLine"));
				p.setProductScale(resultadoQuery.getString("productScale"));
				p.setProductVendor(resultadoQuery.getString("productVendor"));
				p.setProductDescription(resultadoQuery.getString("productDescription"));
				p.setQuantityInStock(resultadoQuery.getInt("quantityInStock"));
				p.setBuyPrice(resultadoQuery.getDouble("buyPrice"));
				p.setMsrp(resultadoQuery.getDouble("MSRP"));

			} else {
				throw new ProductoNoEncontradoException(code);
			}
		} catch (SQLException sqle) {
			throw new ControllerException("ERROR: No se puede obtener el producto. " + sqle.getMessage());
		}

		finally {
			ConexionBD.closeConnection();
		}

		return p;
	}

	/**
	 * Determinar si existe un Pedido
	 */
	public boolean existsOrder(Integer orderNumber) throws ControllerException {

		boolean existe = false;

		try {
			ConexionBD.openConnection();
			ResultSet resultadoQuery = ConexionBD.query("SELECT COUNT(*) FROM orders WHERE ordernumber = " + orderNumber);
			resultadoQuery.next();
			existe = (resultadoQuery.getInt(1) != 0);
		} catch (SQLException sqle) {
			throw new ControllerException("ERROR: No se puede consultar el pedido. " + sqle.getMessage());
		}

		finally {
			ConexionBD.closeConnection();
		}

		return existe;
	}

	/**
	 * Determinar si existe un Producto
	 */
	public boolean existsProduct(String productCode) throws ControllerException {

		boolean existe = false;

		try {
			ConexionBD.openConnection();
			ResultSet resultadoQuery = ConexionBD.query("SELECT COUNT(*) FROM products WHERE productcode = '" + productCode + "'");
			resultadoQuery.next();
			existe = (resultadoQuery.getInt(1) != 0);
		} catch (SQLException sqle) {
			throw new ControllerException("ERROR: No se puede consultar el producto. " + sqle.getMessage());
		}

		finally {
			ConexionBD.closeConnection();
		}

		return existe;
	}

	/**
	 * Obtener cuál es el último número de línea en los detalles de un determinado pedido
	 */
	public Integer lastOrderLineNumber(Integer orderNumber) throws ControllerException {
		Integer nextLine = null;

		try {
			ConexionBD.openConnection();
			ResultSet resultadoQuery = ConexionBD.query("SELECT MAX(orderLineNumber) FROM orderdetails WHERE orderNumber = " + orderNumber);
			resultadoQuery.next();
			nextLine = resultadoQuery.getInt(1);
		} catch (SQLException sqle) {
			throw new ControllerException("ERROR: No se puede consultar el los detalles del pedido. " + sqle.getMessage());
		}

		finally {
			ConexionBD.closeConnection();
		}

		return nextLine;
	}

	/**
	 * Añadir un producto a un pedido (línea de detalle de un pedido)
	 */
	public void addProductoEnPedido(OrderDetail od) throws InsertarProductoEnPedidoException, ControllerException {
		try {
			ConexionBD.openConnection();
			String sql;
			PreparedStatement prepStatement;
			
			// Agregar línea de detalle
			sql = "INSERT INTO orderdetails VALUES (?, ?, ?, ?, ?)";
			prepStatement = ConexionBD.prepareStatement(sql);

			prepStatement.setInt(1, od.getOrderNumber());
			prepStatement.setString(2, od.getProductCode());
			prepStatement.setInt(3, od.getQuantityOrdered());
			prepStatement.setDouble(4, od.getPriceEach());
			prepStatement.setInt(5, od.getOrderLineNumber());

			prepStatement.executeUpdate();

			// Actualizar el stock del producto
			sql = "UPDATE products SET quantityInStock = quantityInStock - ?";
			prepStatement = ConexionBD.prepareStatement(sql);

			prepStatement.setInt(1, od.getQuantityOrdered());
			
			prepStatement.executeUpdate();

			ConexionBD.commit();
		} catch (SQLException sqle) {
			ConexionBD.rollback();
			throw new ControllerException("ERROR: No se puede insertar el cliente. " + sqle.getMessage());
		}

		finally {
			ConexionBD.closeConnection();
		}
		
	}

}