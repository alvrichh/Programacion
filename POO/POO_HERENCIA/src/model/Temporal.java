package model;

public class Temporal extends Empleado {
	
	private String fchInicio;
	private String fchFinal;
	
	public Temporal() {
		
	}
	
	public String getFchInicio() {
		return fchInicio;
	}
	public void setFchInicio(String fchInicio) {
		this.fchInicio = fchInicio;
	}
	public String getFchFinal() {
		return fchFinal;
	}
	public void setFchFinal(String fchFinal) {
		this.fchFinal = fchFinal;
	}
}
