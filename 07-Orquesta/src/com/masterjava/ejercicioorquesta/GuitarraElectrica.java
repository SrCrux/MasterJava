package com.masterjava.ejercicioorquesta;

public class GuitarraElectrica extends Guitarra {

	protected int potencia;

	public GuitarraElectrica(String nombre, String tipo, int nCuerdas, int potencia) {
		super(nombre, tipo, nCuerdas);
		this.potencia = potencia;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public void tocar(Musico musico) {
		
		System.out.println(musico.getNombre()+ " " + musico.getApellido() + " está tocando la guitarra eléctrica");

	}

}
