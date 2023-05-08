package model;

public class Jugador {

	private Integer numero;
	private String nombre;
	private String apellidos;
	private String nick;
	private Integer puntos;

	public Jugador() {
	}

	public Jugador(Integer numero, String nombre, String apellidos, String nick, Integer puntos) {
		setNumero(numero);
		setNombre(nombre);
		setApellidos(apellidos);
		setNick(nick);
		setPuntos(puntos);
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
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

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public Integer getPuntos() {
		return puntos;
	}

	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}

	@Override
	public String toString() {
		return "Jugador [numero=" + numero + ", nombre=" + nombre + ", apellidos=" + apellidos + ", nick=" + nick + ", puntos=" + puntos + "]";
	}

}