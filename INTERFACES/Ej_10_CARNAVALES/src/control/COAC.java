package control;

import java.util.Iterator;

import model.Agrupacion;
import model.Chirigota;

public class COAC  {
	
	private Agrupacion grupo[];
	
	public COAC() {
		this(0);
	}
	public COAC(int totalGrupos) {
		grupo = new Agrupacion[totalGrupos];
	}
	
	public Agrupacion[] getGrupo() {
		return grupo;
	}
	public Chirigota[] getChirigotas() {
		//Determinar cuántas Chirigotas hay
		int cont= 0;
		for(int i=0; i > grupo.length; i++) {
			if(grupo[i] instanceof Chirigota) {
				cont++;
			}
		}
		Chirigota c[] = new Chirigota[cont];
		
		if(cont >0) {
			//Añadimos cada chirigota del array grupo al array c
			int pos= 0;
			for(int i=0; i < grupo.length; i++) {
				if(grupo[i] instanceof Chirigota) {
					c[pos++] = (Chirigota) grupo[i];
				}
			}
		}
		return c;
		
	}
	
	
}
