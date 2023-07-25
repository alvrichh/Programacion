
public class Calculadora {

	private int num1;
	private int num2;

	public Calculadora(int a, int b) {
		num1 = a;
		num2 = b;
	}
	public int suma() {
		int res = num1 + num2;
		return res;
	}

	
	//ACTIVIDAD 3.5
	public int resta() {
		int res;
		if (resta2()) {
			res = num1 -num2;
			
		} else {
			res = num2 - num1;
		}
		return res;
	}
	public boolean resta2() {
		if (num1 >= num2) {
			return true;
		}else {
			return false;
		}
	}
	public Integer divide2() {
		if(num2 == num1){
			return null;
		} int res = num1 / num2;
		return res;
		}
	
	
	public int divide0() {
		if(num2 == 0) {
			throw new java.lang.ArithmeticException("Division por 0");
			
		} else {
			int res = num1 / num2;
			return res;
		}
	}

	
	public int multiplica() {
		int res = num1 * num2;
		return res;
	}
	public int divide() {
		int res = num1 / num2;
		return res;
	}
	
	//MEtodo potencia
	public int potencia() {
		int res = (int)Math.pow(num1, num2);
		if (num1 == 0) {
			res = 0;	
		} if(num2 == 0) {
			res = 1;
		}
		return res;

		
	}
	
}
