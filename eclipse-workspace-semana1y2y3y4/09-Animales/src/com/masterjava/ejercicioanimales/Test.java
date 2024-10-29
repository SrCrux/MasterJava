package com.masterjava.ejercicioanimales;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		Animal arania = new Arania();
		Animal gato = new Gato("Yonsi");
		Animal pez = new Pez("Tierra");

		List<Animal> listaAnimales = new ArrayList<>();

		listaAnimales.add(arania);
		listaAnimales.add(gato);
		listaAnimales.add(pez);

		for (int i = 0; i < listaAnimales.size(); i++) {

			listaAnimales.get(i).andar();
			listaAnimales.get(i).comer();
			if (listaAnimales.get(i) instanceof Mascota) {

				((Mascota) listaAnimales.get(i)).jugar();

			}

			System.out.println();
		}

	}

}
