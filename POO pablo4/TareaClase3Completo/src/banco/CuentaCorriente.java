package banco;

import java.io.Serializable;

public class CuentaCorriente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int saldo;
	private Integer limiteDeDescubrimiento;
	private Persona titular;
	private TipoCC tipo;
	private Banco banco;

	// Constructores
	public CuentaCorriente() {
		setTitular(new Persona());
		setBanco(new Banco());
		setTipo(TipoCC.DEBITO);
		setSaldo(0);
		setLimiteDeDescubrimiento(0);

	}



	public CuentaCorriente(int saldo, Integer limiteDeDescubrimiento, Persona titular, Banco banco) {
		this.saldo = saldo;
		this.limiteDeDescubrimiento = limiteDeDescubrimiento;
		this.titular = titular;
		setTipo(TipoCC.DEBITO);
		this.banco = banco;
	}
	
	

	public CuentaCorriente(int saldo, Integer limiteDeDescubrimiento, Persona titular, TipoCC tipo, Banco banco) {
		super();
		this.saldo = saldo;
		this.limiteDeDescubrimiento = limiteDeDescubrimiento;
		this.titular = titular;
		this.tipo = tipo;
		this.banco = banco;
	}



	// Metodos de la clase
	public void asignarLimiteDeDescubrimiento() {
		if (getTipo() == TipoCC.CREDITO)
			setLimiteDeDescubrimiento(-1000);
		if (getTipo() == TipoCC.DEBITO)
			setLimiteDeDescubrimiento(0);
		if (getTipo() == TipoCC.BLACK)
			setLimiteDeDescubrimiento(null);
	}

	public void sacarDinero(int cantidad) {
		asignarLimiteDeDescubrimiento();
		if (getLimiteDeDescubrimiento() == null) {
			setSaldo(getSaldo() - cantidad);
			System.out.println(mensajeRetiroCorrecto());
		} else {
			if (getSaldo() - cantidad < getLimiteDeDescubrimiento()) {
				System.out.println(mensajeRetiroIncorrecto());

			} else {
				setSaldo(getSaldo() - cantidad);
				System.out.println(mensajeRetiroCorrecto());
			}
		}

	}

	public void ingresarDinero(int cantidad) {
		this.saldo += cantidad;
	}

	// Mensajes
	public String mensajeRetiroCorrecto() {
		return "El retiro se ha hecho correctamente";
	}

	public String mensajeRetiroIncorrecto() {
		return "El retiro no se ha hecho correctamente";
	}

	///// Getters And Setters
	public Integer getLimiteDeDescubrimiento() {
		return limiteDeDescubrimiento;
	}

	public void setLimiteDeDescubrimiento(Integer limiteDeDescubrimiento) {
		this.limiteDeDescubrimiento = limiteDeDescubrimiento;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public TipoCC getTipo() {
		return tipo;
	}

	public void setTipo(TipoCC tipo) {
		this.tipo = tipo;
	}

	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	@Override
	public String toString() {
		return "CuentaCorriente [getLimiteDeDescubrimiento()=" + getLimiteDeDescubrimiento() + ", getSaldo()="
				+ getSaldo() + " getTipo()=" + getTipo() + ", \ngetBanco()=" + getBanco() + "\ngetTitular()=" + getTitular() + "]\n";
	}
	
	

	

}
