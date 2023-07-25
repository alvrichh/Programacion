import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	public void testSuma() {
		double valorEsperado = 30;
		Calculadora calcu = new Calculadora(20, 10);
		double res = calcu.suma();
		assertEquals(valorEsperado, res, 0);
	}

	@Test
	public void testResta() {
		double valorEsperado = 10;
		Calculadora calcu = new Calculadora(20, 10);
		double res = calcu.resta();
		assertEquals(valorEsperado, res, 0);
	}

	@Test
	public void testResta2() {
		double valorEsperado = 10;
		Calculadora calcu = new Calculadora(20, 10);
		assertTrue(calcu.resta2());
		double res = calcu.resta();

		Calculadora calcu2 = new Calculadora(20, 10);
		
		assertFalse(calcu2.resta2());
		assertEquals(valorEsperado, res, 0);

	}
	
	@Test
	public void testMultiplica() {
		double valorEsperado = 200;
		Calculadora calcu = new Calculadora(20, 10);
		double res = calcu.multiplica();
		assertEquals(valorEsperado, res, 0);
	}

	@Test
	public void testDivide() {
		double valorEsperado = 2;
		Calculadora calcu = new Calculadora(20, 10);
		double res = calcu.divide();
		assertEquals(valorEsperado, res, 0);
	}
	@Test
	public void testDivide2() {
		double valorEsperado = 2;
		Calculadora calcu = new Calculadora(20, 10);
		double res = calcu.divide2();
		assertEquals(valorEsperado, res, 0);
	}
	@Test
	public void testDivide0() {
		Calculadora calcu = new Calculadora(20, 0);
		Assertions.assertThrows(ArithmeticException.class, () ->{
			calcu.divide0();
		});
	}
	@Test
	public void testException() {
		try {
			Calculadora calcu = new Calculadora(20, 0);
			double res = calcu.divide();
			fail("Fallo, debería haber saltado la excepción");
		} catch (ArithmeticException e) {
			//Prueba satisfactoria
		}
	}
	
		
	@Test
	void testpotencia() {
		int valorEsperado = 25;
		Calculadora calcu = new Calculadora(5,2);
		int res = calcu.potencia();
		assertEquals(valorEsperado, res, 0, "Valor esperado incorrecto");

		
	}
	
	
}
