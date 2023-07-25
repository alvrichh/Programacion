package start;

public class Hora {

	private int hora;
	private int minuto;
	private int segundo;
	
	
	//Constructores
	public Hora() {
		
	}
	public Hora(int hora, int minuto, int segundo) {
		setHora(hora);
		setMinuto(minuto);
		setSegundo(segundo);
	}


	
	//Metodos de la  clase
	public void sumarSegundos(int segundos) {
		int hora = 0;
		int minuto = 0;
		
		
		while (segundos >= 60) {
			minuto++;
			segundos-=60;
				
		}
		while(minuto >= 60) {
			hora++;
			minuto-=60;
		}
		setHora(getHora() + hora);
		setMinuto(getMinuto() + minuto);
		setSegundo(getSegundo() + segundos);
		while (getSegundo() >= 60) {
			setMinuto(getMinuto() + 1);
			setSegundo(getSegundo() - 60);
		}
		while(getMinuto() >= 60) {
			setHora(getHora() + 1);
			setMinuto(getMinuto() - 60);
			
		}
	}
	
	
	
	
	
	
	//Getters and setter
	public void setHora(int hora) {
		this.hora = hora;
	}
	
	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}

	@Override
	public String toString() {
		return "Hora=" + getHora() + ", Minuto=" + getMinuto() + ", Segundo=" + getSegundo() + "]";
	}
	
	
}
