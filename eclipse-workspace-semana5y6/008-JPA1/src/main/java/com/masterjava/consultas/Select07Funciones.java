package com.masterjava.consultas;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Select07Funciones {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em = emf.createEntityManager();

		TypedQuery<String> consulta = em.createQuery("SELECT UPPER(l.autor) FROM Libro l", String.class);
		List<String> listaAutores = consulta.getResultList();
		for (String autor : listaAutores) {
			System.out.println(autor);
		}

	}
}
