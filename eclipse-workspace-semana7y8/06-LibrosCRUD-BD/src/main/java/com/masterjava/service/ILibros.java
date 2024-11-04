package com.masterjava.service;

import java.util.List;

import com.masterjava.model.Libro;

public interface ILibros {

	List<Libro> listarLibros();

	Libro buscarLibro(int isbn);

	void altaLibro(Libro libro);

	void modificarLibro(Libro libro);

	List<Libro> eliminarLibro(int isbn);
	
	List<Libro> buscarPorTitulo(String titulo);

}
