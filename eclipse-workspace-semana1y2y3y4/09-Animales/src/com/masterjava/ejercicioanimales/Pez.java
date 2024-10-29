package com.masterjava.ejercicioanimales;
/**
 * 
 * @author Pablo Guijarro 
 * @version 1.0 26/09/2024
 */
public class Pez extends Animal implements Mascota {

	private String nombre;

	public Pez(String nombre) {
		this.nombre = nombre;
		nPatas = 0;
	}

	@Override
	public void jugar() {

		System.out.println("Soy " + nombre + " y estoy nadando");

	}

	@Override
	public void comer() {
		System.out.println("Los peces comen plancton");

	}

	@Override
	public void andar() {

		System.out.println("Yo no puedo andar, pero puedo nadar!");
	}

}
