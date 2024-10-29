/**
 * 
 */
package com.masterjava.modelo.vehiculo;

import java.time.LocalDateTime;

import com.masterjava.interfaces.conducible.Conducible;

/**
 *
 * Vehiculo Clase que establece los atributos comunes a todos los vehículos
 *
 * @author Pablo Guijarro
 * @version 1.0, 30 sept 2024
 */
public abstract class Vehiculo implements Conducible {

	protected final String MATRICULA;
	protected String color;
	protected int numPlazas;
	protected String tipoAsiento;
	protected double velocidad;
	protected LocalDateTime horaLlegada;
	protected LocalDateTime horaSalida;
	protected double tiempoTranscurrido;
	protected int espacioRecorrido;

	public Vehiculo(String color, int numPlazas, String tipoAsiento, String matricula) {
		this.color = color;
		this.numPlazas = numPlazas;
		this.tipoAsiento = tipoAsiento;
		MATRICULA = matricula;

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipoAsiento() {
		return tipoAsiento;
	}

	public void setTipoAsiento(String tipoAsiento) {
		this.tipoAsiento = tipoAsiento;
	}

}
