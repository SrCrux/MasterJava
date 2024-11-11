package com.masterjava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masterjava.model.Ejemplar;
import com.masterjava.service.IEjemplar;

@RestController
public class EjemplarController {

	@Autowired
	IEjemplar iEjemplar;

	@PostMapping(value = "ejemplar/{isbn}/{titulo}/{tematica}")
	public List<Ejemplar> nuevoEjemplar(@PathVariable int isbn, @PathVariable String titulo,
			@PathVariable String tematica) {
		Ejemplar ejemplar = new Ejemplar(isbn, titulo, tematica);
		return iEjemplar.nuevoEjemplar(ejemplar);

	}
}
