package com.masterjava.ejerciciofigurasgeometricas;

/**
 *
 * Cuadrado Clase que simula un cuadrado y calcula su área.
 *
 * @author Pablo Guijarro
 * @version 1.0, 26 sept 2024
 */
public class Cuadrado extends FiguraGeometrica implements Area {

	public Cuadrado(int lado) {
		ancho = lado;
		largo = ancho;
	}

	@Override
	public void calcularArea() {

		int area = ancho * largo;

		System.out.println("El area del cuadrado es: " + area);
	}
}
