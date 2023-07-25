 package SuiteClases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class CalculadoraMultiplicaTest {
	

	@ParameterizedTest
	@CsvSource( {"20,  10,   200", 
	             "30,  -2, -60", 
	             "5,   2,   3" })	
	public void testMultiplica(int a, int b, int valorEsperado) {
		Calculadora calcu = new Calculadora(a, b);
		int resultado = calcu.multiplica();
		assertEquals(valorEsperado, resultado);
	}

	

}
