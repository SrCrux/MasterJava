package com.masterjava.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.masterjava.modelo.Calculadora;

class CalculadoraTest {

	@Test
	void sumarTest() {
		// Arrange > >Organizar
		Calculadora calculadora = new Calculadora();
		// Act >> actuar, ejecutar
		double suma = calculadora.sumar(2.5, 4.5);
		// Assert >> aseverar
		assertEquals(7.0, suma);
	}
	@Test
	void restarTest() {

		Calculadora calculadora = new Calculadora();

		double resta = calculadora.restar(6.5, 2.5);

		assertEquals(4, resta);

	}

}
