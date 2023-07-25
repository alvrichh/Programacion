package model;

public class LocalIndustrial extends Local {

	private String consumoEnergetico;

	public LocalIndustrial() {
		this("", 0, new Persona(), 0, "", 0);

	}

	public LocalIndustrial(String consumoEnergetico, double precio, Persona propietario, int añoConstruccion,
			String direccion, double metrosCuadrados) {
		super(precio, propietario, añoConstruccion, direccion, metrosCuadrados);
		this.consumoEnergetico = consumoEnergetico;
	}

	public String getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(String consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

}
