package com.masterjava.interfaces.conducible;

/**
 *
 * Conducible Interfaz que define los métodos necesarios para que un vehículo se pueda conducir.
 *
 * @author Pablo Guijarro
 * @version 1.0, 30 sept 2024
 */
public interface Conducible {

	/**
	 * Método que arranca un vehículo, inicializa la hora de inicio del trayecto
	 */
	void arrancar();

	/**
	 * Método que avanza un vehículo por tramos
	 * @param metrosConducidos metros de avance
	 * @param velocidad velocidad de avance en km/h
	 */
	void avanzar(int metrosConducidos, double velocidad);

	/**
	 * Método que retrocede un vehículo por tramos
	 * @param metrosConducidos metros de retroceso
	 * @param velocidad velocidad de retroceso en km/h
	 */
	void retroceder(int metrosConducidos, double velocidad);

	/**
	 * Método que marca el final del trayecto de un vehículo. Muestra la hora de llegada y el tiempo transcurrido en el trayecto
	 */
	void parar();

}
