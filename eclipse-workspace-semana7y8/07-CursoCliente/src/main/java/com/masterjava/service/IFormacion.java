package com.masterjava.service;

import java.util.List;

import com.masterjava.model.Formacion;

public interface IFormacion {

	List<Formacion> listarCursos();

	void altaCurso(Formacion formacion);

}
