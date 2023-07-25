package model;

public class Piano extends Instrumento {

	public Piano() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String interpretar() {
		String resultado = "";

		for (int i = 0; i < getNotaMusical().length; i++) {
			if (getNotaMusical()[i] != null) {
				for (int j = 0; j < 7; j++) {
					switch(j){
					case 0: resultado += "| "; break;
					case 1: resultado += "┬ "; break;
					
					case 6: resultado += "┐ "; break;
					}
					if (getNotaMusical()[i] == NotaMusical.DO) {
						resultado += "@ ";
						j = 7;
					} else {
						resultado += "| ";
						j = 7;
					}
					if (getNotaMusical()[i] == NotaMusical.RE) {
						resultado += "@ ";
						j = 7;
					} else {
						resultado += "| ";
						j = 7;
					}
					if (getNotaMusical()[i] == NotaMusical.MI) {
						resultado += "@ ";
						j = 7;
					} else {
						resultado += "| ";
						j = 7;
					}
					if (getNotaMusical()[i] == NotaMusical.FA) {
						resultado += "@ ";
						j = 7;
					} else {
						resultado += "| ";
						j = 7;
					}
					if (getNotaMusical()[i] == NotaMusical.SOL) {
						resultado += "@ ";
						j = 7;
					} else {
						resultado += "| ";
						j = 7;
					}
					if (getNotaMusical()[i] == NotaMusical.LA) {
						resultado += "@ ";
						j = 7;
					} else {
						resultado += "| ";
						j = 7;
					}
					if (getNotaMusical()[i] == NotaMusical.SI) {
						resultado += "@ ";
						j = 7;
					} else {
						resultado += "| ";
						j = 7;
					}
				}
				resultado += "\n";
			}

		}
		return resultado;
	}

}
