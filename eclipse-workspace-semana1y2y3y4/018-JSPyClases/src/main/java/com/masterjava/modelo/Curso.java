package com.masterjava.modelo;

public class Curso {

	private String nombre;
	private String nivel;

	public Curso() {
	}

	public Curso(String nombre, String nivel) {

		this.nombre = nombre;
		this.nivel = nivel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

}
