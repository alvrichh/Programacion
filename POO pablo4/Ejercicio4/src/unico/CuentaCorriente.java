package unico;

public class CuentaCorriente {

	private int saldo;
	private int limiteDeDescubrimiento;
	public String nombre;
	protected String dni;
	private String nombreBanco = "BBVA";
	
	
	//Constructores
	CuentaCorriente(){
		
	}
	
	CuentaCorriente(String nombre, String dni){
		setNombre(nombre);
		setDni(dni);
		setSaldo(0);
		setLimiteDeDescubrimiento(-50);
	}
	
	
	CuentaCorriente(int saldo){
		setSaldo(saldo);
		setLimiteDeDescubrimiento(0);
	}
	
	CuentaCorriente(int saldo, int limiteDeDescubrimiento, String dni){
		setSaldo(saldo);
		setLimiteDeDescubrimiento(limiteDeDescubrimiento);
		setDni(dni);
	}
	
	
	//Metodos de la clase
	public boolean sacarDinero(int cantidad) {
		boolean resultado;
		
		if(this.saldo - cantidad < this.limiteDeDescubrimiento) {
			resultado = false;
			System.out.println("El retiro supera el limite de descubrimiento");
		}else {
			resultado = true;
			System.out.println("El retiro se ha hecho correctamente");
		}
		
		return resultado;
	}

	public void ingresarDinero(int cantidad) {
		this.saldo += cantidad;
	}
	
	public void mostrarInformacion() {
		System.out.println("Nombre del banco: " + getNombreBanco());
		System.out.println("Nombre del titular: " + getNombre());
		System.out.println("Dni del titular: " + getDni());
		System.out.println("Saldo del titular: " + getSaldo());
		System.out.println("Limite de descubrimiento: " + getLimiteDeDescubrimiento());
	}
	
	public void modificarBanco(String nombreBanco) {
		setNombreBanco(nombreBanco);
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

	public String getNombreBanco() {
		return nombreBanco;
	}

	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}
}
