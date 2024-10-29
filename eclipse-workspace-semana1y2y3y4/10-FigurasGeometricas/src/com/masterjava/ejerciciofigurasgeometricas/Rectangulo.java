package com.masterjava.ejerciciofigurasgeometricas;

/**
 *
 * Rectangulo Clase que simula un rectángulo y calcula su área.
 *
 * @author Pablo Guijarro
 * @version 1.0, 26 sept 2024
 */
public class Rectangulo extends FiguraGeometrica implements Area {

	public Rectangulo(int ancho, int largo) {
		this.ancho = ancho;
		this.largo = largo;

		if (ancho == largo) {

			this.largo++;
		}
	}

	@Override
	public void calcularArea() {

		int area = ancho * largo;

		System.out.println("El área del rectangulo es: " + area);

	}
}
