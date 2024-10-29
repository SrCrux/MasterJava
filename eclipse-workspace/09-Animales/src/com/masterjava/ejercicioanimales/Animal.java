package com.masterjava.ejercicioanimales;

/**
 * Clase que identifica un animal por su número de patas.
 * 
 * @author Pablo Guijarro
 * @version 1.0 26/09/2024
 */
public abstract class Animal {

	protected int nPatas;

	public int getNPatas() {
		return nPatas;
	}

	public void andar() {

		System.out.println("Este animal anda sobre " + getNPatas() + " patas.");

	}

	public abstract void comer();

}
