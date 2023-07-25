package model;

public class Roca extends Material implements Mezclar {
    private int dureza;


	public Roca(String nombre, int masa, int capacidadQuemarse, int capacidadDiluirse, boolean movible, int dureza) {
        super(nombre, masa, capacidadQuemarse, capacidadDiluirse, movible);
        setDureza(dureza);
    }

    public int getDureza() {
		return dureza;
	}

	public void setDureza(int dureza) {
		this.dureza = dureza;
	}

    @Override
    public void mezclarConMaterial(Material material) {
    	
        if (material instanceof Roca) {
            Roca roca = (Roca) material;
            int nuevaDureza = (this.dureza + roca.dureza) / 2;
            System.out.println("Roca de dureza " + nuevaDureza + " fusionada.");
        } else {
            System.out.println("No se puede fusionar roca con " + material.getNombre() + ".");
        }
    }

    @Override
    public String toString() {
        return "Roca (dureza " + dureza + "): " + super.toString();
    }
}