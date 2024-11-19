package com.viewnext.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido {

	@Id
	@Column(name = "id_pedido")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPedido;

	@JoinColumn(name = "id_cliente")
	private int idCliente;

	@Column(name = "fecha_pedido")
	private LocalDate fechaPedido;

	@Column(name = "precio_total")
	private double precioTotal;

	@Enumerated(EnumType.STRING)
	private EEstado estado;

	public Pedido() {
	}

	public Pedido(int idPedido, int idCliente, LocalDate fechaPedido, double precioTotal, EEstado estado) {
		this.idPedido = idPedido;
		this.idCliente = idCliente;
		this.fechaPedido = fechaPedido;
		this.precioTotal = precioTotal;
		this.estado = estado;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public LocalDate getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(LocalDate fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public EEstado getEstado() {
		return estado;
	}

	public void setEstado(EEstado estado) {
		this.estado = estado;
	}

}
