package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

class CalculadoraTest {

	@Test
	void test() {
		Calculadora calc = new Calculadora();
		assertEquals(2.0, calc.soma(1.0, 1.0), "Deu ruim: Era para ser 2.0");
		assertEquals(-1.0, calc.sub(3.0, 4.0), "Deu ruim: Era para ser -1.0");
		assertEquals(1.0, calc.mult(1.0, 1.0), "Deu ruim: Era para ser 1.0");
		assertEquals(2.0, calc.div(4.0, 2.0), "Deu ruim: Era para ser 2.0");
		assertEquals(4.0, calc.pot(2.0, 2.0), "Deu ruim: Era para ser -1.0");
	}

}
