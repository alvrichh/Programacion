package dbm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBD {

	private static Connection connection = null;
	private static String dbName = "sampledatabase.db";

	// ABRIR LA BASE DE DATOS

	public static void openConnection() throws SQLException {

		try {
			connection = DriverManager.getConnection("jdbc:sqlite:" + dbName);
			connection.setAutoCommit(false);

		} catch (SQLException e) {
			System.err.println("ERROR OPENING: " + e.getMessage());
		}
	}

	// CERRAR LA BASE DE DATOS

	public static void closeConnection() {
		try {
			if (connection != null)
				connection.close();
		} catch (SQLException e) {
			System.err.println("ERROR: CLOSING. " + e.getMessage());
		}
	}
	//RETORNAR LAS CONSULTAS
	public static ResultSet query(String sql) {
		ResultSet rs = null;
		try {
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30);
			rs = statement.executeQuery(sql);
		} catch (SQLException e) {
			System.err.println("ERROR: QUERING. " + e.getMessage());
		}
		return rs;
	}
	
	//PREPAREDSTATEMENT
	
	public static PreparedStatement prepareStatement(String sql) throws SQLException {
		return connection.prepareStatement(sql);		
	}

	//COMMIT
	public static void commit() {
		try {
			connection.commit();
		} catch (SQLException e) {
			System.err.println("ERROR: COMMIT. " + e.getMessage());
		}
	}
	
	//ROLLBACK
	public static void rollback() {
		try {
			connection.rollback();
		} catch (SQLException e) {
			System.err.println("ERROR: ROLLBACK. " + e.getMessage());
		}		
	}

}