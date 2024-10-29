package com.masterjava.ejercicioorquesta;

import java.util.ArrayList;
import java.util.List;

public class Orquesta {

	public static void main(String[] args) {

		Instrumento flauta = new Flauta("Flauta", "Travesera", "UP205");
		Instrumento gElectrica = new GuitarraElectrica("Guitarra Eléctrica", "Electrica", 5, 250);
		Instrumento tambor = new Tambor("Tambor", "Tambor", 100);
		Musico musico1 = new Musico("Sara", "Swinfer", flauta);
		Musico musico2 = new Musico("Jon", "Batch", gElectrica);
		Musico musico3 = new Musico("Ruth", "Favonessi", tambor);

		List<Instrumento> listaInstrumentos = new ArrayList<Instrumento>();

		listaInstrumentos.add(flauta);
		listaInstrumentos.add(gElectrica);
		listaInstrumentos.add(tambor);

		List<Musico> listaMusicos = new ArrayList<Musico>();

		listaMusicos.add(musico1);
		listaMusicos.add(musico2);
		listaMusicos.add(musico3);

		System.out.println(
				"¡Damas y caballeros, procedemos a introducir a los músicos que componen la orquesta de esta noche!");

		for (int i = 0; i < listaMusicos.size(); i++) {

			System.out.println(listaMusicos.get(i));

		}

		System.out.println("Los músicos van a afinar los instrumentos antes de la actuación.");

		for (int i = 0; i < listaMusicos.size(); i++) {

			listaMusicos.get(i).getInstrumento().afinar();

		}

		System.out.println("¡Que comience el espectáculo!");

		for (int i = 0; i < listaMusicos.size(); i++) {

			if (listaMusicos.get(i).getInstrumento() instanceof Tambor) {

				((Tambor) listaMusicos.get(i).getInstrumento()).aporrear(listaMusicos.get(i));

			} else {

				listaMusicos.get(i).getInstrumento().tocar(listaMusicos.get(i));
			}

		}

	}

}
