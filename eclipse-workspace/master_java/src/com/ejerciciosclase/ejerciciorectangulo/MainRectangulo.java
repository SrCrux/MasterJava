package com.ejerciciosclase.ejerciciorectangulo;

public class MainRectangulo {

	public static void main(String[] args) {

		Rectangulo r1 = new Rectangulo(3, 10);

		r1.mostrarDimensiones();
		r1.verticalUHorizontal();
		System.out.println("El area es: "+r1.calcularArea());
		System.out.println("El perimetro es: "+r1.calcularPerimetro());
		System.out.println("///DIBUJO DEL RECTANGULO///");
		r1.mostrarRectangulo();

	}

}
