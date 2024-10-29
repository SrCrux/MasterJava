package com.masterjava.service;

import java.util.List;

import com.masterjava.model.Libro;

public interface ILibro {

	public List<Libro> listarLibros();

	public Libro buscarLibro(int isbn);

	public void altaLibro(Libro libro);

	public void modificarLibro(Libro libro);

	public List<Libro> eliminarLibro(int isbn);
}