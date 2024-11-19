package com.viewnext.service;

import java.util.List;

import com.viewnext.model.Animal;

public interface IAnimal {

	List<Animal> listarAnimales();

	Animal buscarAnimal(int idAnimal);

	void altaAnimal(Animal animal);

	void modificarAnimal(Animal animal);

	List<Animal> bajaAnimal(int idAnimal);

}
