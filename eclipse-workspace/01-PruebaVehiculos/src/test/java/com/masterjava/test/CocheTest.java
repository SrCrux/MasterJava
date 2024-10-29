package com.masterjava.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.masterjava.modelo.vehiculo.Coche;

/**
*
*CocheTest JUnit test que prueba el funcionamiento de la interfaz conducible en el tipo de vehículo coche
*
*@author Pablo Guijarro
*@version 1.0, 30 sept 2024
 */
class CocheTest {

	private Coche coche;
	
	@Test
	void arrancarTest() {
		coche.arrancar();
	}
	
	@Test
	void avanzarTest() {
		fail("Not yet implemented");
	}
	
	@Test
	void retrocederTest() {
		fail("Not yet implemented");
	}
	
	@Test
	void pararTest() {
		fail("Not yet implemented");
	}

}
