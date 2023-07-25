package dbm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBtienda {

	public static String dbType;
	public static String dbName;
	public static String dbHost;
	public static String dbUser;
	public static String dbPass;

	private static Connection connection = null;

	/**
	 * Guardar los parámetros de conexión a la BD 
	 */
	public DBtienda(String dbType, String dbName, String dbhost, String dbUser, String dbPass) {
		DBtienda.dbType = dbType.toUpperCase();
		DBtienda.dbName = dbName;
		DBtienda.dbUser = dbUser;
		DBtienda.dbPass = dbPass;
	}

	/**
	 * Abrir una conexión con la BD
	 */
	public static void openConnection() {
		try {
			String cadenaConexion = switch (dbType) {
				case "SQLITE" -> "jdbc:sqlite:" + dbName;
				case "MYSQL"  -> "jdbc:mysql://localhost/" + dbName + "?user=" + dbUser + "&password=" + dbPass;
				default       -> "";
			};
			connection = DriverManager.getConnection(cadenaConexion);
			connection.setAutoCommit(false);
		} catch (SQLException e) {
			System.err.println("ERROR: OPENING. " + e.getMessage());
		}
	}

	/**
	 * Cerrar la conexión con la BD
	 */
	public static void closeConnection() {
		try {
			if (connection != null)
				connection.close();
		} catch (SQLException e) {
			System.err.println("ERROR: CLOSING. " + e.getMessage());
		}
	}

	/**
	 * Retornar un ResultSet con el resultado de ejecutar una Query en la BD (tiempo máximo de espera = 30 segundos)
	 */
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
	
	/**
	 * Devolver una PreparedStatement sobre la conexión actual 
	 */
	public static PreparedStatement prepareStatement(String sql) throws SQLException {
		return connection.prepareStatement(sql);		
	}

	/**
	 * Confirmar una transacción
	 */
	public static void commit() {
		try {
			connection.commit();
		} catch (SQLException e) {
			System.err.println("ERROR: COMMIT. " + e.getMessage());
		}
	}

	/**
	 * Deshacer una transacción
	 */
	public static void rollback() {
		try {
			connection.rollback();
		} catch (SQLException e) {
			System.err.println("ERROR: ROLLBACK. " + e.getMessage());
		}		
	}

}
