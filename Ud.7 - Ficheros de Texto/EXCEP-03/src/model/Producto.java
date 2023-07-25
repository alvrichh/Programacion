package model;

public class Producto {

	private String nombre;
	private Integer stockActual;
	private Integer stockMinimo;
	private Double precioUd;

	public Producto() throws NombreVacioException {
		setNombre("");
	}

	public Producto(String nombre) throws NombreVacioException, StockNoValidoException, PrecioNoValidoException {
		setNombre(nombre);
		setStockMinimo(0);
		setStockActual(0);
		setPrecioUd(0.0);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws NombreVacioException {
		if (nombre.length() == 0) {
			throw new NombreVacioException();
		}
		this.nombre = nombre;
	}

	public Integer getStockActual() {
		return stockActual;
	}

	public void setStockActual(Integer stockActual) throws StockNoValidoException {
		if (stockActual < getStockMinimo()) {
			throw new StockNoValidoException(0);
		}
		this.stockActual = stockActual;
	}

	public Integer getStockMinimo() {
		return stockMinimo;
	}

	public void setStockMinimo(Integer stockMinimo) throws StockNoValidoException {
		if (stockMinimo < 0) {
			throw new StockNoValidoException(-1);
		}
		this.stockMinimo = stockMinimo;
	}

	public Double getPrecioUd() {
		return precioUd;
	}

	public void setPrecioUd(Double precioUd) throws PrecioNoValidoException {
		if (precioUd < 0.0) {
			throw new PrecioNoValidoException();
		}
		this.precioUd = precioUd;
	}
	
	public Double valorAlmacenado() {
		return getStockActual() * getPrecioUd();
		
	}

	@Override
	public String toString() {
		return "Producto [Nombre=" + getNombre() + ", StockActual=" + getStockActual() + ", StockMinimo=" + getStockMinimo() + ", PrecioUd=" + getPrecioUd() + "]";
	}

}