package model.bco;

public class Banco {

	private String nombre;
	private Direccion direccFiscal;

	public Banco() {
		setNombre("");
		setDireccFiscal(new Direccion());
	}

	public Banco(String nombre, Direccion direccFiscal) {
		setNombre(nombre);
		setDireccFiscal(direccFiscal);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Direccion getDireccFiscal() {
		return direccFiscal;
	}

	public void setDireccFiscal(Direccion direccFiscal) {
		this.direccFiscal = direccFiscal;
	}

	@Override
	public String toString() {
		return "Banco [getNombre()=" + getNombre() + ", getDireccFiscal()=" + getDireccFiscal() + "]";
	}

}