package com.ejerciciosclase.ejerciciopersona;

public class Main {
	
	public static void main(String[] args) {
		
		Persona p1 = new Persona("Manolo García", 60, 'M', 80, 1.72);
		Persona p2 = new Persona("Tamara Random", 42, 'f',54,1.67);
		Persona p3 = new Persona("Nombre Apellido",25,'o',120,1.80);
		
		p1.calcularIMC();
		p2.calcularIMC();
		p3.calcularIMC();
		System.out.println("Mayor de edad: "+p1.esMayorDeEdad());
		System.out.println("Mayor de edad: "+p2.esMayorDeEdad());
		System.out.println("Mayor de edad: "+p3.esMayorDeEdad());
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	
	}
}
