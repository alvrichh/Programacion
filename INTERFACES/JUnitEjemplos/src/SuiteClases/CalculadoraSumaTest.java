package SuiteClases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class CalculadoraSumaTest {
	
	@ParameterizedTest
	@CsvSource( {"20,  10,   30", 
	             "30,  -2, 28", 
	             "5,   2,   3" })	
	public void testSuma(int a, int b, int valorEsperado) {
		Calculadora calcu = new Calculadora(a, b);
		int resultado = calcu.suma();
		assertEquals(valorEsperado, resultado);
	}


}
