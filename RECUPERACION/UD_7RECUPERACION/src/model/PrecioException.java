package model;

@SuppressWarnings("serial")
public class PrecioException extends Exception {
	

	public PrecioException(Double precio) {
			String mensaje = "";
			if(precio < 0) {
				mensaje = "ERROR en el  precio, el precio no puede ser negativo";
				System.out.println(mensaje);
			}
			if(precio> 50000.00) {
				mensaje =  "ERROR en el  precio, el precio no puede ser menos de 50000.00";
				System.out.println(mensaje);
			}
		}

	}

