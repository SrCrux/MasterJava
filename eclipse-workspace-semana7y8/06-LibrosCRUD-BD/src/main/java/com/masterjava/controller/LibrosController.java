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
import com.masterjava.service.ILibros;

@RestController
public class LibrosController {
	@Autowired
	ILibros iLibros;

	@GetMapping(value = "libros", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Libro> listarLibros() {
		return iLibros.listarLibros();
	}

	@GetMapping(value = "libros/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Libro buscarLibro(@PathVariable int isbn) {
		return iLibros.buscarLibro(isbn);
	}

	@PostMapping(value = "libros", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void altaLibro(@RequestBody Libro libro) {
		iLibros.altaLibro(libro);
	}

	@PutMapping(value = "libros", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void modificarLibro(@RequestBody Libro libro) {
		iLibros.modificarLibro(libro);
	}

	@DeleteMapping(value = "libros/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Libro> eliminarLibro(@PathVariable int isbn) {
		return iLibros.eliminarLibro(isbn);
	}

	@GetMapping(value = "libro/{titulo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Libro> buscarPorTitulo(@PathVariable String titulo) {
		return iLibros.buscarPorTitulo(titulo);
	}
}
