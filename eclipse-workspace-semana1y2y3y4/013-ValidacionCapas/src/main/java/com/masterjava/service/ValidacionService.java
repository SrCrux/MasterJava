package com.masterjava.service;

import java.util.List;

import com.masterjava.modelo.Perfil;

public class ValidacionService {

	private List<Perfil> listaPerfiles = List.of(

			new Perfil("admin", "1234", "admin@mail.com", 45), new Perfil("user", "4321", "user@mail.com", 65),
			new Perfil("señor", "2413", "señor@mail.com", 28), new Perfil("señora", "1324", "señora@mail.com", 32));

	public Perfil autenticar(String nombre, String password) {

		return listaPerfiles.stream().filter(x -> x.getNombre().equals(nombre) && x.getPassword().equals(password))
				.findFirst().orElse(null);
	}

}
