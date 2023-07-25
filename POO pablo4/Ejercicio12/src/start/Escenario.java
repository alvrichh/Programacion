package start;

import java.util.Arrays;
import java.util.Scanner;

public class Escenario {

	private double pixelesAltura;
	private double pixelesLongitud;
	private int numeroAnillos;
	private int numeroGemas;
	private TipoEnemigo[] tipoEnemigo;
	private Enemigo[] enemigo = new Enemigo[10];

	// Constructores
	public Escenario() {

	}

	public Escenario(TipoEnemigo tipoEnemigo) {
		setPixelesAltura(100);
		setPixelesLongitud(100);
		setNumeroAnillos(500);
		setNumeroGemas(2);

	}
	public Escenario(int nEnemigos) {
		setPixelesAltura(100);
		setPixelesLongitud(100);
		setNumeroAnillos(500);
		setNumeroGemas(2);
		for (int i = 0; i < nEnemigos; i++) {
			enemigo[i] = new Enemigo();
		}
		
	}

	// Metodos

	public void generarEnemigo(TipoEnemigo tipoEnemigo) {
		for (int i = 0; i < enemigo.length; i++) {
			if (enemigo[i] != null)
				enemigo[i] = new Enemigo(tipoEnemigo);
		}
	}

	public void eliminarEnemigo() {
		Scanner entrada = new Scanner(System.in);
		int opc;
		System.out.println("Lista de enemigos");
		for (int i = 0; i < enemigo.length; i++) {
			System.out.println(i + 1 + "." + enemigo[i]);
		}
		opc = Integer.parseInt(entrada.nextLine());
		for (int i = 0; i < enemigo.length; i++) {
			if (i + 1 == opc)
				enemigo[i + 1] = null;
		}
	}

	public String infoEscenario() {
		return "Tamaño en altura: " + getPixelesAltura() + "\nTamaño en longitud: " + getPixelesLongitud()
				+ "\nAnillos: " + getNumeroAnillos() + "\nGemas: " + getNumeroGemas() + "\nTipos de enemigos: "
				+ tipoEnemigo + "\nEnemigos: " + enemigo.toString();
	}

	// GETSET

	public double getPixelesAltura() {
		return pixelesAltura;
	}

	public void setPixelesAltura(double pixelesAltura) {
		this.pixelesAltura = pixelesAltura;
	}

	public double getPixelesLongitud() {
		return pixelesLongitud;
	}

	public void setPixelesLongitud(double pixelesLongitud) {
		this.pixelesLongitud = pixelesLongitud;
	}

	public int getNumeroAnillos() {
		return numeroAnillos;
	}

	public void setNumeroAnillos(int numeroAnillos) {
		this.numeroAnillos = numeroAnillos;
	}

	public int getNumeroGemas() {
		return numeroGemas;
	}

	public void setNumeroGemas(int numeroGemas) {
		this.numeroGemas = numeroGemas;
	}

	public TipoEnemigo[] getTipoEnemigo() {
		return tipoEnemigo;
	}

	public void setTipoEnemigo(TipoEnemigo[] tipoEnemigo) {
		this.tipoEnemigo = tipoEnemigo;
	}

	public Enemigo[] getEnemigo() {
		return enemigo;
	}

	public void setEnemigo(Enemigo[] enemigo) {
		this.enemigo = enemigo;
	}

	@Override
	public String toString() {
		return "Escenario [getPixelesAltura()=" + getPixelesAltura() + ", getPixelesLongitud()=" + getPixelesLongitud()
				+ ", getNumeroAnillos()=" + getNumeroAnillos() + ", getNumeroGemas()=" + getNumeroGemas()
				+ ", getTipoEnemigo()=" + Arrays.toString(getTipoEnemigo()) + ", getEnemigo()="
				+ Arrays.toString(getEnemigo()) + "]";
	}

}
