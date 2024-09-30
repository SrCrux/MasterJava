package com.ejerciciosclase.ejercicioempleados;

public class Empresa {

	protected String nombre;
	protected String DNI;
	protected int edad;
	protected double sueldo;

	public Empresa(String nombre, String dNI, int edad, double sueldo) {
		super();
		this.nombre = nombre;
		DNI = dNI;
		this.edad = edad;
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public int getEdad() {
		return edad;
	}

	public double getSueldo() {
		return sueldo;
	}
	
	public void mostrarSueldo() {
		
		System.out.println("\tLa empresa tiene los siguientes sueldos:\n- El jefe cobra: ");
		
	}

}
