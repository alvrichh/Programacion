package unico;

/*
 * 		  {-> ATRIBUTOS
 * CLASE {		 +		  {-> CONSTRUCTORES
 * 		  {-> MÉTODOS ---{
 * 						  {-> GETTERS & SETTERS
 * 
 * 
 * 
 * 
 */
public class Principal {

	public static void main(String[] args) {

		CuentaCorriente cc1 = new CuentaCorriente("123456ABC");
		
		CuentaCorriente cc2 = new CuentaCorriente(654.79);

		CuentaCorriente cc3 = new CuentaCorriente("1234567VSXSA",2500.23);

		CuentaCorriente cc4 = new CuentaCorriente();

		
		System.out.println(   cc1.numero    );
		System.out.println(   cc1.saldo     );

		System.out.println(   cc2.numero   );
		System.out.println(   cc2.saldo    );

		System.out.println(   cc3.numero + "\n" + cc3.saldo   );
		
		System.out.println(   cc4.numero + "\n" + cc4.saldo   );



	}

}
