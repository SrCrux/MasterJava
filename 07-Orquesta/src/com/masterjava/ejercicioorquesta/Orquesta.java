package com.masterjava.ejercicioorquesta;

public class Orquesta {

	public static void main(String[] args) {
		
		
		
		Flauta flauta = new Flauta("Flauta","Travesera","UP205");
		GuitarraElectrica gElectrica = new GuitarraElectrica("Guitarra Eléctrica", "Electrica", 5, 250);
		Tambor tambor = new Tambor("Tambor", "Tambor", 100);
		Musico musico1 = new Musico("Sara", "Swinfer",flauta);
		Musico musico2 = new Musico("Jon", "Cortajarena",gElectrica);
		Musico musico3 = new Musico("Ruth", "Favonessi", tambor);
		
		System.out.println("¡Damas y caballeros, procedemos a introducir a los músicos que componen la orquesta de esta noche!");
		System.out.println(musico1);	
		System.out.println(musico2);
		System.out.println(musico3);
		System.out.println("Los músicos van a afinar los instrumentos antes de la actuación.");
		flauta.afinar();
		gElectrica.afinar();
		tambor.afinar();
		System.out.println("¡Que comience el espectáculo!");
		flauta.tocar(musico1);
		gElectrica.tocar(musico2);
		tambor.aporrear(musico3);
	}

}
