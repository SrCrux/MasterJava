package com.masterjava.ejerciciointerface;

/**
 * Clase que identifica que facturas le corresponden a cada cliente.
 * 
 * 
 * @author Pablo Guijarro
 * @version 1.0 25/09/2024
 *
 */
public class Factura implements Imprimible {

	private int nFactura;
	private int codigoCliente;

	public Factura(int nFactura, int codigoCliente) {

		this.nFactura = nFactura;
		this.codigoCliente = codigoCliente;
	}

	public int getnFactura() {
		return nFactura;
	}

	public void setnFactura(int nFactura) {
		this.nFactura = nFactura;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	@Override
	public void informeLargo() {

		System.out.println("La factura número " + nFactura + " pertenece al cliente " + codigoCliente);

	}

	@Override
	public void informeCorto() {

		System.out.println("Soy la factura número " + nFactura);
	}

}
