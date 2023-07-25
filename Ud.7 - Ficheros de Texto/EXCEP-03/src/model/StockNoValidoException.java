package model;

@SuppressWarnings("serial")
public class StockNoValidoException extends Exception {

	private String message = "";

	public StockNoValidoException() {
		super("Valor de stock no válido.");
	}

	public StockNoValidoException(int code) {
		message = "Stock no válido. " + switch (code) {
											case -1 -> "No puede ser negativo.";
											case  0 -> "No puede ser menor que el stock mínimo.";
											default -> "";
											};
	}

	@Override
	public String getMessage() {
		return message;
	}

}