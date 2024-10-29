package com.masterjava.ejerciciofigurasgeometricas;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		FiguraGeometrica cuadrado = new Cuadrado(5);
		FiguraGeometrica rectangulo = new Rectangulo(6, 5);
		Circulo circulo = new Circulo(25);

		List<Area> listaFiguras = new ArrayList<Area>();
		listaFiguras.add(circulo);
		listaFiguras.add((Area) cuadrado);
		listaFiguras.add((Area) rectangulo);

		for (Area a : listaFiguras) {

			a.calcularArea();

		}

	}

}
