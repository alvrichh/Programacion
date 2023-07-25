package model;

import view.ComponenteException;

@SuppressWarnings("serial")
public class EjesException extends ComponenteException {

	public EjesException(int ejes) {
				
		switch(ejes){
		case 1 -> System.out.println("aqui no ze respeta o ke paza");
		
		}
	}
	
}
