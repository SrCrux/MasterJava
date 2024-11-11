package com.masterjava.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.masterjava.model.CursoAux;
import com.masterjava.model.Formacion;

@Service
public class FormacionImpl implements IFormacion {
	@Autowired
	RestTemplate template;

	private final String URL = "http://localhost:8080/cursos";

	@Override
	public List<Formacion> listarCursos() {
		List<CursoAux> cursos = Arrays.asList(template.getForObject(URL, CursoAux[].class));
		List<Formacion> formaciones = new ArrayList<Formacion>();
		for (CursoAux curso : cursos) {
			int asignaturas = (curso.getDuracion() >= 50) ? 10 : 5;
			formaciones.add(new Formacion(curso.getNombre(), asignaturas, curso.getPrecio()));
		}
		return formaciones;
	}

	@Override
	public void altaCurso(Formacion formacion) {

		int duracion = formacion.getAsignaturas() * 10;
		CursoAux curso = new CursoAux(formacion.getCurso(), duracion, formacion.getPrecio());
		template.postForLocation(URL, curso);

	}

}
