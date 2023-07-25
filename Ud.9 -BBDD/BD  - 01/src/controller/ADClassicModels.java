package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bdm.ConexionBD;
import model.Employees;
import model.Offices;

public class ADClassicModels {

	public List<Employees> getFullListEmployees() throws ControllerException {
		List<Employees> listado = new ArrayList<Employees>();
		try {
			ConexionBD.openConnection();

			ResultSet resultadoQuery = ConexionBD.query("SELECT * FROM employees");
			while (resultadoQuery.next()) {
				Employees elemento = new Employees();

				elemento.setEmployeeNumber(resultadoQuery.getInt("employeeNumber"));
				elemento.setLastName(resultadoQuery.getString("lastName"));
				elemento.setFirstName(resultadoQuery.getString("firstName"));
				elemento.setExtension(resultadoQuery.getString("extension"));
				elemento.setEmail(resultadoQuery.getString("email"));
				elemento.setOfficeCode(resultadoQuery.getString("officeCode"));
				elemento.setReportsTo(resultadoQuery.getInt("reportsTo"));
				elemento.setJobTitle(resultadoQuery.getString("jobTitle"));

				listado.add(elemento);
			}
		} catch (SQLException sqle) {
			throw new ControllerException("ERROR: No se puede obtener el listado. " + sqle.getMessage());
		}

		finally {
			ConexionBD.closeConnection();
		}

		return listado;
	}
	
	public List<Offices> getFullListOffices() throws ControllerException {
		List<Offices> listado = new ArrayList<Offices>();
		try {
			ConexionBD.openConnection();

			ResultSet resultadoQuery = ConexionBD.query("SELECT * FROM offices");
			while (resultadoQuery.next()) {
				Offices elemento = new Offices();

				elemento.setOfficeCode(resultadoQuery.getString("officeCode"));
				elemento.setCity(resultadoQuery.getString("city"));
				elemento.setPhone(resultadoQuery.getString("phone"));
				elemento.setAddressLine1(resultadoQuery.getString("addressLine1"));
				elemento.setAddressLine2(resultadoQuery.getString("addressLine2"));
				elemento.setState(resultadoQuery.getString("state"));
				elemento.setCountry(resultadoQuery.getString("country"));
				elemento.setPostalCode(resultadoQuery.getString("postalCode"));
				elemento.setTerritory(resultadoQuery.getString("territory"));

				listado.add(elemento);
			}
		} catch (SQLException sqle) {
			throw new ControllerException("ERROR: No se puede obtener el listado. " + sqle.getMessage());
		}

		finally {
			ConexionBD.closeConnection();
		}

		return listado;
	}

}