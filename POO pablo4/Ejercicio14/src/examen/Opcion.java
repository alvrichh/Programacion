package examen;

public class Opcion {
	
	private String opcion;
	
	public Opcion() {
		opcion = "SINDATOS";
	}
	
	public String getOpcion() {
		return opcion;
	}

	public void setOpcion(String opcion) {
		this.opcion = opcion;
	}

	@Override
	public String toString() {
		return "Opcion [getOpcion()=" + getOpcion() + "]";
	}



}
