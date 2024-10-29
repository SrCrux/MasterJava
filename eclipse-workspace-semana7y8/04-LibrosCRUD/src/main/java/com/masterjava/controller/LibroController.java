package com.masterjava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masterjava.model.Libro;
import com.masterjava.service.ILibro;

@RestController
public class LibroController {
	@Autowired
	private ILibro iLibro;

	@GetMapping(value = "libros", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Libro> listarLibros() {
		return iLibro.listarLibros();
	}

	@GetMapping(value = "libros/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Libro buscarLibro(@PathVariable int isbn) {
		return iLibro.buscarLibro(isbn);
	}

	@PostMapping(value = "libros", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void altaLibro(@RequestBody Libro libro) {
		iLibro.altaLibro(libro);
	}

	@PutMapping(value = "libros", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void modificarLibro(@RequestBody Libro libro) {
		iLibro.modificarLibro(libro);
	}

	@DeleteMapping(value = "libros/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Libro> eliminarLibro(@PathVariable int isbn) {
		return iLibro.eliminarLibro(isbn);
	}
}
