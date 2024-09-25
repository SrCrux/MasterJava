package com.ejerciciosclase.ejerciciopersona;

import java.util.Random;

public class Persona {

	private String nombre;
	private int edad;
	private String DNI;
	private char genero;
	private double peso;
	private double altura;

	public Persona(String nombre) {

		this.nombre = nombre;
	}

	public Persona(String nombre, int edad, char genero) {

		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}

	public Persona(String nombre, int edad, char genero, double peso, int altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char género) {
		this.genero = género;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getDNI() {
		return DNI;
	}

	public int calcularIMC() {

		if (peso / (altura * 2) < 20) {

			return -1;

		} else if ((peso / (altura * 2) > 20) && (peso / (altura * 2) < 25)) {

			return 0;

		} else {

			return 1;
		}

	}

	public boolean esMayorDeEdad() {

		if (edad >= 18) {

			return true;
		} else {

			return false;
		}

	}

	private char comprobarGenero(char letra) {

		if (letra == 'M' || letra == 'm' || letra == 'F' || letra == 'f' || letra == 'O' || letra == 'o') {

			return letra;

		} else {

			return 'H';

		}

	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\n Edad:" + edad + "\nDNI= " + DNI + "\nGenero= " + comprobarGenero(genero)
				+ "\nPeso= " + peso + "Kg\nAltura=" + altura + "m";
	}

	public String generaDNI() {
		
		int numeroDNIRandom = (int) (Math.random()*10000000);
		
		
				
		

		char[] letraDNI = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
				'H', 'L', 'C', 'K', 'E' };

		if (numeroDNIRandom<=)
		
	}

}
