package start;

import obra.Obra;
import obra.TipoEstancia;

public class Principal {

	public static void main(String[] args) {

		
		Obra obra1 = new Obra();
		
		obra1.getVivienda().insertarEstancia(TipoEstancia.BAÑO);
		obra1.getVivienda().insertarEstancia(TipoEstancia.BALCON);
		
		obra1.añadirMaterial("Metal", "Carreta", 0, 0, 0);
		obra1.añadirMaterial("Acero", "Carreta", 0, 0, 0);
		obra1.añadirMaterial("Hierro", "Carreta", 0, 0, 0);
		
		System.out.println(obra1.mostrarInformacion());
		
	}

}
