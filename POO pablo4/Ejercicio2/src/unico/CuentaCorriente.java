package unico;

public class CuentaCorriente {

	private int saldo;
	private int limiteDeDescubrimiento;
	private String nombre;
	private String dni;
	
	
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
		System.out.println("Nombre del titular: " + this.nombre);
		System.out.println("Dni del titular: " + this.dni);
		System.out.println("Saldo del titular: " + this.saldo);
		System.out.println("Limite de descubrimiento: " + this.limiteDeDescubrimiento);
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
}
