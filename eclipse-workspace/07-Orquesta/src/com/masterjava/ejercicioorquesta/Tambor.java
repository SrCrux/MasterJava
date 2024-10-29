package com.masterjava.ejercicioorquesta;

public class Tambor extends Instrumento{
	
	private int tamaño;

	public Tambor(String nombre, String tipo, int tamaño) {
		super(nombre, tipo);
		this.tamaño = tamaño;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	
	public void aporrear(Musico musico) {
		
		System.out.println(musico.getNombre()+ " " + musico.getApellido() + " está aporreando el " + nombre);
		
	}

}
