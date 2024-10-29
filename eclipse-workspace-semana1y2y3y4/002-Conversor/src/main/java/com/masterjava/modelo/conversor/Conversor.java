package com.masterjava.modelo.conversor;

/**
 *
 * Conversor Clase que convierte un número indefinido de euros a pesetas y
 * viceversa.
 *
 * @author Pablo Guijarro
 * @version 1.0, 2 oct 2024
 */
public class Conversor {

	private static final double CONSTANTE_CONVERSION = 166.386;
	private double euros;
	private double pesetas;

	public Conversor() {

	}

	public double getEuros() {
		return euros;
	}

	public void setEuros(double euros) {
		this.euros = euros;
	}

	public double getPesetas() {
		return pesetas;
	}

	public void setPesetas(double pesetas) {
		this.pesetas = pesetas;
	}

	public static double getConstanteConversion() {
		return CONSTANTE_CONVERSION;
	}

	public double convertirEurosAPesetas(double euros) {

		pesetas = euros * CONSTANTE_CONVERSION;

		return pesetas;

	}

	public double convertirPesetasAEuros(double pesetas) {

		euros = pesetas / CONSTANTE_CONVERSION;

		return euros;

	}

}
