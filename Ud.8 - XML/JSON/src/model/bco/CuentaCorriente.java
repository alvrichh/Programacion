package model.bco;

public class CuentaCorriente {

	private final int MAX_TITULARES = 3;

	private Persona titular[];
	private Double saldo;
	private TipoCC tipo;
	private Banco bco;

	public CuentaCorriente() {
		titular = new Persona[MAX_TITULARES];
		for (int i = 0; i < MAX_TITULARES; i++) {
			titular[i] = new Persona();
		}
		setTitular(titular);
		setBco(new Banco());
		setTipo(TipoCC.DEBITO);
		setSaldo(0.0);
	}

	public CuentaCorriente(Persona[] titular, Banco bco, Double saldo) {
		setTitular(titular);
		setBco(bco);
		setTipo(TipoCC.DEBITO);
		setSaldo(saldo);
	}

	public boolean setSaldo(Double saldo) {
		boolean ok = false;
		switch (getTipo()) {
		case BLACK:
			this.saldo = saldo;
			ok = true;
			break;
		case CREDITO:
			if (saldo >= -1000.0) {
				this.saldo = saldo;
				ok = true;
			}
			break;
		case DEBITO:
			if (saldo >= 0.0) {
				this.saldo = saldo;
				ok = true;
			}
			break;
		}
		return ok;
	}

	public Double getSaldo() {
		return this.saldo;
	}

	public void setTitular(Persona[] titular) {
		this.titular = titular;
	}

	public Persona[] getTitular() {
		return this.titular;
	}

	public void setTipo(TipoCC tipo) {
		this.tipo = tipo;
	}

	public TipoCC getTipo() {
		return this.tipo;
	}

	public Banco getBco() {
		return bco;
	}

	public void setBco(Banco bco) {
		this.bco = bco;
	}

	public void vaciarCuenta() {
		setSaldo(0.0);
	}

	public void ingresar(Double cantidad) {
		setSaldo(getSaldo() + cantidad);
	}

	public void retirar(Double cantidad) {
		setSaldo(getSaldo() - cantidad);
	}

	@Override
	public String toString() {
		String txt = "";
		txt = "La cuenta es de " + getTitular() + " y es de " + getTipo() + " y tiene " + getSaldo() + "€";
		return txt;
	}

}