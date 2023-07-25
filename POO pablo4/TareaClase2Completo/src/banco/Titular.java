package banco;

public class Titular {

	private String nombre;
	private String apellidos;
	private String dni;
	
	
	//Constructores
	public Titular() {
		setNombre("SinNombre");
		setApellidos("SinApellidos");
		setDni("SinDni");
	}
	
	public Titular(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}

	
	//Getters and Setters
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	
	
	@Override
	public String toString() {
		return "Titular=" + getNombre() + ", Apellidos=" + getApellidos() + ", Dni=" + getDni()
				+ "]";
	}
	
	
	
	
	
	
}
