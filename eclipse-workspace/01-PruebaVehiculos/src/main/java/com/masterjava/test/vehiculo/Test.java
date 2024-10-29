package com.masterjava.test.vehiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.masterjava.interfaces.conducible.Conducible;
import com.masterjava.modelo.vehiculo.Camion;
import com.masterjava.modelo.vehiculo.Coche;
import com.masterjava.modelo.vehiculo.Vehiculo;

public class Test {

	public static void main(String[] args) {

		Vehiculo coche1 = new Coche("Blanco", 5, "Cuero", "9876MJG");
		Vehiculo camion1 = new Camion("Verde", 3, "Tela", "0760MLJ");

		List<Vehiculo> listaVehiculos = new ArrayList<>();

		listaVehiculos.add(coche1);
		listaVehiculos.add(camion1);

		// Se simula un número aleatorio de avances para cada uno de los vehículos
		Random random = new Random();
		int numAvances = random.nextInt(5) + 1;

		for (int i = 0; i < listaVehiculos.size(); i++) {

			((Conducible) listaVehiculos.get(i)).arrancar();

			for (int j = 0; j < numAvances; j++) {
				int metrosAvance = random.nextInt(190000) + 10000;
				int velocidad = random.nextInt(60) + 60;

				if (listaVehiculos.get(i) instanceof Camion) {
					velocidad = random.nextInt(50) + 40;
				}

				((Conducible) listaVehiculos.get(i)).avanzar(metrosAvance, velocidad);
			}

			((Conducible) listaVehiculos.get(i)).parar();
			System.out.println();
		}
	}
}
