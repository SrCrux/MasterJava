package com.masterjava.ejercicioorquesta;
/**
 * Clase padre que establece las características comunes de varios instrumentos.
 *
 * @author Pablo Guijarro
 * @version 1.0
 */
public abstract class Instrumento {

	protected String nombre;
	protected String tipo;

	public Instrumento(String nombre, String tipo) {

		this.nombre = nombre;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * 
	 * @param musico Se pasa por parametro el músico que va a tocar el instrumento.
	 */
	public void tocar(Musico musico) {

		System.out.println(musico.getNombre() + " " + musico.getApellido() + " está tocando el instrumento: " + nombre);

	}
	
	public void afinar() {

		System.out.println("Afinando el instrumento: " + nombre);

	}

}
