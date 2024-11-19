package com.viewnext.model;

import java.util.List;

public class AnimalPedidoDTO {

	private int idPedido;
	private List<Integer> idAnimales;

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public List<Integer> getIdAnimales() {
		return idAnimales;
	}

	public void setIdAnimales(List<Integer> idAnimales) {
		this.idAnimales = idAnimales;
	}

}
