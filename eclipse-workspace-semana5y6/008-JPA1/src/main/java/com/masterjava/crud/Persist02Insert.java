package com.masterjava.crud;

import com.masterjava.modelo.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Persist02Insert {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em = emf.createEntityManager();

		Libro libro = new Libro("1A", "Parasitos", "Jon Bon-Hoo", 68);
		em.getTransaction().begin();
		em.persist(libro);
		em.getTransaction().commit();

	}

}