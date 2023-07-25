package banco;

public class CuentaCorriente {

	private int saldo;
	private int limiteDeDescubrimiento;
	public String nombre;
	protected String dni;
	private Banco banco;
	private TipoCC tipo;
	

	//Constructores
	public CuentaCorriente(){
		
	}
	
	public CuentaCorriente(Banco banco,String nombre, String dni){
		setNombre(nombre);
		setDni(dni);
		setSaldo(0);
		setLimiteDeDescubrimiento(-50);
		setBanco(banco);
	}
	
	
	public CuentaCorriente(int saldo){
		setSaldo(saldo);
		setLimiteDeDescubrimiento(0);
	}
	
	public CuentaCorriente(int saldo, int limiteDeDescubrimiento, String dni){
		setSaldo(saldo);
		setLimiteDeDescubrimiento(limiteDeDescubrimiento);
		setDni(dni);
	}
	
	
	//Metodos de la clase
	public void sacarDinero(int cantidad) {		
		if(this.saldo - cantidad < this.limiteDeDescubrimiento) {
			System.out.println(mensajeRetiroIncorrecto());
			
		}else {
			System.out.println(mensajeRetiroCorrecto());
			
			this.saldo = this.saldo - cantidad;
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
	public int getLimiteDeDescubrimiento() {
		return limiteDeDescubrimiento;
	}

	public void setLimiteDeDescubrimiento(int limiteDeDescubrimiento) {
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
				+ getBanco().getNombre() + "\nTipo de Cuenta: " + getTipo()
				;
	}








}
