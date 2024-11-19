package com.viewnext.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viewnext.model.AnimalPedido;

public interface IAnimalPedidoRepo extends JpaRepository<AnimalPedido, Integer> {

}
