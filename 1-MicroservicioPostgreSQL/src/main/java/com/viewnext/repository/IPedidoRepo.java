package com.viewnext.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viewnext.model.Pedido;

public interface IPedidoRepo extends JpaRepository<Pedido, Integer> {

}
