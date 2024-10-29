package com.masterjava.modelo;

public class Pagina {

	private String nombre;
	private String url;
	private String tematica;
	private String descripcion;

	public Pagina(String nombre, String url, String descripcion, String tematica) {

		this.nombre = nombre;
		this.url = url;
		this.descripcion = descripcion;
		this.tematica = tematica;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
