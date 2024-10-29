package com.ejerciciosclase.ejerciciopersona;


public class Persona {

	private String nombre;
	private int edad;
	private String DNI;
	private char genero;
	private double peso;
	private double altura;

	public Persona(String nombre) {

		this.nombre = nombre;
		DNI = generaDNI();
		
	}

	public Persona(String nombre, int edad, char genero) {

		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		DNI = generaDNI();
		
	}

	public Persona(String nombre, int edad, char genero, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.peso = peso;
		this.altura = altura;
		DNI = generaDNI();
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

	public void setDNI(String DNI) {

		this.DNI = DNI;

	}

	public void calcularIMC() {

		if (peso / (altura * 2) < 20) {

			System.out.println("Estás mu delga@, hay que subir peso");

		} else if ((peso / (altura * 2) > 20) && (peso / (altura * 2) < 25)) {

			System.out.println("Estas to buen@");

		} else {

			System.out.println("Estas reguler@, hay que bajar peso");
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
		return "Nombre: " + nombre + "\nEdad:" + edad + "\nDNI= " + DNI + "\nGenero= " + comprobarGenero(genero)
				+ "\nPeso= " + peso + "Kg\nAltura=" + altura + "m";
	}

	private String generaDNI() {

		int numero;
		int resto;
		String cadena = "";
		char letraDNI;

		char[] letrasDNI = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
				'H', 'L', 'C', 'K', 'E' };

		for (int i = 0; i < 8; i++) {

			numero = (int) (Math.random() * 10);
			cadena = cadena + numero;

		}

		resto = Integer.parseInt(cadena) % 23;
		letraDNI = letrasDNI[resto];
		cadena += letraDNI;
		return cadena;
	}

}
