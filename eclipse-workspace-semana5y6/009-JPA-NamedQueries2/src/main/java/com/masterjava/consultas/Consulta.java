package com.masterjava.consultas;

import java.util.List;

import com.masterjava.modelo.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Consulta {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
	private EntityManager em;
	TypedQuery<Libro> libro;

	public List<Libro> buscarTodos() {
		em = emf.createEntityManager();
		libro = em.createNamedQuery("buscarTodos", Libro.class);
		return libro.getResultList();
	}

	public List<Libro> buscarPorIsbn(String isbn) {
		em = emf.createEntityManager();
		libro = em.createNamedQuery("buscarPorIsbn", Libro.class);
		libro.setParameter("isbn", isbn);
		return libro.getResultList();

	}
}
