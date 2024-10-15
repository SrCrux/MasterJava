package com.masterjava.service;

import java.util.ArrayList;
import java.util.List;

import com.masterjava.modelo.Curso;

public class CursoService {
	
	public List<Curso> getListaCursos(){
		Curso c1 = new Curso("Jardineria","Principiante");
		Curso c2 = new Curso("Bricolaje", "Avanzado");
		Curso c3 = new Curso("Mampostería", "Profesional");
		
		List<Curso> listaCursos = new ArrayList<>();
		listaCursos.add(c1);
		listaCursos.add(c2);
		listaCursos.add(c3);
		
		return listaCursos;
	}

}
