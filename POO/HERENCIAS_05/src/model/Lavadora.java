package model;

public class Lavadora extends Electrodomestico {
	
	final private Integer DEF_CARGA = 5;
	
	private Integer carga;
	
	public Lavadora(){
		super();
		setCarga(DEF_CARGA);
	}
	public Lavadora(Double precioBase, Integer peso ) {
		super(precioBase, peso);
		setCarga(carga);
	}
	public Lavadora(Integer carga) {
		super();
	}

	public Integer getCarga() {
		return carga;
	}

	public void setCarga(Integer dEF_CARGA2) {
		this.carga = dEF_CARGA2;
	}
}
