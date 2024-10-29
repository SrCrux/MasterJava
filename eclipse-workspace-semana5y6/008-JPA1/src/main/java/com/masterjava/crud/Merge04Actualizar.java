package com.masterjava.crud;

import com.masterjava.modelo.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Merge04Actualizar {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em = emf.createEntityManager();

		Libro libro = em.find(Libro.class, "1B");

		em.getTransaction().begin();
		libro.setAutor("Aki Kaürismaki");
		em.merge(libro);
		em.getTransaction().commit();

	}

}
