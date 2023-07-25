package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbm.ConexionBD;
import model.Products;

public class CTRLProduct {

	public static List<Products> getListaProductos() {
		List<Products> listado = new ArrayList<Products>();
		try {
			ConexionBD.openConnection();
			ResultSet resultadoQuery = ConexionBD.query("SELECT * FROM products");
			while (resultadoQuery.next()) {
				Products elemento = new Products();
				elemento.setProductCode(resultadoQuery.getString("productCode"));
				elemento.setProductName(resultadoQuery.getString("productName"));
				elemento.setProductLine(resultadoQuery.getString("productLine"));
				elemento.setProductVendor(resultadoQuery.getString("productVendor"));
				elemento.setProductDescription(resultadoQuery.getString("productDescription"));
				elemento.setQuantityInStock(resultadoQuery.getInt("quantityInStock"));
				elemento.setBuyPrice(resultadoQuery.getInt("buyPrice"));
				elemento.setMSRP(resultadoQuery.getInt("MSRP"));

				listado.add(elemento);
			}
		} catch (SQLException e) {
			System.err.println("ERROR AL CONECTAR " + e.getMessage());
		}

		finally {
			ConexionBD.closeConnection();
		}

		return listado;
	}

}
