package com.masterjava.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "personas")
@NamedQueries({ @NamedQuery(name = "listarPersonas", query = "SELECT p FROM Persona p"),
		@NamedQuery(name = "buscarPorTelefono", query = "SELECT p FROM Persona p WHERE p.telefono = :telefono"),
		@NamedQuery(name = "buscarPorPrimerApellido", query = "SELECT p FROM Persona p WHERE p.apellido1 = :apellido1"),
		@NamedQuery(name = "buscarPorApellidos", query = "SELECT p FROM Persona p WHERE p.apellido1 = :apellido1 AND p.apellido2 = :apellido2") })
/**
 * Clase Persona que implementa querys JPQL para realizar consultas en bases de
 * datos mediante un modelo persona.
 * 
 * @author Pablo Guijarro Pérez
 * @version 1.0 24/10/2024
 */
public class Persona {
	@Id
	private int telefono;
	private String nombre;
	private String apellido1;
	private String apellido2;

	public Persona() {
	}

	public Persona(int telefono, String nombre, String apellido1, String apellido2) {
		this.telefono = telefono;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	@Override
	public String toString() {
		return "Persona:\n Nombre: " + nombre + "\n Apellidos: " + apellido1 + " " + apellido2 + "\n Telefono: "
				+ telefono;
	}

}
