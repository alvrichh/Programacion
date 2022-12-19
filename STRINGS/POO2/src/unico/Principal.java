package unico;

/*
 * 		  {-> ATRIBUTOS
 * CLASE {		 +		  {-> CONSTRUCTORES
 * 		  {-> MÉTODOS ---{ -> GETTERS & SETTERS
 * 						  {-> FUNCIONAL(ES)
 * 						  {-> DE CLASE(toString, clone, equals, )
 * 
 * 
 */
public class Principal {

	public static void main(String[] args) {


		CuentaCorriente cc2 = new CuentaCorriente(204.21);

		
		cc2.setSaldo(-100.2);
		
		
		System.out.println( cc2.getSaldo());
		
//		System.out.println( cc2.toString());
		
		System.out.println(   cc2    );

	}

}
