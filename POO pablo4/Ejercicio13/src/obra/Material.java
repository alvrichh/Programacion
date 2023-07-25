package obra;

public class Material {

	private String descripcionMaterial;
	private String proveedor;
	private int unidades;
	private double precioUnidad;
	private int iva;

	public Material() {
		setDescripcionMaterial("SINDATOS");
		setProveedor("SINDATOS");
		setUnidades(0);
		setPrecioUnidad(0);
		setIva(0);
	}

	public Material(String descripcionMaterial, String proveedor, int unidades, double precioUnidad, int iva) {
		super();
		this.descripcionMaterial = descripcionMaterial;
		this.proveedor = proveedor;
		this.unidades = unidades;
		this.precioUnidad = precioUnidad;
		this.iva = iva;
	}

	public Material(String descripcionMaterial, int unidades, double precioUnidad, int iva) {
		super();
		this.descripcionMaterial = descripcionMaterial;
		this.unidades = unidades;
		this.precioUnidad = precioUnidad;
		this.iva = iva;
	}

	public String mostrarInformacion() {
		return "Descripcion del material: " + getDescripcionMaterial() + "\nProveedor: " + getProveedor()
				+ "\nUnidades: " + getUnidades() + "\nPrecio Unidad: " + getPrecioUnidad() + "\nIVA: " + getIva();
	}

	public String getDescripcionMaterial() {
		return descripcionMaterial;
	}

	public void setDescripcionMaterial(String descripcionMaterial) {
		this.descripcionMaterial = descripcionMaterial;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		if (getUnidades() < 1 || getUnidades() > 1000)
			this.unidades = unidades;

	}

	public double getPrecioUnidad() {
		return precioUnidad;
	}

	public void setPrecioUnidad(double precioUnidad) {
		if (getPrecioUnidad() > 0 || getPrecioUnidad() < 100000)
			this.precioUnidad = precioUnidad;

	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

}
