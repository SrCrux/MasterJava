package com.ejerciciosclase.ejerciciovideoclub;

public class Cliente {
	
	private int nCarnet;
	private String nombre;
	
	public Cliente(int nCarnet, String nombre) {
		this.nCarnet = nCarnet;
		this.nombre = nombre;
	}
	public int getnCarnet() {
		return nCarnet;
	}
	public void setnCarnet(int nCarnet) {
		this.nCarnet = nCarnet;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
