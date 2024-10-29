package com.masterjava.crud;

import com.masterjava.modelo.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Find01Recuperar {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");// el nombre de la unidad de
																						// persistencia del
																						// persistence.xml
		EntityManager em = emf.createEntityManager();
		Libro libro = em.find(Libro.class, "1A");
		
		if(libro!=null) {
			
		System.out.println(libro.toString());
		}else {
			System.out.println("Libro no encontrado");
		}
	}
}
