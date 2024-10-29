package com.masterjava.modelo.vehiculo;

import java.time.LocalDateTime;

import com.masterjava.interfaces.conducible.VehiculoRuedas;

/**
 *
 * Coche Clase que simula un vehículo de tipo coche
 *
 * @author Pablo Guijarro
 * @version 1.0, 30 sept 2024
 */
public class Coche extends Vehiculo implements VehiculoRuedas {

	private static final int NUMERO_RUEDAS = 4;

	public Coche(String color, int numPlazas, String tipoAsiento, String mATRICULA) {
		super(color, numPlazas, tipoAsiento, mATRICULA);

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

		System.out.println("Inicio del viaje: " + horaSalida);
	}

	@Override
	public void avanzar(int metrosConducidos, double velocidad) {

		espacioRecorrido += metrosConducidos;
		this.velocidad = velocidad;
		tiempoTranscurrido += (metrosConducidos / 1000) / velocidad;
		System.out.println("El coche ha avanzado " + metrosConducidos / 1000 + "Km a " + velocidad + "Km/h en "
				+ ((metrosConducidos / 1000) / velocidad) * 60 + " minutos.");

	}

	@Override
	public void retroceder(int metrosConducidos, double velocidad) {

		espacioRecorrido -= metrosConducidos;
		this.velocidad = velocidad;
		tiempoTranscurrido += (metrosConducidos / 1000) / velocidad;
		System.out.println("El coche ha retrocedido " + metrosConducidos / 1000 + "Km a " + velocidad + "Km/h en "
				+ ((metrosConducidos / 1000) / velocidad) * 60 + " minutos.");

	}

	@Override
	public void parar() {

		velocidad = 0;
		tiempoTranscurrido *= 60;
		horaLlegada = horaSalida.plusMinutes((long) tiempoTranscurrido);

		System.out.println("***Fin del viaje***\nSe han recorrido " + espacioRecorrido / 1000 + "Km\nTiempo de viaje: "
				+ tiempoTranscurrido + "minutos\nHora de llegada: "+ horaLlegada);

	}

}
