package datos;

// Generated 13-feb-2014 0:31:32 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Zonas generated by hbm2java
 */
public class Zonas implements java.io.Serializable {

	private int codigo;
	private String nombre;
	private BigDecimal tasa;
	private Set proyectoses = new HashSet(0);

	public Zonas() {
	}

	public Zonas(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public Zonas(int codigo, String nombre, BigDecimal tasa, Set proyectoses) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.tasa = tasa;
		this.proyectoses = proyectoses;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getTasa() {
		return this.tasa;
	}

	public void setTasa(BigDecimal tasa) {
		this.tasa = tasa;
	}

	public Set getProyectoses() {
		return this.proyectoses;
	}

	public void setProyectoses(Set proyectoses) {
		this.proyectoses = proyectoses;
	}

}
