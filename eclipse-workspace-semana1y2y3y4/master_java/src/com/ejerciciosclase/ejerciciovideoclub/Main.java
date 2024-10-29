package com.ejerciciosclase.ejerciciovideoclub;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Videoclub v1 = new Videoclub();
		Pelicula p1 = new Pelicula(1234,"Parasitos");
		Pelicula p2 = new Pelicula(3212,"Past Lives");
		Pelicula p3 = new Pelicula(4318,"El viaje de Chihiro");
		Pelicula p4 = new Pelicula(0312,"American History X");
		Cliente c1 = new Cliente(120,"Patricio Estrella");
		Cliente c2 = new Cliente(78,"Ruth Hernandez");
		Prestamo prestamo1 = new Prestamo(c1,p1,LocalDate.now());
		Prestamo prestamo2 = new Prestamo(c2,p3,LocalDate.now());
		Prestamo prestamo3 = new Prestamo(c2,p2,LocalDate.now());
		
		v1.añadirCliente(c1);
		v1.añadirCliente(c2);
		v1.añadirPelicula(p1);
		v1.añadirPelicula(p2);
		v1.añadirPelicula(p3);
		v1.añadirPelicula(p4);
		v1.añadirPrestamo(prestamo1);
		v1.añadirPrestamo(prestamo2);
		v1.añadirPrestamo(prestamo3);
		System.out.println(v1.buscarPelicula(1234).getTitulo());
		System.out.println(v1.buscarCliente(78).getNombre());
		System.out.println(v1.getPrestamos());
		System.out.println(v1.getPrestamos(78));
		

	}

}
