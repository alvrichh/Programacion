package ferroviaria.maquinaria;

import java.util.Arrays;

import ferroviaria.personal.Maquinista;

public class Tren {

	private Vagon[] vagones = new Vagon[5];
	private Maquinista maquinista;
	
	public Tren() {
		maquinista = new Maquinista();
		for (int i = 0; i < vagones.length; i++) {
			vagones[i] = new Vagon();
		}
	}

	public Vagon[] getVagones() {
		return vagones;
	}

	public void setVagones(Vagon[] vagones) {
		this.vagones = vagones;
	}

	public Maquinista getMaquinista() {
		return maquinista;
	}

	public void setMaquinista(Maquinista maquinista) {
		this.maquinista = maquinista;
	}

	@Override
	public String toString() {
		return "Tren [getVagones()=" + Arrays.toString(getVagones()) + ", getMaquinista()=" + getMaquinista() + "]";
	}
	
	
}
