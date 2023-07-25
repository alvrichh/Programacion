package model;

public interface Minar {
	
    static void hacer(Material material) {
        material.setMasa(material.getMasa() + 100);
    }

    static void deshacer(Material material) {
        material.setMasa(material.getMasa() - 100);
    }
}