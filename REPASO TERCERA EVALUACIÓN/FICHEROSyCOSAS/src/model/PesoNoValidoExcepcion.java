package model;

@SuppressWarnings("serial")
public class PesoNoValidoExcepcion extends Exception {

	private Double peso;
	
	public PesoNoValidoExcepcion(Double peso) {
		this.peso = peso;
	}
	
	@Override
	public String getMessage() {
		String message;
		message = "Peso no válido. ";
		if (peso < 50) {
			message += "No puede ser menor de 50kg.";
		}
		if (peso> 100) {
			message += "no puede ser mayor de 100kg";
		}
		return message;
	}
	
	
}
