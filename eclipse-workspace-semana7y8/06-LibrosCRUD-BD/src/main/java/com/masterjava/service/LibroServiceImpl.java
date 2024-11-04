package com.masterjava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masterjava.model.Libro;
import com.masterjava.repository.ILibrosRepository;

@Service
public class LibroServiceImpl implements ILibros {
	@Autowired
	ILibrosRepository repository;

	@Override
	public List<Libro> listarLibros() {
		return repository.findAll();
	}

	@Override
	public Libro buscarLibro(int isbn) {
		return repository.findById(isbn).orElse(null);
	}

	@Override
	public void altaLibro(Libro libro) {
		repository.save(libro);
	}

	@Override
	public void modificarLibro(Libro libro) {
		repository.save(libro);

	}

	@Override
	public List<Libro> eliminarLibro(int isbn) {
		repository.deleteById(isbn);
		return repository.findAll();
	}

	@Override
	public List<Libro> buscarPorTitulo(String titulo) {
		return repository.buscarPorTitulo(titulo);
	}
}
