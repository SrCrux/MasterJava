package com.masterjava.crud;

import com.masterjava.modelo.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Remove03Eliminar {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em = emf.createEntityManager();

		Libro libro = em.find(Libro.class, "1A");

		em.getTransaction().begin();
		em.remove(libro);
		em.getTransaction().commit();

	}

}
