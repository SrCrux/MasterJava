package com.masterjava.ejercicioanimales;
/**
 * 
 * @author Pablo Guijarro 
 * @version 1.0 26/09/2024
 */
public class Gato extends Animal implements Mascota {

	private String nombre;

	public Gato(String nombre) {

		this.nombre = nombre;
		nPatas = 4;
	}

	@Override
	public void jugar() {

		System.out.println("A mi gatito " + nombre + " le gusta jugar con pelotas");

	}

	@Override
	public void comer() {

		System.out.println("A los gatos les gusta comer arañas y peces");

	}

}
