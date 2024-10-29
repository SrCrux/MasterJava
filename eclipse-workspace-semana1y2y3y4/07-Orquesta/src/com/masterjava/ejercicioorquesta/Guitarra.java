package com.masterjava.ejercicioorquesta;

public class Guitarra extends Instrumento {

	protected int nCuerdas;

	public Guitarra(String nombre, String tipo, int nCuerdas) {
		super(nombre, tipo);
		this.nCuerdas = nCuerdas;
	}

	public int getnCuerdas() {
		return nCuerdas;
	}

	public void setnCuerdas(int nCuerdas) {
		this.nCuerdas = nCuerdas;
	}

}
