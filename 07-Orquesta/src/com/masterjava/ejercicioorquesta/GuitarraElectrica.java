package com.masterjava.ejercicioorquesta;
/**
 * Clase que identifica que instrumento va a tocar un músico.
 * 
 * @author Pablo Guijarro
 * @version 1.0
 */
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
