package banco;

public class CuentaCorriente {

	// ATRIBUTOS
	private final int MAX_TITULARES = 1;
	private String numero;
	private TipoCC tipo;
	private Double saldo; // si fuera en minúscula sale 0.0 en lugar de null
	private Persona titular[];
	private Banco bco;
	// CONSTRUCTORES

	public CuentaCorriente() {
		titular = new Persona[MAX_TITULARES];
		for (int i = 0; i < MAX_TITULARES; i++) {
			titular[i] = new Persona();
		}
		setNumero("");
		setPersona(titular);
		setBco(new Banco());
		setTipo(TipoCC.NINGUNA);
		setSaldo(0.0);
	}

	public CuentaCorriente(String numero,TipoCC tipo, Double saldo, Persona[] titular, Banco bco) {
		setNumero(numero);
		setPersona(titular);
		setTipo(TipoCC.DEBITO);
		setSaldo(saldo);
		setBco(bco);

	}
	// ctr + shift /
	// CONSTRUCTORES

	public CuentaCorriente(String numero, Double saldo) {
		setNumero(numero);
		setSaldo(saldo);
	}


	// GETTERS
	String getNumero() {
		return this.numero;
	}

	public Double getSaldo() {
		return this.saldo;
	}

	public Persona[] getTitular() {
		return this.titular;
	}

	public TipoCC getTipo() {
		return tipo;
	}

	public Banco getBco() {
		return bco;
	}

	// SETERS
	public void setNumero(String numero) {
		this.numero = numero;
	}

	public boolean setSaldo(Double saldo) {
		boolean ok = false;

		switch (getTipo()) {
		case BLACK:
			this.saldo = saldo;
			ok = true;
			break;
		case CREDITO:
			if (saldo <= -1000.0) {
				this.saldo = saldo;
				ok = true;
			}
			break;
		case DEBITO:
			if (saldo > 0.0) {
				this.saldo = saldo;
				ok = true;
			}
			break;
		default:
			break;
		}

		return ok;
	}

	public void setPersona(Persona[] titular) {
		this.titular = titular;
	}

	public void setTipo(TipoCC tipo) {
		this.tipo = tipo;
	}

	public void setBco(Banco bco) {
		this.bco = bco;
	}

	// MÉTEDOS Y PROCEDIMIENTOS
	public void vaciar() {
		setSaldo(0.0);
	}

	public void ingresar(Double cantidad) {
		// this.saldo = this.saldo + cantidad;
		setSaldo(getSaldo() + cantidad);
	}

	@Override
	public String toString() {
		return "CuentaCorriente [getNumero()=" + getNumero() + ", getSaldo()=" + getSaldo() + ", getTitular()="
				+ getTitular() + ", getTipo()=" + getTipo() + ", getBco()=" + getBco() + "]";
	}

}
//CuentaCorriente(String num,Double dinerito){
//numero = num;
//saldo = dinerito;
//}

//if (getTipo() == TipoC.CREDITO || saldo <= 0.0) {
//this.saldo = saldo;
//ok = true;
//}
