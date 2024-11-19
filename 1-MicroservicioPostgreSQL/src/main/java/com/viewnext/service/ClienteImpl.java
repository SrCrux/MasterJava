package com.viewnext.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viewnext.model.Cliente;
import com.viewnext.repository.IClienteRepo;

@Service
public class ClienteImpl implements ICliente {

	@Autowired
	IClienteRepo repository;

	@Override
	public List<Cliente> listarClientes() {
		return repository.findAll();
	}

	@Override
	public Cliente buscarCliente(int idCliente) {
		return repository.findById(idCliente).orElse(null);
	}

	@Override
	public void altaCliente(Cliente cliente) {
		repository.save(cliente);

	}

	@Override
	public void modificarCliente(Cliente cliente) {
		repository.save(cliente);

	}

	@Override
	public List<Cliente> bajaCliente(int idCliente) {
		repository.deleteById(idCliente);
		return repository.findAll();
	}

}
