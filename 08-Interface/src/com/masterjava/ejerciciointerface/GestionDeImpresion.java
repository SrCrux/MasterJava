package com.masterjava.ejerciciointerface;

public class GestionDeImpresion {

	public static void main(String[] args) {
		
		Pagina pagina1 = new Pagina(2, 456);
		Factura factura1 = new Factura(0065, 34);
		
		pagina1.informeCorto();
		pagina1.informeLargo();
		System.out.println();
		factura1.informeCorto();
		factura1.informeLargo();

	}

}
