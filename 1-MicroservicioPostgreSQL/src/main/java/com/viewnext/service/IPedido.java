package com.viewnext.service;

import java.util.List;

import com.viewnext.model.Pedido;

public interface IPedido {

	List<Pedido> listarPedidos();

	Pedido buscarPedido(int idPedido);

	void altaPedido(Pedido pedido);

	void modificarPedido(Pedido pedido);

	List<Pedido> bajaPedido(int idPedido);

	double beneficioTotalTienda();

}
