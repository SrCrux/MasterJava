package com.curso.principales;

import com.curso.model.Categoria;
import com.curso.model.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Principal3 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bd_biblioteca");
		EntityManager em = emf.createEntityManager();
	
		
		em.getTransaction().begin();
		
		Libro libro= new Libro("002", "Rayos y rallas", "Polo", 20);
		
		Categoria categoria = new Categoria("Python", "Desarrolo de aplicaciones para python");
		libro.setCategoria(categoria);
		em.persist(categoria);
		em.persist(libro);
		em.getTransaction().commit();
		
		
	}
}