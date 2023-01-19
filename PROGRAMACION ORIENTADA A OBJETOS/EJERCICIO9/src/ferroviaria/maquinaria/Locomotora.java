package ferroviaria.maquinaria;

public class Locomotora {
	private String matricula;
	private Integer potenciaMotor;
	private Integer anoFabricacion;
	
	public Locomotora() {
		
	}
	
	// =========GETTERS Y SETTERS==========

	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Integer getPotenciaMotor() {
		return potenciaMotor;
	}
	public void setPotenciaMotor(Integer potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}
	public Integer getAnoFabricacion() {
		return anoFabricacion;
	}
	public void setAnoFabricacion(Integer anoFabricacion) {
		this.anoFabricacion = anoFabricacion;
	}
	
	
	
}
