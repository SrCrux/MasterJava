package com.viewnext.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "animales")
public class Animal {
	@Id
	@Column(name = "id_animal")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAnimal;

	private String nombre;

	@Enumerated(EnumType.STRING)
	private ETipo tipo;

	private int edad;

	@Column(name = "precio_compra")
	double precioCompra;
	
	@Column(name = "precio_venta")
	double precioVenta;

	@Enumerated(EnumType.STRING)
	private EEstado estado;

	public Animal() {
	}

	public Animal(int idAnimal, String nombre, ETipo tipo, int edad, double precioCompra, double precioVenta,
			EEstado estado) {
		this.idAnimal = idAnimal;
		this.nombre = nombre;
		this.tipo = tipo;
		this.edad = edad;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.estado = estado;
	}

	public int getIdAnimal() {
		return idAnimal;
	}

	public void setIdAnimal(int idAnimal) {
		this.idAnimal = idAnimal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ETipo getTipo() {
		return tipo;
	}

	public void setTipo(ETipo tipo) {
		this.tipo = tipo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public EEstado getEstado() {
		return estado;
	}

	public void setEstado(EEstado estado) {
		this.estado = estado;
	}

}
