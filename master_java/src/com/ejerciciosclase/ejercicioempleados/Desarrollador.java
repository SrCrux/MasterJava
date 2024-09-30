package com.ejerciciosclase.ejercicioempleados;

public class Desarrollador extends Empresa {

	private boolean java;
	private boolean js;
	private boolean net;

	public Desarrollador(String nombre, String dNI, int edad, double sueldo, boolean java, boolean js, boolean net) {
		super(nombre, dNI, edad, sueldo);
		this.java = java;
		this.js = js;
		this.net = net;
	}

	public void setJava(boolean java) {
		this.java = java;
	}

	public void setJs(boolean js) {
		this.js = js;
	}

	public void setNet(boolean net) {
		this.net = net;
	}

	public boolean isJava() {
		return java;
	}

	public boolean isJs() {
		return js;
	}

	public boolean isNet() {
		return net;
	}

	@Override
	public String toString() {
		return "Empleado: " + nombre + "\nDNI: " + DNI + "\nEdad: " + edad + "\nSueldo: " + sueldo
				+ "€\nFuncion: Desarrollador \nDispone de conocimientos en: \n" + (java ? "Java\n" : "\n")
				+ (js ? "JavaScript\n" : "\n") + (net ? ".Net" : "\n");
	}

}
