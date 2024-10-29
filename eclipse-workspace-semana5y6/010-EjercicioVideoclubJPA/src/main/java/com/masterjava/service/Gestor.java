package com.masterjava.service;

import java.util.List;

import com.masterjava.modelo.Pelicula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

/**
 * Clase Gestor que implementa métodos para la gestión de un videoclub.
 * 
 * @author Pablo Guijarro Pérez
 * @version 1.0 24/10/2024
 */
public class Gestor {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("bd_ejerciciovideoclub");
	private EntityManager em;
	private TypedQuery<Pelicula> pelicula;

	public List<Pelicula> listarPeliculas() {
		em = emf.createEntityManager();
		pelicula = em.createNamedQuery("listarPeliculas", Pelicula.class);
		return pelicula.getResultList();
	}

	public List<Pelicula> buscarPeliculaPorDirector(String director) {
		em = emf.createEntityManager();
		pelicula = em.createNamedQuery("buscarPeliculaPorDirector", Pelicula.class);
		pelicula.setParameter("director", director);
		return pelicula.getResultList();
	}

	public List<Pelicula> buscarPeliculaPorLetraInicialDirector(char letra) {
		em = emf.createEntityManager();
		pelicula = em.createNamedQuery("buscarPeliculaPorLetraInicialDirector", Pelicula.class);
		pelicula.setParameter("letra", letra + "%");
		return pelicula.getResultList();
	}

	public List<Pelicula> buscarPeliculasAlgunDirector(String director1, String director2) {
		em = emf.createEntityManager();
		pelicula = em.createNamedQuery("buscarPeliculasAlgunDirector", Pelicula.class);
		pelicula.setParameter("director1", director1);
		pelicula.setParameter("director2", director2);
		return pelicula.getResultList();
	}

	public List<String> buscarDirectores() {
		TypedQuery<String> director;
		em = emf.createEntityManager();
		director = em.createNamedQuery("buscarDirectores", String.class);
		return director.getResultList();
	}

	public List<Pelicula> listarPeliculaPrecio(double precio1, double precio2) {
		em = emf.createEntityManager();
		pelicula = em.createNamedQuery("listarPeliculasPrecio", Pelicula.class);
		pelicula.setParameter("precio1", precio1);
		pelicula.setParameter("precio2", precio2);
		return pelicula.getResultList();
	}

	public List<Object[]> cantidadPeliculasPorPrecio() {
		TypedQuery<Object[]> objeto;
		em = emf.createEntityManager();
		objeto = em.createNamedQuery("cantidadPeliculasPorPrecio", Object[].class);
		return objeto.getResultList();
	}
}
