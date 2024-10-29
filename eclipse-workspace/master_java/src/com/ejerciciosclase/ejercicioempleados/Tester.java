package com.ejerciciosclase.ejercicioempleados;

public class Tester extends Empresa {

	private int pendienteTesting;

	public Tester(String nombre, String dNI, int edad, double sueldo, int pendienteTesting) {
		super(nombre, dNI, edad, sueldo);
		this.pendienteTesting = pendienteTesting;
	}

	public int getPendienteTesting() {
		return pendienteTesting;
	}

	public void setPendienteTesting(int pendienteTesting) {
		this.pendienteTesting = pendienteTesting;
	}

	@Override
	public String toString() {
		return "Empleado: " + nombre + "\nDNI: " + DNI + "\nEdad: " + edad + "\nSueldo: " + sueldo
				+ "€\nFuncion: Tester \nNumero de proyectos pendientes de testing: " + pendienteTesting;
	}

}
