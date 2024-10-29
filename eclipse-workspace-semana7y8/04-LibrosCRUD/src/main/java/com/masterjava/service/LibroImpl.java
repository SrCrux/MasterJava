package com.masterjava.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.masterjava.model.Libro;

@Service
public class LibroImpl implements ILibro {

	public List<Libro> listaLibros;

	public LibroImpl() {
		listaLibros = new ArrayList<Libro>(
				List.of(new Libro(1, "Grecia", "Guia de viaje"), new Libro(2, "Java", "Programación"),
						new Libro(3, "Sustancia", "Terror"), new Libro(4, "Platón", "Filosofía")));
	}

	@Override
	public List<Libro> listarLibros() {
		return listaLibros;
	}

	@Override
	public Libro buscarLibro(int isbn) {
		for (int i = 0; i < listaLibros.size(); i++) {
			if (listaLibros.get(i).getIsbn() == isbn) {
				return listaLibros.get(i);
			}
		}
		return null;
	}

	@Override
	public void altaLibro(Libro libro) {
		if (!listaLibros.contains(libro)) {
			listaLibros.add(libro);
		}
	}

	@Override
	public void modificarLibro(Libro libro) {
		for (int i = 0; i < listaLibros.size(); i++) {
			if (listaLibros.get(i).getIsbn() == libro.getIsbn()) {
				listaLibros.get(i).setTitulo(libro.getTitulo());
				listaLibros.get(i).setTematica(libro.getTematica());
			}
		}
	}

	@Override
	public List<Libro> eliminarLibro(int isbn) {
		for (int i = 0; i < listaLibros.size(); i++) {
			if (listaLibros.get(i).getIsbn() == isbn) {
				listaLibros.remove(i);
			}
		}
		return listaLibros;
	}
}
