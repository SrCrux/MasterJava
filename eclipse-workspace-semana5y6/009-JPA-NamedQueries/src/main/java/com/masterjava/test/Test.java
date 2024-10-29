package com.masterjava.test;

import java.util.List;

import com.masterjava.modelo.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Test {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em = emf.createEntityManager();

		TypedQuery<Libro> consulta = em.createNamedQuery("buscarTodos", Libro.class);
		List<Libro> listaLibros = consulta.getResultList();
		for (Libro l : listaLibros) {
			System.out.println(l);
		}

	}

}
