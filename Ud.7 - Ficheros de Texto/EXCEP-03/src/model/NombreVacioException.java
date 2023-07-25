package model;

@SuppressWarnings("serial")
public class NombreVacioException extends Exception {

	public NombreVacioException() {
		super("No se admite un nombre de producto vacío.");
	}
	
}