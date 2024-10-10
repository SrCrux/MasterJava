/**
 * 
 */
package com.masterjava.modelo.vehiculo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.masterjava.interfaces.conducible.VehiculoRuedas;

/**
 *
 * Camion Clase que simula un vehículo de tipo camión
 *
 * @author Pablo Guijarro
 * @version 1.0, 30 sept 2024
 */
public class Camion extends Vehiculo implements VehiculoRuedas {

	private List<Double> listaVelocidades;
	private static final int NUMERO_RUEDAS = 10;

	public Camion(String color, int numPlazas, String tipoAsiento, String matricula) {
		super(color, numPlazas, tipoAsiento, matricula);
		listaVelocidades = new ArrayList<>();
	}

	@Override
	public int getNumeroRuedas() {
		return NUMERO_RUEDAS;
	}

	@Override
	public void arrancar() {
		espacioRecorrido = 0;
		velocidad = 0;
		horaSalida = LocalDateTime.now();

		System.out.println("Inicio del transporte: " + horaSalida);
	}

	
	@Override
	public void avanzar(int metrosConducidos, double velocidad) {

		espacioRecorrido += metrosConducidos;
		this.velocidad = velocidad;
		tiempoTranscurrido += (metrosConducidos / 1000) / velocidad;
		System.out.println("El camión ha avanzado " + metrosConducidos / 1000 + "Km a " + velocidad + "Km/h en "
				+ ((metrosConducidos / 1000) / velocidad) * 60 + " minutos.");
		listaVelocidades.add(velocidad);
	}

	@Override
	public void retroceder(int metrosConducidos, double velocidad) {

		espacioRecorrido -= metrosConducidos;
		this.velocidad = velocidad;
		tiempoTranscurrido += (metrosConducidos / 1000) / velocidad;
		System.out.println("El camión ha retrocedido " + metrosConducidos / 1000 + "Km a " + velocidad + "Km/h en "
				+ ((metrosConducidos / 1000) / velocidad) * 60 + " minutos.");
		listaVelocidades.add(velocidad);
	}

	@Override
	public void parar() {

		velocidad = 0;
		tiempoTranscurrido *= 60;
		horaLlegada = horaSalida.plusMinutes((long) tiempoTranscurrido);

		System.out.println("***Fin del transporte***\nSe han recorrido " + espacioRecorrido / 1000
				+ "Km\nTiempo de transporte: " + tiempoTranscurrido + "minutos\nHora de llegada: " + horaLlegada);
		mostrarListaVelocidades();

	}

	private void mostrarListaVelocidades() {
		System.out.println("Durante el trayecto se han recorrido " + listaVelocidades.size()
				+ " tramos distintos a las siguientes velocidades: ");
		for (int i = 0; i < listaVelocidades.size(); i++) {
			System.out.println("Tramo " + (i + 1) + ": " + listaVelocidades.get(i) + " km/h");
		}
	}

}
