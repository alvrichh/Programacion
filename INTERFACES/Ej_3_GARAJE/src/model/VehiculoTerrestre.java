package model;

public class VehiculoTerrestre extends Vehiculo {
	
	private String matricula;
	private Integer anyoFabricacion;
	private Color color;
	
	public VehiculoTerrestre(){
		this("",0, Color.AZUL);
	}
	
	public VehiculoTerrestre(String matricula, Integer anyoFabricacion, Color color) {
		super(personasMaximas, personasActuales);
		setMatricula(matricula);
		setAnyoFabricacion(anyoFabricacion);
		setColor(color);
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Integer getAnyoFabricacion() {
		return anyoFabricacion;
	}
	public void setAnyoFabricacion(Integer anyoFabricacion) {
		this.anyoFabricacion = anyoFabricacion;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}

}
