package banco;

public class CuentaCorriente {

	private int saldo;
	private Integer limiteDeDescubrimiento;
	private Banco banco;
	private Titular titular;
	private TipoCC tipo;
	

	
	//Constructores
	public CuentaCorriente(){
		setTitular(new Titular());
		setTipo(TipoCC.DEBITO);
		asignarLimiteDeDescubrimiento();
		setSaldo(0);
		
	}
	
	public CuentaCorriente(Titular titular, int saldo){
		setTitular(titular);
		setSaldo(saldo);
		setTipo(TipoCC.DEBITO);
		asignarLimiteDeDescubrimiento();
	}
	
	
	public CuentaCorriente(int saldo){
		setSaldo(saldo);
		setTipo(TipoCC.DEBITO);
		asignarLimiteDeDescubrimiento();
	}
	
	public CuentaCorriente(int saldo, String dni){
		setSaldo(saldo);
		titular.setDni(dni);
		setTipo(TipoCC.DEBITO);
		asignarLimiteDeDescubrimiento();
	}
	
	
	//Metodos de la clase
	public void asignarLimiteDeDescubrimiento() {
		if(getTipo() == TipoCC.CREDITO) setLimiteDeDescubrimiento(-1000);
		if(getTipo() == TipoCC.DEBITO) setLimiteDeDescubrimiento(0);
		if(getTipo() == TipoCC.BLACK) setLimiteDeDescubrimiento(null);
	}
	
	public void sacarDinero(int cantidad) {	
		asignarLimiteDeDescubrimiento();
		if(getLimiteDeDescubrimiento() == null) {
			setSaldo(getSaldo() - cantidad);
			System.out.println(mensajeRetiroCorrecto());
		}else {
			if(getSaldo() - cantidad < getLimiteDeDescubrimiento()) {
				System.out.println(mensajeRetiroIncorrecto());
				
			}else {
				setSaldo(getSaldo() - cantidad);
				System.out.println(mensajeRetiroCorrecto());
			}
		}

		
	}

	public void ingresarDinero(int cantidad) {
		this.saldo += cantidad;
	}

	
	//Mensajes
	public String mensajeRetiroCorrecto() {
		return "El retiro se ha hecho correctamente";
	}
	
	public String mensajeRetiroIncorrecto() {
		return "El retiro no se ha hecho correctamente";
	}
	
	
	/////Getters And Setters
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
	
	
	
	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	@Override
	public String toString() {
		return "Titular: " + getTitular().getNombre() + "\nDni: " + getTitular().getDni() + 
				"\nLimite de descubrimiento: " + getLimiteDeDescubrimiento() + "\nSaldo: "
				+ getSaldo() + "\nNombre del banco: " + getBanco() + "\nTipo de Cuenta: " + getTipo()
				;
	}








}
