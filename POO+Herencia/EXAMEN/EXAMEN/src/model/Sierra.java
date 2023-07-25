package model;

public class Sierra extends Herramienta {
	private int diametroSierra;

	public Sierra(String nombre, int masa, int capacidadQuemarse, int capacidadDiluirse, boolean movible,int diametroSierra) {
		super(nombre, masa, capacidadQuemarse, capacidadDiluirse);
		this.diametroSierra = diametroSierra;
	}

	public int getDiametroSierra() {
		return diametroSierra;
	}

	public void setDiametroSierra(int diametroSierra) {
		this.diametroSierra = diametroSierra;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "Tipo: Sierra" + "\n" + "Diámetro de la sierra: " + diametroSierra;
	}

	@Override
	public void hacer(Material material) {
		material.setMasa(material.getMasa() + 100);
	}

	@Override
	public void deshacer(Material material) {
		material.setMasa(material.getMasa() - 100);
	}

	@Override
	public void mezclarConMaterial(Material material) {
		
	}
}
