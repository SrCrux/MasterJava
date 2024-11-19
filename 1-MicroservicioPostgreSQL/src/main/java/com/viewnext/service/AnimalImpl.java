package com.viewnext.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viewnext.model.Animal;
import com.viewnext.model.EEstado;
import com.viewnext.repository.IAnimalRepo;

@Service
public class AnimalImpl implements IAnimal {

	@Autowired
	IAnimalRepo repository;

	@Override
	public List<Animal> listarAnimales() {
		return repository.findAll();
	}

	@Override
	public Animal buscarAnimal(int idAnimal) {
		return repository.findById(idAnimal).orElse(null);
	}

	@Override
	public void altaAnimal(Animal animal) {
		animal.setEstado(EEstado.DISPONIBLE);
		repository.save(animal);

	}

	@Override
	public void modificarAnimal(Animal animal) {
		repository.save(animal);
	}

	@Override
	public List<Animal> bajaAnimal(int idAnimal) {
		repository.deleteById(idAnimal);
		return repository.findAll();
	}

}
