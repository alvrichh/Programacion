package model;

@SuppressWarnings("serial")
public class EdadNoValidaExcepcion extends Exception {

	private Integer edad;
	
	public EdadNoValidaExcepcion(Integer edad) {
		this.edad = edad; 
		
	}
	
	@Override
	public String getMessage() {
		String message;
		message = "Edad no válida. ";
		if (edad < 18) {
			message += "No puede ser menor de edad.";
		}
		if (edad > 99) {
			message += "No puede ser mayor de 100";
		}
		return message;
	}

}
