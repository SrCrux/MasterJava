package com.viewnext.service;

import java.util.List;

import com.viewnext.model.Cliente;

public interface ICliente {

	List<Cliente> listarClientes();

	Cliente buscarCliente(int idCliente);

	void altaCliente(Cliente cliente);

	void modificarCliente(Cliente cliente);

	List<Cliente> bajaCliente(int idCliente);

}
