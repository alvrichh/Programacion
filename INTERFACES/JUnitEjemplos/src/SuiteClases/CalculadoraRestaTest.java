package SuiteClases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class CalculadoraRestaTest {
	
	
	
	@ParameterizedTest
	@CsvSource( {"20,  10,   10", 
	             "30,  -2, 32", 
	             "5,   2,   3" })	
	public void testResta(int a, int b, int valorEsperado) {
		Calculadora calcu = new Calculadora(a, b);
		int resultado = calcu.resta();
		assertEquals(valorEsperado, resultado);
	}

}
