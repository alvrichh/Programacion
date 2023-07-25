package model;

public abstract class Instrumento {

	public enum NotaMusical {
		DO, RE, MI, FA, SOL, LA, SI;
	}

	private NotaMusical[] notaMusical;

	public Instrumento() {
		notaMusical = new NotaMusical[100];
	}

	public void add(NotaMusical notaMusical) {
		for (int i = 0; i < getNotaMusical().length; i++) {
			if (getNotaMusical()[i] == null) {
				this.notaMusical[i] = notaMusical;
				i = getNotaMusical().length;
			}
		}
	}

	public abstract void interpretar();

	public NotaMusical[] getNotaMusical() {
		return notaMusical;
	}

	public void setNotaMusical(NotaMusical[] notaMusical) {
		this.notaMusical = notaMusical;
	}
}
