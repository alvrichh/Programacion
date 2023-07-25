package datos;

// Generated 13-feb-2014 0:31:32 by Hibernate Tools 3.4.0.CR1

/**
 * Gestion generated by hbm2java
 */
public class Gestion implements java.io.Serializable {

	private GestionId id;
	private Piezas piezas;
	private Proveedores proveedores;
	private Proyectos proyectos;
	private Integer cantidad;

	public Gestion() {
	}

	public Gestion(GestionId id, Piezas piezas, Proveedores proveedores,
			Proyectos proyectos) {
		this.id = id;
		this.piezas = piezas;
		this.proveedores = proveedores;
		this.proyectos = proyectos;
	}

	public Gestion(GestionId id, Piezas piezas, Proveedores proveedores,
			Proyectos proyectos, Integer cantidad) {
		this.id = id;
		this.piezas = piezas;
		this.proveedores = proveedores;
		this.proyectos = proyectos;
		this.cantidad = cantidad;
	}

	public GestionId getId() {
		return this.id;
	}

	public void setId(GestionId id) {
		this.id = id;
	}

	public Piezas getPiezas() {
		return this.piezas;
	}

	public void setPiezas(Piezas piezas) {
		this.piezas = piezas;
	}

	public Proveedores getProveedores() {
		return this.proveedores;
	}

	public void setProveedores(Proveedores proveedores) {
		this.proveedores = proveedores;
	}

	public Proyectos getProyectos() {
		return this.proyectos;
	}

	public void setProyectos(Proyectos proyectos) {
		this.proyectos = proyectos;
	}

	public Integer getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

}
