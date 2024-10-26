package com.krakedev.moduloii.evaluacionfinal.entidades;

import java.math.BigDecimal;

public class Articulo {
	private String id;
	private String nombre;
	private BigDecimal precio_venta;
	private BigDecimal precio_compra;
	private Grupo id_grupo;
	
	public Articulo(String id, String nombre, BigDecimal precio_venta, BigDecimal precio_compra, Grupo id_grupo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio_venta = precio_venta;
		this.precio_compra = precio_compra;
		this.id_grupo = id_grupo;
	}
	
	public Articulo() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecio_venta() {
		return precio_venta;
	}

	public void setPrecio_venta(BigDecimal precio_venta) {
		this.precio_venta = precio_venta;
	}

	public BigDecimal getPrecio_compra() {
		return precio_compra;
	}

	public void setPrecio_compra(BigDecimal precio_compra) {
		this.precio_compra = precio_compra;
	}

	public Grupo getId_grupo() {
		return id_grupo;
	}

	public void setId_grupo(Grupo id_grupo) {
		this.id_grupo = id_grupo;
	}

	@Override
	public String toString() {
		return "Articulo [id=" + id + ", nombre="+ nombre +", precio_venta=" + precio_venta + ", precio_compra="
				+ precio_compra + ", id_grupo=" + id_grupo + "]";
	}
	
	
}
