package com.viewnext.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viewnext.model.Cliente;

public interface IClienteRepo extends JpaRepository<Cliente, Integer>{

}
