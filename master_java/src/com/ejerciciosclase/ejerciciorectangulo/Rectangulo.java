package com.ejerciciosclase.ejerciciorectangulo;

public class Rectangulo {

	private int largo;
	private int ancho;

	public Rectangulo() {
		this.largo = 6;
		this.ancho = 4;
	}

	public Rectangulo(int largo, int ancho) {
		super();

		if (largo > 0) {
			this.largo = largo;

		} else {

			this.largo = 6;

		}
		
		if (ancho > 0) {
			this.ancho = ancho;

		} else {

			this.ancho = 4;

		}

	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {

		if (largo > 0) {
			this.largo = largo;
		}
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		if (ancho > 0) {
			this.ancho = ancho;
		}
	}

	public int calcularArea() {

		int area;

		area = largo * ancho;

		return area;

	}

	public int calcularPerimetro() {

		int perimetro;

		perimetro = (2 * largo) + (2 * ancho);

		return perimetro;

	}

	public void verticalUHorizontal() {

		if (largo > ancho) {

			System.out.println("El rectangulo es horizontal");
		} else {

			System.out.println("El rectangulo es vertical");

		}

	}

	public void mostrarDimensiones() {

		System.out.println("El rectangulo tiene " + largo + " de largo y " + ancho + " de ancho.");

	}

	public void mostrarRectangulo() {

		for (int i = 0; i < largo; i++) {

			for (int j = 0; j < ancho; j++) {

				System.out.print("*");

			}

			System.out.println();

		}

	}

}
