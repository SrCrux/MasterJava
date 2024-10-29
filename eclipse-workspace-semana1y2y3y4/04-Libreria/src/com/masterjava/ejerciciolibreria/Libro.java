package com.masterjava.ejerciciolibreria;

public class Libro{

	private int isbn;
	private String titulo;
	private String autor;
	private int nPaginas;

	public Libro(int isbn, String titulo, String autor, int nPaginas) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.nPaginas = nPaginas;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getnPaginas() {
		return nPaginas;
	}

	public void setnPaginas(int nPaginas) {
		this.nPaginas = nPaginas;
	}
	
	@Override
	public String toString() {
		return "El libro " + this.titulo + " con ISBN " + this.isbn + " escrito por el autor "+  this.autor + " tiene " + this.nPaginas + " páginas.\n";
	}

	public void compararLibroPorPaginas(Libro segundoLibro){
		
		if (this.nPaginas > segundoLibro.getnPaginas()) {
			
			System.out.println("El libro: " + this.titulo + " tiene más páginas (" + this.nPaginas + ") que el libro " + segundoLibro.getTitulo()+ " (" + segundoLibro.getnPaginas() + ").");
			
		}else if (this.nPaginas < segundoLibro.getnPaginas()) {
			
			System.out.println("El libro: " + segundoLibro.getTitulo() + " tiene más páginas (" + segundoLibro.getnPaginas() + ") que el libro " + this.titulo+ " (" + this.nPaginas + ").");
		}else {
			
			System.out.println("Los 2 libros tienen el mismo número de páginas (" + this.nPaginas + ")");
			
		}

	}

}
