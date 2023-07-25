package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal {

	public static void main(String[] args) {		
		
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(cadenaConexion);
			
			Statement statement = connection.createStatement();
			
			ResultSet rs = statement.executeQuery("SELECT * FROM employees");
			
			while (rs.next()) {
				System.out.println("\nNúmero de empleado = " + rs.getInt(1));
				System.out.println("Nombre del empleado" + rs.getString(2));
			}
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}
}