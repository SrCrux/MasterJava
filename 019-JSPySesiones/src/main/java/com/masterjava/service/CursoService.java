package com.masterjava.service;

import java.util.ArrayList;
import java.util.List;

import com.masterjava.modelo.Curso;

public class CursoService {

	private static List<Curso> listaCursos = new ArrayList<Curso>();

	static {

		Curso c1 = new Curso("Jardineria", "Principiante");
		Curso c2 = new Curso("Bricolaje", "Avanzado");
		Curso c3 = new Curso("Mampostería", "Profesional");
		
		listaCursos.add(c1);
		listaCursos.add(c2);
		listaCursos.add(c3);
	}

	public List<Curso> getListaCursos() {
		return listaCursos;
	}

	public Curso getCurso(String nombre) {

		for (Curso c : listaCursos) {
			if (c.getNombre().equalsIgnoreCase(nombre)) {
				return c;
			}
		}
		return null;
	}

}
