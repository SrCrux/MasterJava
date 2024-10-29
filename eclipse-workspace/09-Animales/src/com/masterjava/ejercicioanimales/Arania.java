package com.masterjava.ejercicioanimales;
/**
 * 
 * @author Pablo Guijarro 
 * @version 1.0 26/09/2024
 */
public class Arania extends Animal {

	public Arania() {

		nPatas = 8;
	}

	@Override
	public void comer() {

		System.out.println("Las arañas comen insectos");

	}

}
