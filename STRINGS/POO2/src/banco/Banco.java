package banco;

public class Banco {
	private String nombre;
	private Direccion direccPostal;

	public Banco() {
		setNombre("?");
		setDireccPostal(new Direccion("?","?","?"));
	}
	//CONSTRUCTORES
	public Banco(String nombre, Direccion direccionPostal) {
		setNombre(nombre);
		setDireccPostal(direccionPostal);;
	}

	// ==============================================
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Direccion getDireccPostal() {
		return direccPostal;
	}

	public void setDireccPostal(Direccion direccPostal) {
		this.direccPostal = direccPostal;
	}

	// ===============================================
	@Override
	public String toString() {
		return "Banco [getNombre()=" + getNombre() + ", getDireccPostal()=" + getDireccPostal() + "]";
	}
}
