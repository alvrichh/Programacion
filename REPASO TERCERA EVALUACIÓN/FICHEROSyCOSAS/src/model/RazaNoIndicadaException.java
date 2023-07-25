package model;

@SuppressWarnings("serial")
public class RazaNoIndicadaException extends Exception {

	private String raza;
	
	public RazaNoIndicadaException(String raza) {
		this.raza = raza;
	}
	
	@Override
	public String getMessage() {
		String message = "Debe indicar una raza";
		return message;
	}
}