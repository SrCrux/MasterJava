package com.masterjava.ejerciciointerface;


/**
 * Clase que identifica las páginas y líneas de un informe
 * 
 * 
 * @author Pablo Guijarro
 * @version 1.0 25/09/2024
 *
 */
public class Pagina implements Imprimible {

	private int nPagina;
	private int nLineas;

	public Pagina(int nPaginas, int nLineas) {

		this.nPagina = nPaginas;
		this.nLineas = nLineas;
	}

	public int getnPaginas() {
		return nPagina;
	}

	public void setnPaginas(int nPaginas) {
		this.nPagina = nPaginas;
	}

	public int getnLineas() {
		return nLineas;
	}

	public void setnLineas(int nLineas) {
		this.nLineas = nLineas;
	}
	
	
	@Override
	public void informeLargo() {

		System.out.println("Este informe dispone de " + nPagina + " páginas y " + nLineas + " líneas.");

	}

	@Override
	public void informeCorto() {

		System.out.println("Este informe dispone de " + nPagina + " páginas.");
	}

}
