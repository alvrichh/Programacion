package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbm.DBtienda;
import model.Empleado;

public class CtrlEmpleados {
	
	/**
	 * Obtener un listado completo. Uso de Statement

	 */
	public List<Empleado> getListadoCompleto() throws Exception {
		List<Empleado> listado = new ArrayList<Empleado>();
		try {
			DBtienda.openConnection();

			ResultSet resultadoQuery = dbm.DBtienda.query("SELECT * FROM employees");
			while (resultadoQuery.next()) {
				Empleado e = new Empleado();

				e.setEmployeeNumber(resultadoQuery.getInt("employeeNumber"));
				e.setLastName(resultadoQuery.getString("lastName"));
				e.setFirstName(resultadoQuery.getString("firstName"));
				e.setExtension(resultadoQuery.getString("extension"));
				e.setEmail(resultadoQuery.getString("email"));
				e.setOfficeCode(resultadoQuery.getString("officeCode"));
				e.setReportsTo(resultadoQuery.getInt("reportsTo"));
				e.setJobTitle(resultadoQuery.getString("jobTitle"));

				listado.add(e);
			}
		} catch (SQLException sqle) {
			throw new ControllerException("ERROR: No se puede obtener el listado completo de empleados. " + sqle.getMessage());
		}
		
		finally {
			DBtienda.closeConnection();
		}

		return listado;
	}

}