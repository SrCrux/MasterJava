package com.masterjava.ejerciciolibreria;

public class Libreria {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro(12345,"Titulo 1","Yo",1237);
		Libro libro2 = new Libro(54321,"Titulo2","El",875);
		
		
		System.out.println(libro1);
		System.out.println(libro2);
		libro1.compararLibroPorPaginas(libro2);
		
	}

}
