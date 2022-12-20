package unico;

public class CuentaCorriente {
	
	//ATRIBUTOS
	//SI LO PONEMOS EN PRIVATE, NO SE PUEDE MODIFICAR EN EL MAIN.
	String numero;
	Double saldo; //si fuera en minúscula sale 0.0 en lugar de null
	
	CuentaCorriente(){
		this.numero = "sin especificar";
		this.saldo = 0.0;
	}
	//CONSTRUCTORES
	
	CuentaCorriente(Double saldo){
		this.saldo = saldo;
	}
	CuentaCorriente(String numero){
		this.numero = numero;
	}
//	CuentaCorriente(String num,Double dinerito){
//		numero = num;
//		saldo = dinerito;
//	}
	CuentaCorriente(String numero,Double saldo){
		this.numero = numero;
		this.saldo = saldo;
	}
	
}
