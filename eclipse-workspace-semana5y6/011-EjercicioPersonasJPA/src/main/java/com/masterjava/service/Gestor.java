package com.masterjava.service;

import java.util.List;

import com.masterjava.modelo.Persona;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

/**
 * Clase Gestor que implementa métodos para la gestión de personas.
 * 
 * @author Pablo Guijarro Pérez
 * @version 1.0 24/10/2024
 */
public class Gestor {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("bd_ejerciciopersonas");
	private EntityManager em;
	private TypedQuery<Persona> persona;

	public List<Persona> listarPersonas() {
		em = emf.createEntityManager();
		persona = em.createNamedQuery("listarPersonas", Persona.class);
		return persona.getResultList();
	}

	public List<Persona> buscarPorTelefono(int telefono) {
		em = emf.createEntityManager();
		persona = em.createNamedQuery("buscarPorTelefono", Persona.class);
		persona.setParameter("telefono", telefono);
		return persona.getResultList();
	}

	public List<Persona> buscarPorPrimerApellido(String apellido1) {
		em = emf.createEntityManager();
		persona = em.createNamedQuery("buscarPorPrimerApellido", Persona.class);
		persona.setParameter("apellido1", apellido1);
		return persona.getResultList();
	}

	public List<Persona> buscarPorApellidos(String apellido1, String apellido2) {
		em = emf.createEntityManager();
		persona = em.createNamedQuery("buscarPorApellidos", Persona.class);
		persona.setParameter("apellido1", apellido1);
		persona.setParameter("apellido2", apellido2);
		return persona.getResultList();
	}

}
