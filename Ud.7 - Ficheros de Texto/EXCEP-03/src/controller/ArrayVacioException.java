package controller;

@SuppressWarnings("serial")
public class ArrayVacioException extends Exception {

	public ArrayVacioException() {
		super("No hay productos en la tienda.");
	}

}