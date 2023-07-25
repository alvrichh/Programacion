package model;

@SuppressWarnings("serial")
public class NombreNoValidoException extends Exception {

	public NombreNoValidoException() {
		super("No se admiten dígitos númericos.");
	}

}