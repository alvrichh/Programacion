import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TablaEnterosTest {

	@Test
	void testSumaTabla() {
		int valorEsperado = 3;
		//prueba
		int[] tabla = new int [3];
		tabla[0] = 1;
		tabla[1] = 2;
		
		TablaEnteros calcu = new TablaEnteros(tabla);
		int resultado = calcu.sumaTabla();
		assertEquals(valorEsperado, resultado, "Suma de array ");
		}
	@Test
	void testMayorTabla() {
		int valorEsperado = 12;
		//prueba
		int[] tabla = new int[3];
		tabla[0] = 11;
		tabla[1] = 2;
		
		tabla[0] = 12;
		TablaEnteros mayor = new TablaEnteros(tabla);
		int resultado = mayor.mayorTabla();
		assertEquals(valorEsperado, resultado, "Mayor array");
		
	}
	@Test
	void testPosicionTabla() {
		int valorEsperado = 5;
		int[] tabla = new int[6];
		tabla[0] = 1;
		tabla[1] = 2;
		tabla[2] = 3;
		tabla[3] = 7;
		tabla[4] = 4;
		tabla[5] = 8;
		TablaEnteros mayor = new TablaEnteros(tabla);
		int resultado = mayor.posicionTabla(8);
		assertEquals(valorEsperado, resultado);
		
	}

}