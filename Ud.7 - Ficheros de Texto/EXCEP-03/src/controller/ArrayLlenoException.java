package controller;

@SuppressWarnings("serial")
public class ArrayLlenoException extends Exception {

	public ArrayLlenoException() {
		super("No se puede añadir el producto. Tiena llena.");
	}

}