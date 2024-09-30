package com.masterjava.ejerciciofigurasgeometricas;

/**
 *
 * Circulo Clase que simula un circulo y calcula su área.
 *
 * @author Pablo Guijarro
 * @version 1.0, 26 sept 2024
 */
public class Circulo implements Area {

	private int radio;

	public Circulo(int radio) {

		this.radio = radio;

	}

	public void calcularArea() {

		double area = Math.PI * (radio * 2);

		System.out.println("El área del círculo es: " + String.format("%.2f", area));

	}
}
