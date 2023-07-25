package model;

public class Electrodomestico {
	
	private Double precioBase;
	private Color color;
	private TipoConsumo tipoconsumo;
	private Integer peso;
	
	public Electrodomestico() {
		setPrecioBase(100.00);
		setColor(Color.blanco);
		setTipoconsumo(TipoConsumo.F);
		setPeso(5);
	}
	public Electrodomestico(Double precioBase, Integer peso) {
		setPrecioBase(precioBase);
		setColor(Color.blanco);
		setTipoconsumo(TipoConsumo.F);
		setPeso(peso);
	}
	public Electrodomestico(Double precioBase, Color color, TipoConsumo tipoconsumo, Integer peso) {
		setPrecioBase(precioBase);
		setColor(color);
		setTipoconsumo(tipoconsumo);
		setPeso(peso);
	}
	public Double getPrecioFinal() {
		Double precioFinal = null;
		Double aumentoC = 0.0;
		Double aumentoP = 0.0;
		switch(getTipoconsumo()) {
		case A: aumentoC = 100.0;
		case B: aumentoC = 80.0;
		case C: aumentoC = 60.0;
		case D: aumentoC = 50.0;
		case E: aumentoC = 30.0;
		case F: aumentoC = 10.0;
		}
		if(getPeso() > 80) {
			aumentoP = 100.0;
		}else {
			if(getPeso() > 50) {
				aumentoP = 80.0;
			}else {
				if(getPeso() > 30) {
					aumentoP = 60.0;
				}else {
					if(getPeso() > 0) {
						aumentoP = 10.0;
					}else {
						System.out.println("Por favor aplique un peso correcto");	
					}		
				}
			}
		}
		precioFinal = getPrecioBase() + aumentoC + aumentoP;
		return precioFinal;
	}
	
	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", tipoconsumo=" + tipoconsumo
				+ ", peso=" + peso + "]";
	}
	public Double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(Double precioBase) {
		this.precioBase = precioBase;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public TipoConsumo getTipoconsumo() {
		return tipoconsumo;
	}
	public void setTipoconsumo(TipoConsumo tipoconsumo) {
		this.tipoconsumo = tipoconsumo;
	}
	public Integer getPeso() {
		return peso;
	}
	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	

	
	

}
