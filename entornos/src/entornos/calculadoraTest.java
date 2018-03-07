package entornos;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculadoraTest {

	@Test
	public void testSuma() {
		calculadora calcu = new calculadora(20,10);
		int resultado = calcu.suma();
		assertEquals(30,resultado);
	}

	@Test
	public void testResta() {
		calculadora calcu = new calculadora(20,10);
		int resultado = calcu.resta();
		assertEquals(10,resultado);
	}

	@Test
	public void testMultiplica() {
		calculadora calcu = new calculadora(20,10);
		int resultado = calcu.multiplica();
		assertEquals(200,resultado);
	}

	@Test
	public void testDivide() {
		calculadora calcu = new calculadora(20,10);
		int resultado = calcu.divide();
		assertEquals(2,resultado);

	}

}
