package ferroviaria.maquinaria;

import ferroviaria.personal.Maquinista;

public class Tren {
	public final int TOT_VAGONES = 5;
	
	private Locomotora locomotora;
	private Vagon vagon[];
	private Maquinista maquinista;
	
	public Tren() {
		vagon = new Vagon[TOT_VAGONES];
	}
	
	// =========GETTERS Y SETTERS==========


	public Locomotora getLocomotora() {
		return locomotora;
	}

	public void setLocomotora(Locomotora locomotora) {
		this.locomotora = locomotora;
	}

	public Vagon[] getVagon() {
		return vagon;
	}

	public void setVagon(Vagon[] vagon) {
		this.vagon = vagon;
	}

	public Maquinista getMaquinista() {
		return maquinista;
	}

	public void setMaquinista(Maquinista maquinista) {
		this.maquinista = maquinista;
	}

	public int getTOT_VAGONES() {
		return TOT_VAGONES;
	}
	
}
