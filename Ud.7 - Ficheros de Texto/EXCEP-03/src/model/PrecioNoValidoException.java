package model;

@SuppressWarnings("serial")
public class PrecioNoValidoException extends Exception {

	public PrecioNoValidoException() {
		super("Precio no puede ser menor que cero.");
	}

}