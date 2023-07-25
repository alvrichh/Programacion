package controller;

@SuppressWarnings("serial")
public class ProductoNoEncontradoException extends Exception {

	private String message;

	public ProductoNoEncontradoException(int code) {
		message = "Posición no válida. " + switch (code) {
												case -1 -> "No se adminte posición negativa.";
												case  0 -> "Ahí no existe producto.";
												case 99 -> "No hay hay tantos productos en la tienda.";
												default -> "";
												};
	}
	
	
	@Override
	public String getMessage() {
		return message;
	}

}