package unico;

public class Coche {

	// ATRIBUTOS
	private String matricula;
	private Integer potencia;
	private Double velocidad;
	

	public Coche() {
		setMatricula("sin especificar");
		setPotencia(0);
		setVelocidad(0.0);
	}

	// CONSTRUCTORES
	public Coche(String matricula) {
		setMatricula(matricula);
		setPotencia(0);
		setVelocidad(0.0);

	}

	public Coche(String matricula, Integer potencia) {
		setMatricula(matricula);
		setPotencia(potencia);
	}

	public Coche(String matricula, Integer potencia, Double velocidad) {
		setMatricula(matricula);
		setPotencia(potencia);
		setVelocidad(velocidad);
	}

	// SETTERS
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setPotencia(Integer potencia) {
		this.potencia = potencia;
	}

	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}

	// GETTERS
	public String getMatricula() {
		return this.matricula;
	}

	public int getPotencia() {
		return this.potencia;
	}

	public Double getVelocidad() {
		return this.velocidad;
	}

	// FUNCIONALIDADES
	public void parar() {
		setVelocidad(0.0);
	}

	public void acelerar(Double velocidad) {
		setVelocidad(getVelocidad() + velocidad);
	}

	public void frenar(Double velocidad) {
		if (getVelocidad() - velocidad < 0.0) {
			setVelocidad(0.0);
		} else {
			setVelocidad(getVelocidad() - velocidad);
		}
	}

	@Override
	public String toString() {
		String txt = "";
		txt = "Matrícula: " + getMatricula() + "\nPotencia: " + getPotencia() + "\nVelocidad: " + getVelocidad();
		return txt;
	}
}
