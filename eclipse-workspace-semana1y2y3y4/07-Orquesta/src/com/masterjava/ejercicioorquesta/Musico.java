package com.masterjava.ejercicioorquesta;
/**
 * 
 * Clase Musico que representa la figura de un músico que va tocar un instrumento.
 * 
 * @author Pablo Guijarro
 * @version 1.0
 */
public class Musico {

	private String nombre;
	private String apellido;
	private Instrumento instrumento;

	public Musico(String nombre, String apellido, Instrumento instrumento) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.instrumento = instrumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Instrumento getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(Instrumento instrumento) {
		this.instrumento = instrumento;
	}

	@Override
	public String toString() {
		return "El instrumento " + instrumento.getNombre() + " será tocado hoy por " + nombre + " " + apellido;
	}

}
