package model;

public class Figura {

	private int cordX;
	private int cordY;
	
	public Figura() {
		
	}

	public Figura(int cordX, int cordY) {
		super();
		this.cordX = cordX;
		this.cordY = cordY;
	}

	public int getCordX() {
		return cordX;
	}

	public void setCordX(int cordX) {
		this.cordX = cordX;
	}

	public int getCordY() {
		return cordY;
	}

	public void setCordY(int cordY) {
		this.cordY = cordY;
	}
	
	
}
