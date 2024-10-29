package com.masterjava.modelo;

import java.util.List;

public class Tematica {

	private String nombre;
	private List<Pagina> listaPaginas;

	public Tematica(String nombre, List<Pagina> listaPaginas) {

		this.nombre = nombre;
		this.listaPaginas = listaPaginas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Pagina> getListaPaginas() {
		return listaPaginas;
	}

	public void setListaPaginas(List<Pagina> listaPaginas) {
		this.listaPaginas = listaPaginas;

	}

}
