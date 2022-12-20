package unico;

public class CuentaCorriente {

	// ATRIBUTOS
	private String numero;
	private Double saldo; // si fuera en minúscula sale 0.0 en lugar de null

	public CuentaCorriente() {
		this.setNumero("sin especificar");
		this.saldo = 0.0;
	}
	// ctr + shift /
	// CONSTRUCTORES

	public CuentaCorriente(Double saldo) {
		// lo correcto en lugar de asignarlo de manera directa, inicializamos el objeto
		setSaldo(saldo);
	}

	public CuentaCorriente(String numero) {
		// this.setNumero(numero);
		setNumero(numero);
	}

//	CuentaCorriente(String num,Double dinerito){
//		numero = num;
//		saldo = dinerito;
//	}
	public CuentaCorriente(String numero, Double saldo) {
		this.setNumero(numero);
		this.saldo = saldo;
	}

	public void setSaldo(Double saldo) {
		if (saldo <= 0.0) {
			this.saldo = saldo;
		}
	}

	//
	public Double getSaldo() {
		return this.saldo;
	}

	public void setNumero(String numero) {

		this.numero = numero;
	}

	String getNumero() {
		return this.numero;
	}

	public void vaciar() {
		setSaldo(0.0);
	}

	public void ingresar(Double cantidad) {
		// this.saldo = this.saldo + cantidad;
		setSaldo(getSaldo() + cantidad);
	}

	@Override
	public String toString() {
		String txt = "";

		txt = getNumero() + "" + getSaldo() + " €";

		return txt;
	}
}
