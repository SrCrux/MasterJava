package com.viewnext.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viewnext.model.Animal;

public interface IAnimalRepo extends JpaRepository<Animal, Integer> {

}
