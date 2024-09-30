package com.ejerciciosclase.ejercicioempleados;

public class Test {

	public static void main(String[] args) {
		Empresa directivo = new Directivo("Manuel Galatea", " 56879801T", 59, 42000, 10);
		Empresa desarrollador1 = new Desarrollador("Juan Carlos", "70986563G", 36, 19000, true, true, true);
		Empresa tester1 = new Tester("Luis Becas","78431265P",21,17000,8);
		System.out.println(directivo);
		System.out.println();
		System.out.println(desarrollador1);
		System.out.println();
		System.out.println(tester1);

	}

}
