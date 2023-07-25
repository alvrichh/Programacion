package banco;

public class CuentaCorriente {

	private int saldo;
	private Integer limiteDeDescubrimiento;
	public String nombre;
	protected String dni;
	private Banco banco;
	private TipoCC tipo;
	

	
	//Constructores
	public CuentaCorriente(){
		
	}
	
	public CuentaCorriente(String nombre, String dni){
		setNombre(nombre);
		setDni(dni);
		setSaldo(0);
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
		setDni(dni);
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
		}else {
			if(getSaldo() - cantidad < getLimiteDeDescubrimiento()) {
				System.out.println(mensajeRetiroIncorrecto());
				
			}else {
				System.out.println(mensajeRetiroCorrecto());
				setSaldo(getSaldo() - cantidad);
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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
	
	
	
	@Override
	public String toString() {
		return "Limite de descubrimiento: " + getLimiteDeDescubrimiento() + "\nSaldo: "
				+ getSaldo() + "\nNombre: " + getNombre() + "\nDni: " + getDni() + "\nBanco: "
				+ getBanco() + "\nTipo de Cuenta: " + getTipo()
				;
	}








}
