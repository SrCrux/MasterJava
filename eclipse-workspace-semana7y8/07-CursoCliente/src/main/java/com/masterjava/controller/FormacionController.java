package com.masterjava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masterjava.model.Formacion;
import com.masterjava.service.IFormacion;

@RestController
public class FormacionController {
	@Autowired
	IFormacion iFormacion;

	@GetMapping(value = "formacion")
	public List<Formacion> listarCursos() {
		return iFormacion.listarCursos();
	}

	@PostMapping(value = "formacion/{curso}/{asignaturas}/{precio}")
	public void altaCurso(@PathVariable String curso, @PathVariable int asignaturas, @PathVariable double precio) {
		Formacion formacion = new Formacion(curso, asignaturas, precio);
		iFormacion.altaCurso(formacion);
	}

}
