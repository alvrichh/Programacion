package banco;

public class Persona {
	private String nombre;
	private String apellidos;
	private String DNI;
	private Direccion direccFiscal;
	
	public Persona() {
		setNombre("?");
		setApellidos("?");
		setDNI("?"); 
		setDireccFiscal(new Direccion("?","?","?"));
		
	}
	public Persona(String nombre, String apellidos, String DNI, Direccion direccFiscal) {
		setNombre(nombre);
		setApellidos(apellidos);
		setDNI(DNI);
		setDireccFiscal(direccFiscal);
	}
	@Override
	public String toString() {
		return "Titular [nombre=" + getNombre() + ", apellidos=" + getApellidos() + ", DNI=" + getDNI() + "]";
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
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public Direccion getDireccFiscal() {
		return direccFiscal;
	}
	public void setDireccFiscal(Direccion direccFiscal) {
		this.direccFiscal = direccFiscal;
	}	
}
