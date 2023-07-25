package examen;

public class Opositor {
	private static int cantidadOpositores = 0;
	private static int cantidadNecesitanAdaptacion = 0;
	private String nombre;
	private String apellidos;
	private int añoNacimiento;
	private boolean requiereAdaptacion;
	private String descripcionAdaptacion;

	public Opositor(){
		setNombre("SINDATOS");
		setApellidos("SINDATOS");
		setAñoNacimiento(0);
		setRequiereAdaptacion(false);
		setDescripcionAdaptacion("SINDATOS");
		
	}

	
	public Opositor(String nombre, String apellidos, int añoNacimiento, boolean requiereAdaptacion,
			String descripcionAdaptacion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.añoNacimiento = añoNacimiento;
		this.requiereAdaptacion = requiereAdaptacion;
		this.descripcionAdaptacion = descripcionAdaptacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getAñoNacimiento() {
		return añoNacimiento;
	}

	public void setAñoNacimiento(int añoNacimiento) {
		this.añoNacimiento = añoNacimiento;
	}

	public boolean isRequiereAdaptacion() {
		return requiereAdaptacion;
	}

	public void setRequiereAdaptacion(boolean requiereAdaptacion) {
		setCantidadNecesitanAdaptacion(getCantidadNecesitanAdaptacion() + 1);
		this.requiereAdaptacion = requiereAdaptacion;
	}

	public String getDescripcionAdaptacion() {
		return descripcionAdaptacion;
	}

	public void setDescripcionAdaptacion(String descripcionAdaptacion) {
		if (requiereAdaptacion)
			this.descripcionAdaptacion = descripcionAdaptacion;

	}

	public static int getCantidadNecesitanAdaptacion() {
		return cantidadNecesitanAdaptacion;
	}

	public static void setCantidadNecesitanAdaptacion(int cantidadNecesitanAdaptacion) {
		Opositor.cantidadNecesitanAdaptacion = cantidadNecesitanAdaptacion;
	}

	public static int getCantidadOpositores() {
		return cantidadOpositores;
	}

	public static void setCantidadOpositores(int cantidadOpositores) {
		Opositor.cantidadOpositores = cantidadOpositores;
	}

	@Override
	public String toString() {
		return "Opositor [getNombre()=" + getNombre() + ", getApellidos()=" + getApellidos() + ", getAñoNacimiento()="
				+ getAñoNacimiento() + ", isRequiereAdaptacion()=" + isRequiereAdaptacion()
				+ ", getDescripcionAdaptacion()=" + getDescripcionAdaptacion() + "]";
	}

}
