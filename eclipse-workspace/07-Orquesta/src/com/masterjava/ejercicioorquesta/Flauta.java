package com.masterjava.ejercicioorquesta;
/**
 * Clase que identifica que instrumento va a tocar un músico.
 * 
 * @author Pablo Guijarro
 * @version 1.0
 */
public class Flauta extends Instrumento {

	protected String modelo;

	public Flauta(String nombre, String tipo, String modelo) {
		super(nombre, tipo);
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public void tocar(Musico musico) {

		super.tocar(musico);
		System.out.println("¡Sopla muy fuerte!");
	}

}
