package view;

import controller.AsignarEmpleadoClienteException;
import controller.ControllerException;
import controller.CtrlClientes;
import controller.InsertarClienteException;
import model.Customer;

public class GestClientes {

	static CtrlClientes ctrlC = new CtrlClientes();

	/**
	 * Insertar un nuevo cliente
	 */
	public static void insertarCliente() {

		Integer customerNumber;
		String customerName;
		String contactFirstName;
		String contactLastName;
		String phone;
		String addressLine1;
		String addressLine2;
		String city;
		String state;
		String postalCode;
		String country;
		Integer salesRepEmployeeNumber;
		Double creditLimit;
		
		Boolean existe = null;

		// PEDIR NUMERO DEL CLIENTE
		// Requisito: El cliente no debe existir
		do {
			customerNumber = Util.leerInt("\nNúmero del Cliente: ");
			try {
				existe = ctrlC.existsCustomer(customerNumber);
			} catch (ControllerException e) {
				Util.escribirError("Error consultado si ya existe ese cliente." + e.getMessage());
			}
			if (existe) Util.escribir("Ya existe otro cliente con ese mismo número.");
		} while (existe);
		
		customerName = Util.leerString("Nombre completo      = ");
		contactFirstName = Util.leerString("Nombre de contacto   = ");
		contactLastName = Util.leerString("Apellidos de contacto= ");
		phone = Util.leerString("Teléfono             = ");
		addressLine1 = Util.leerString("Dirección (línea 1)  = ");
		addressLine2 = Util.leerString("Dirección (línea 2)  = ");
		city = Util.leerString("Ciudad               = ");
		state = Util.leerString("Estado               = ");
		postalCode = Util.leerString("Código Postal        = ");
		country = Util.leerString("País                 = ");

		// PEDIR NUMERO DEL EMPLEADO ASIGNADO
		// Requisito: El empleado debe existir
		do {
			salesRepEmployeeNumber = Util.leerInt("Representa a empleado= ");
			try {
				existe = ctrlC.existsEmployee(salesRepEmployeeNumber);
			} catch (ControllerException e) {
				Util.escribirError("Error consultado si existe ese empleado" + e.getMessage());
			}
			if (!existe) Util.escribir("No existe ese empleado.");
		} while (!existe);
		
		// PEDIR LÍMITE DE CRÉDIO
		// Requisito: Debe ser positivo
		do {
			creditLimit = Util.leerDouble("Límite de crédito    = ");
			if (creditLimit <= 0) Util.escribir("El valor debe ser positivo.");
		} while (creditLimit <= 0);
		

		Customer c = new Customer();
		c.setCustomerNumber(customerNumber);
		c.setCustomerName(customerName);
		c.setContactFirstName(contactFirstName);
		c.setContactLastName(contactLastName);
		c.setPhone(phone);
		c.setAddressLine1(addressLine1);
		c.setAddressLine2(addressLine2);
		c.setCity(city);
		c.setState(state);
		c.setPostalCode(postalCode);
		c.setCountry(country);
		c.setSalesRepEmployeeNumber(salesRepEmployeeNumber);
		c.setCreditLimit(creditLimit);

		try {
			
			ctrlC.insertarCliente(c);
			Util.escribir("El cliente ha sido insertado con éxito.");
			
		} catch (InsertarClienteException e) {
			Util.escribirError(e.getMessage());
		} catch (ControllerException e) {
			Util.escribirError(e.getMessage());
		}

	}

	/**
	 * Asignar un empleado a un cliente
	 */
	public static void asignarEmpleadoCliente() {
		Integer customerNumber;
		Integer salesRepEmployeeNumber;

		Boolean existe = null;
		
		// PEDIR NUMERO DEL CLIENTE
		// Requisito: El cliente debe existir
		do {
			customerNumber = Util.leerInt("\nNúmero del Cliente: ");
			try {
				existe = ctrlC.existsCustomer(customerNumber);
			} catch (ControllerException e) {
				Util.escribirError("Error consultado si ya existe ese cliente." + e.getMessage());
			}
			if (!existe) Util.escribir("No existe ese cliente.");
		} while (!existe);
		
		// PEDIR NUMERO DEL EMPLEADO ASIGNADO
		// Requisito: El empleado debe existir
		do {
			salesRepEmployeeNumber = Util.leerInt("Representa a empleado= ");
			try {
				existe = ctrlC.existsEmployee(salesRepEmployeeNumber);
			} catch (ControllerException e) {
				Util.escribirError("Error consultado si existe ese empleado" + e.getMessage());
			}
			if (!existe) Util.escribir("No existe ese empleado.");
		} while (!existe);
		
		try {
			
			ctrlC.asignarEmpleadoCliente(customerNumber, salesRepEmployeeNumber);
			Util.escribir("El cliente ha sido asignado al empleado con éxito.");
			
		} catch (AsignarEmpleadoClienteException e) {
			Util.escribirError(e.getMessage());
		} catch (ControllerException e) {
			Util.escribirError(e.getMessage());
		}
	}

}