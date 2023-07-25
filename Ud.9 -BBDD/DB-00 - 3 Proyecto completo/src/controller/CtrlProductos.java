package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import dbm.DBtienda;
import model.Producto;
import model.Empleado;
import model.LineaDeProductos;

public class CtrlProductos {

	/**
	 * Obtener un listado completo. Uso de Statement
	 */
	public List<Producto> getListadoCompleto() throws ControllerException {

		List<Producto> listado = new ArrayList<Producto>();

		try {
			DBtienda.openConnection();

			ResultSet resultadoQuery = DBtienda.query("SELECT * FROM products");
			while (resultadoQuery.next()) {
				Producto p = new Producto();

				p.setProductCode(resultadoQuery.getString("productCode"));
				p.setProductName(resultadoQuery.getString("productName"));
				p.setProductLine(resultadoQuery.getString("productLine"));
				p.setProductScale(resultadoQuery.getString("productScale"));
				p.setProductVendor(resultadoQuery.getString("productVendor"));
				p.setProductDescription(resultadoQuery.getString("productDescription"));
				p.setQuantityInStock(resultadoQuery.getInt("quantityInStock"));
				p.setBuyPrice(resultadoQuery.getDouble("buyPrice"));
				p.setMsrp(resultadoQuery.getDouble("MSRP"));

				listado.add(p);
			}
		} catch (SQLException sqle) {
			throw new ControllerException("ERROR: No se puede obtener el listado completo de productos. " + sqle.getMessage());
		}
		
		finally {
			DBtienda.closeConnection();
		}

		return listado;
	}

