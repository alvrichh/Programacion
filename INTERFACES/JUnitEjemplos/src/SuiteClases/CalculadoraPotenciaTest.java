package SuiteClases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class CalculadoraPotenciaTest {
	
	
	
	@ParameterizedTest
	@CsvSource( {"5,  2,   25", 
	             "6,  0,  1", 
	             "2,  4,  16 " })	
	public void testResta(int a, int b, int valorEsperado) {
		Calculadora calcu = new Calculadora(a, b);
		int resultado = calcu.potencia();
		assertEquals(valorEsperado, resultado);
	}

}
