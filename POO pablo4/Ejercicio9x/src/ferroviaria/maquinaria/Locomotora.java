package ferroviaria.maquinaria;

import ferroviaria.personal.Mecanico;

public class Locomotora {

	private String matricula;
	private double potenciaMotor;
	private int añoFabricacion;
	private Mecanico mecanico;
	
	public Locomotora() {
		 mecanico = new Mecanico();
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getPotenciaMotor() {
		return potenciaMotor;
	}

	public void setPotenciaMotor(double potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}

	public int getAñoFabricacion() {
		return añoFabricacion;
	}

	public void setAñoFabricacion(int añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}

	public Mecanico getMecanico() {
		return mecanico;
	}

	public void setMecanico(Mecanico mecanico) {
		this.mecanico = mecanico;
	}

	@Override
	public String toString() {
		return "Locomotora [getMatricula()=" + getMatricula() + ", getPotenciaMotor()=" + getPotenciaMotor()
				+ ", getAñoFabricacion()=" + getAñoFabricacion() + ", getMecanico()=" + getMecanico() + "]";
	}
	
	
}
