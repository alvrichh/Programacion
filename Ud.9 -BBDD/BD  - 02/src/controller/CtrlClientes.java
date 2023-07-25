package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bdm.ConexionBD;
import model.Customer;

public class CtrlClientes {

	static CtrlClientes ctrlC = new CtrlClientes();

	/**
	 * Insertar un cliente.
	 */
	public void insertarCliente(Customer c) throws InsertarClienteException, ControllerException {
		try {
			ConexionBD.openConnection();

			String sql = "INSERT INTO customers VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement prepStatement = ConexionBD.prepareStatement(sql);

			prepStatement.setInt(1, c.getCustomerNumber());
			prepStatement.setString(2, c.getCustomerName());
			prepStatement.setString(3, c.getContactFirstName());
			prepStatement.setString(4, c.getContactLastName());
			prepStatement.setString(5, c.getPhone());
			prepStatement.setString(6, c.getAddressLine1());
			prepStatement.setString(7, c.getAddressLine2());
			prepStatement.setString(8, c.getCity());
			prepStatement.setString(9, c.getState());
			prepStatement.setString(10, c.getPostalCode());
			prepStatement.setString(11, c.getCountry());
			prepStatement.setInt(12, c.getSalesRepEmployeeNumber());
			prepStatement.setDouble(13, c.getCreditLimit());

			int filasInsertadas = prepStatement.executeUpdate();
			if (filasInsertadas == 0) throw new InsertarClienteException(c);

			ConexionBD.commit();
		} catch (SQLException sqle) {
			ConexionBD.rollback();
			throw new ControllerException("ERROR: No se puede insertar el cliente. " + sqle.getMessage());
		}

		finally {
			ConexionBD.closeConnection();
		}
	}

	/**
	 * Determinar si existe un Cliente.
	 */
	public boolean existsCustomer(Integer customerNumber) throws ControllerException {

		boolean existe = false;

		try {
			ConexionBD.openConnection();
			ResultSet resultadoQuery = ConexionBD.query("SELECT COUNT(*) FROM customers WHERE customerNumber = " + customerNumber);
			resultadoQuery.next();
			existe = (resultadoQuery.getInt(1) != 0);
		} catch (SQLException sqle) {
			throw new ControllerException("ERROR: No se puede consultar el cliente. " + sqle.getMessage());
		}

		finally {
			ConexionBD.closeConnection();
		}

		return existe;
	}
	
	/**
	 * Determinar si existe un Empleado
	 */
	public boolean existsEmployee(Integer emnployeeNumber) throws ControllerException {

		boolean existe = false;

		try {
			ConexionBD.openConnection();
			ResultSet resultadoQuery = ConexionBD.query("SELECT COUNT(*) FROM employees WHERE employeeNumber = " + emnployeeNumber);
			resultadoQuery.next();
			existe = (resultadoQuery.getInt(1) != 0);
		} catch (SQLException sqle) {
			throw new ControllerException("ERROR: No se puede consultar el empleado. " + sqle.getMessage());
		}

		finally {
			ConexionBD.closeConnection();
		}

		return existe;
	}

	public void asignarEmpleadoCliente(Integer customerNumber, Integer salesRepEmployeeNumber) throws ControllerException, AsignarEmpleadoClienteException {
		try {
			ConexionBD.openConnection();

			String sql = "UPDATE customers SET salesRepEmployeeNumber = ? WHERE customerNumber = ?";
			PreparedStatement prepStatement = ConexionBD.prepareStatement(sql);

			prepStatement.setInt(1, salesRepEmployeeNumber);
			prepStatement.setInt(2, customerNumber);

			int filasInsertadas = prepStatement.executeUpdate();
			if (filasInsertadas == 0) throw new AsignarEmpleadoClienteException();

			ConexionBD.commit();
		} catch (SQLException sqle) {
			ConexionBD.rollback();
			throw new ControllerException("ERROR: No se puede asignar ese cliente a ese empleado. " + sqle.getMessage());
		}

		finally {
			ConexionBD.closeConnection();
		}
	}

}