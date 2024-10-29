package com.masterjava.modelos;

import java.util.ArrayList;
import java.util.List;

public class Persona {

	private String nombre;
	private List<Curso> listaCursos;

	public Persona(String nombre) {

		this.nombre = nombre;
		listaCursos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Curso> getListaCursos() {
		return listaCursos;
	}

	public void setListaCursos(List<Curso> listaCursos) {
		this.listaCursos = listaCursos;
	}

	public List<Curso> addCursoLista(Curso curso) {

		listaCursos.add(curso);

		return listaCursos;

	}

}