	/**
	 * Obtener un listado parametrizado. Uso de Statement
	 */
	public List<Producto> getProductosConStockSuperiorA(Integer stock) throws ControllerException {

		List<Producto> listado = new ArrayList<Producto>();

		try {
			DBtienda.openConnection();

			ResultSet resultadoQuery = DBtienda.query("SELECT * FROM products WHERE quantityInStock > " + stock);
			while (resultadoQuery.next()) {
				Producto p = new Producto();

				p.setProductCode(resultadoQuery.getString("productCode"));
				p.setProductName(resultadoQuery.getString("productName"));
				p.setProductLine(resultadoQuery.getString("productLine"));
				p.setProductScale(resultadoQuery.getString("productScale"));
				p.setProductVendor(resultadoQuery.getString("productVendor"));
				p.setProductDescription(resultadoQuery.getString("productDescription"));
				p.setQuantityInStock(resultadoQuery.getInt("quantityInStock"));
				p.setBuyPrice(resultadoQuery.getDouble("buyPrice"));
				p.setMsrp(resultadoQuery.getDouble("MSRP"));

				listado.add(p);
			}
		} catch (SQLException sqle) {
			throw new ControllerException("ERROR: No se puede obtener el listado de productos. " + sqle.getMessage());
		}
		
		finally {
			DBtienda.closeConnection();
		}

		return listado;
	}

	
	/**
	 * Obtener un objeto Producto. Uso de Statement
	 */
	public Producto getProductoPorCodigo(String code) throws ProductoNoEncontradoException, ControllerException {

		Producto p = null;

		try {
			DBtienda.openConnection();

			ResultSet resultadoQuery = DBtienda.query("SELECT * FROM products WHERE productCode = '" + code + "'");
			if (resultadoQuery.next()) {
				p = new Producto();

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
			DBtienda.closeConnection();
		}

		return p;
	}
	
	/**
	 * Obtener un listado con sublistado. Uso de Statement
	 * Versión 1:
	 *   Primero se obtienen todas las categorías
	 *   Segundo se buscan los productos para cada una de ellas
	 */
	public Map<LineaDeProductos, List<Producto>> getProductosPorCategoriaV1() throws ControllerException {

		Map<LineaDeProductos, List<Producto>> mapa = new TreeMap<LineaDeProductos, List<Producto>>();

		try {
			DBtienda.openConnection();

			ResultSet resultadoQuery;

			resultadoQuery = DBtienda.query("SELECT * FROM productlines ORDER BY productLine");
			while (resultadoQuery.next()) {
				LineaDeProductos pl = new LineaDeProductos();

				pl.setProductLine(resultadoQuery.getString("productLine"));
				pl.setTextDescription(resultadoQuery.getString("textDescription"));
				pl.setHtmlDescription(resultadoQuery.getString("htmlDescription"));

				mapa.put(pl, new ArrayList<Producto>());
			}

			for (LineaDeProductos pl : mapa.keySet()) {
				List<Producto> lst = new ArrayList<Producto>();

				resultadoQuery = DBtienda.query("SELECT * FROM products WHERE productLine = '" + pl.getProductLine() + "' ORDER BY productCode");
				while (resultadoQuery.next()) {
					Producto p = new Producto();

					p.setProductCode(resultadoQuery.getString("productCode"));
					p.setProductName(resultadoQuery.getString("productName"));
					p.setProductLine(resultadoQuery.getString("productLine"));
					p.setProductScale(resultadoQuery.getString("productScale"));
					p.setProductVendor(resultadoQuery.getString("productVendor"));
					p.setProductDescription(resultadoQuery.getString("productDescription"));
					p.setQuantityInStock(resultadoQuery.getInt("quantityInStock"));
					p.setBuyPrice(resultadoQuery.getDouble("buyPrice"));
					p.setMsrp(resultadoQuery.getDouble("MSRP"));

					lst.add(p);
				}

				mapa.put(pl, lst);

			}
		} catch (SQLException sqle) {
			throw new ControllerException("ERROR: No se puede obtener el listado productos por Línea de productos. " + sqle.getMessage());
		}
		
		finally {
			DBtienda.closeConnection();
		}

		return mapa;
	}

	/**
	 * Obtener un listado con sublistado. Uso de Statement
	 * 	 Versión 2:
	 *   Se hace una Query de ambas tablas (categorías y productos)
	 *   y se va creando el mapa simultáneamente (key[categoría]+value[producto])
	 */
	public Map<LineaDeProductos, List<Producto>> getProductosPorCategoriaV2() throws ControllerException {

		Map<LineaDeProductos, List<Producto>> mapa = new TreeMap<LineaDeProductos, List<Producto>>();

		try {
			DBtienda.openConnection();

			String sql = " SELECT pl.*, p.*"
			           + " FROM productlines AS pl, products AS P"
					   + " WHERE pl.productLine = p.productLine"
			           + " ORDER BY pl.productLine, p.productCode";

			ResultSet resultadoQuery = DBtienda.query(sql);

			while (resultadoQuery.next()) {

				LineaDeProductos pl = new LineaDeProductos();

				pl.setProductLine(resultadoQuery.getString("productLine"));
				pl.setTextDescription(resultadoQuery.getString("textDescription"));
				pl.setHtmlDescription(resultadoQuery.getString("htmlDescription"));

				Producto p = new Producto();

				p.setProductCode(resultadoQuery.getString("productCode"));
				p.setProductName(resultadoQuery.getString("productName"));
				p.setProductLine(resultadoQuery.getString("productLine"));
				p.setProductScale(resultadoQuery.getString("productScale"));
				p.setProductVendor(resultadoQuery.getString("productVendor"));
				p.setProductDescription(resultadoQuery.getString("productDescription"));
				p.setQuantityInStock(resultadoQuery.getInt("quantityInStock"));
				p.setBuyPrice(resultadoQuery.getDouble("buyPrice"));
				p.setMsrp(resultadoQuery.getDouble("MSRP"));
				
				List<Producto> lst = mapa.get(pl);
				if (lst == null) {
					lst = new ArrayList<Producto>();
				}
				lst.add(p);
				mapa.put(pl, lst);

			}
		} catch (SQLException sqle) {
			throw new ControllerException("ERROR: No se puede obtener el listado productos por Línea de productos. " + sqle.getMessage());
		}
		
		finally {
			DBtienda.closeConnection();
		}

		return mapa;
	}

	/**
	 * Añadir un producto. Uso de PreparedStatement
	 */
	public void addProducto(Producto p) throws InsertarProductoException, ControllerException {
		try {
			DBtienda.openConnection();

			String sql = "INSERT INTO products VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement prepStatement = DBtienda.prepareStatement(sql);
			
			prepStatement.setString(1, p.getProductCode());
			prepStatement.setString(2, p.getProductName());
			prepStatement.setString(3, p.getProductLine());
			prepStatement.setString(4, p.getProductScale());
			prepStatement.setString(5, p.getProductVendor());
			prepStatement.setString(6, p.getProductDescription());
			prepStatement.setInt(7, p.getQuantityInStock());
			prepStatement.setDouble(8, p.getBuyPrice());
			prepStatement.setDouble(9, p.getMsrp());

			int filasInsertadas = prepStatement.executeUpdate();
			if (filasInsertadas == 0) throw new InsertarProductoException(p);

			DBtienda.commit();
		} catch (SQLException sqle) {
			DBtienda.rollback();
			throw new ControllerException("ERROR: No se puede insertar el producto. " + sqle.getMessage());
		}
		
		finally {
			DBtienda.closeConnection();
		}
	}

	/**
	 * Borrar un producto. Uso de PreparedStatement
	 */
	public void delProducto(Producto p) throws EliminarProductoException, ControllerException {
		try {
			DBtienda.openConnection();

			String sql = "DELETE FROM products WHERE productCode = ?";
			PreparedStatement prepStatement = DBtienda.prepareStatement(sql);

			prepStatement.setString(1, p.getProductCode());

			int filasEliminadas = prepStatement.executeUpdate();
			if (filasEliminadas == 0) throw new EliminarProductoException(p);

			DBtienda.commit();
		} catch (SQLException sqle) {
			DBtienda.rollback();
			throw new ControllerException("ERROR: No se puede borrar el producto. " + sqle.getMessage());
		}
		
		finally {
			DBtienda.closeConnection();
		}
	}

	/**
	 * Teorizando sobre las transacciones utilizando PreparedStatement
	 */
	public boolean doCosas(Producto p, Empleado e) throws ControllerException {

		boolean todoOK = false;

		try {
			DBtienda.openConnection();

			PreparedStatement prepStatement;
			String sql;

			sql = "INSERT INTO productsOutOfStock VALUES(?, ?, ?)";
			prepStatement = DBtienda.prepareStatement(sql);
			prepStatement.setString(1, p.getProductDescription());
			prepStatement.setInt(2, p.getQuantityInStock());
			prepStatement.setDouble(3, p.getBuyPrice());
			prepStatement.executeUpdate();
			
			sql = "DELETE FROM products WHERE productCode = ?";
			prepStatement = DBtienda.prepareStatement(sql);
			prepStatement.setString(1, p.getProductCode());
			prepStatement.executeUpdate();

			sql = "UPDATE FROM others WHERE field1 = ? AND field2 = ?";
			prepStatement = DBtienda.prepareStatement(sql);
			prepStatement.setString(1, p.getProductCode());
			prepStatement.setString(2, p.getProductName());
			prepStatement.executeUpdate();

			DBtienda.commit();
			todoOK = true;

		} catch (SQLException sqle) {
			DBtienda.rollback();
			throw new ControllerException("ERROR: No se puede realizar la transacción entre productos y clientes. " + sqle.getMessage());
		}
		
		finally {
			DBtienda.closeConnection();
		}

		return todoOK;
	}

}