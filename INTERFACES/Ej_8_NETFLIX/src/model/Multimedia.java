package model;

public class Multimedia {
	private static Integer contador = 0;
	private Integer codigo;
	private boolean finalizado;
	
	private String titulo;
	private Integer year;

	public Multimedia() {
		
	}
	
	public Multimedia(String titulo) {
		contador++;
		finalizado = false;
		setCodigo(contador);
	}

	public static Integer getContador() {
		return contador;
	}

	public static void setContador(Integer contador) {
		Multimedia.contador = contador;
	}

	public Integer getCodigo() {
		return codigo;
	}

	private void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Codigo" + getCodigo() + ", Finalizado" + isFinalizado() + ", Titulo"
				+ getTitulo() + ", Año" + getYear() + "]";
	}

}
