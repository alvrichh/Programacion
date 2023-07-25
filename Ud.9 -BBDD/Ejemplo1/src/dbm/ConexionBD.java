package dbm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBD {
	
	private static Connection connection = null;
//	private static String dbName = "sampledatabsase.db";
	
	//AQUÍ PODRIAMOS AÑADIR LOS ATRIBUTOS DE UNA BASE DE DATOS, PARA LLAMAR DIRECTAMENTE
	//A LA SUPERCLASE Y CONECTAR A LA BD DEPENDIENDO DE LOS MISMOS
	//EJ:
	//ESTOS DATOS SE LEERÁN DE UN FICHERO config.txt =======
	public static String dbType;
	public static String dbName;
	public static String dbHost;
	public static String dbUser;
	public static String dbPass;
	
	public ConexionBD(String dbType, String dbName, String dbHost, String dbUser, String dbPass) {
		ConexionBD.dbType = dbType.toUpperCase();
		ConexionBD.dbName = dbName;
		ConexionBD.dbHost = dbHost;
		ConexionBD.dbUser = dbUser;
		ConexionBD.dbPass = dbPass;
	}
	
	//ABRIMOS LA CONEXIÓN MI LOCO
	public static void openConnection() {
		try {
			String cadenaConexion = switch(dbType) {
			case "SQLITE" -> cadenaConexion = "jdbc:sqlite:"+ dbName;		
			case "MYSQL" -> "jdbc:mysql://localhost:" +dbHost +"/" + dbName +"?user" + dbUser + "&password" + dbPass;
			default -> "";
			};
			connection = DriverManager.getConnection(cadenaConexion);
			connection.setAutoCommit(false);
		} catch (SQLException e) {
			System.err.println("ERROR: ABRIENDO. " + e.getMessage());
		}		
	}
	//CERRAMOS LA CONEXIÓN MI LOCO
	 
	public static void closeConnection() {
		try {
			if(connection != null)
				connection.close();
		} catch (SQLException e) {
			System.err.println("ERROR: CERRANDO." + e.getMessage());
		}
	}
	// RETORNAR UN ResultSet CON EL RESULTADO DE EJECUTAR UNA QUERY EN LA BD
	// TIEMPO MÁXIMO DE 30 SEGUNDOS
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
	// DEVOLVER UNA PREPAREDSTATEMENT SOBRE LA CONEXIÓN ACTUAL
	// 
	public static PreparedStatement preparestatement(String sql) throws SQLException{
		return connection.prepareStatement(sql);
	}
	//CONFIRMAR UNA TRANSACCIÓN
	public static void commit() {
		try {
			connection.commit();
		} catch (SQLException e) {
			System.err.println("ERROR: COMMIT" + e.getMessage());
		}
	}
	//DESHACER UNA TRANSACCIÓN
	public static void rollback() {
		try {
			connection.rollback();
		}catch(SQLException e) {
			System.err.println("ERROR: ROLLBACK " + e.getMessage());
		}
	}

}
