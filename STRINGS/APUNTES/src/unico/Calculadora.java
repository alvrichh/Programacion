package unico;

public class Calculadora {

	public static void main(String[] args) {
		
		calcular("78.2+2");
	}

	private static double calcular(String exp) {
		double r = 0.0;
		int pos;
		double num1;
		double num2;
		
		if(exp.indexOf("+")>=0) {
			pos = exp.indexOf("+");
			num1 = Double.parseDouble(exp.substring(0,pos));
			num2 = Double.parseDouble(exp.substring(pos));
			r = num1 + num2;
		}
		return r;
	}

}
