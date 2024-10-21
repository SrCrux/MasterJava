package com.masterjava.modelo;

/**
 * Clase modelo que implementa un objeto, sus atributos y métodos para simular a
 * un empleado del mundo real.
 * 
 * @author Pablo Guijarro Pérez 21/10/2024
 * @version 1.0
 */
public class Empleado {

	private String nombre;
	private String apellido1;
	private String apellido2;
	private String fechaNacimiento;
	private double sueldo;

	public Empleado(String nombre, String apellido1, String apellido2, String fechaNacimiento, double sueldo) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldo = sueldo;
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

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

}
