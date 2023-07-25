package controller;

import model.Customer;

@SuppressWarnings("serial")
public class InsertarClienteException extends Exception {

	public InsertarClienteException(Customer c) {
		super("No se ha podido eliminar el cliente: " + c.getCustomerNumber());
	}

}