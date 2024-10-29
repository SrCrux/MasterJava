package com.ejerciciosclase.ejercicioempleados;

public class Directivo extends Empresa {

	private double porcentajeSueldo;
	private double bonus;
	private double sueldoTotal;

	public Directivo(String nombre, String dNI, int edad, double sueldo, double porcentajeSueldo) {
		super(nombre, dNI, edad, sueldo);
		this.porcentajeSueldo = porcentajeSueldo;
		calcularBonus();

	}

	public double getPorcentajeSueldo() {
		return porcentajeSueldo;
	}

	public void setPorcentajeSueldo(double porcentajeSueldo) {
		this.porcentajeSueldo = porcentajeSueldo;
	}

	public double getBonus() {
		return bonus;
	}

	public double getSueldoTotal() {
		return sueldoTotal;
	}

	private double calcularBonus() {

		bonus = (porcentajeSueldo / 100) * sueldo;

		sueldoTotal = bonus + sueldo;

		return sueldoTotal;

	}

	@Override
	public String toString() {
		return "Empleado: " + nombre + "\nDNI: " + DNI + "\nEdad: " + edad + "\nSueldo: " + sueldo
				+ "€\nFuncion: Directivo \nPorcentaje en bonus: " + porcentajeSueldo;
	}

}
