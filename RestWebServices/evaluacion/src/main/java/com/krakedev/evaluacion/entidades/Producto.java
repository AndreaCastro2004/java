package com.krakedev.evaluacion.entidades;

import java.math.BigDecimal;

public class Producto { //entidades
	private String id;
	private String nombre;
	private BigDecimal precioVenta;
	private BigDecimal precioCompra;
	private String idCategoria;
	
	public Producto() {}
	public Producto(String id, String nombre, BigDecimal precioVenta, BigDecimal precioCompra, String idCategoria) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precioVenta = precioVenta;
		this.precioCompra = precioCompra;
		this.idCategoria = idCategoria;
	}
	
	
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
	public BigDecimal getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(BigDecimal precioVenta) {
		this.precioVenta = precioVenta;
	}
	public BigDecimal getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(BigDecimal precioCompra) {
		this.precioCompra = precioCompra;
	}
	public String getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(String idCategoria) {
		this.idCategoria = idCategoria;
	}
	@Override 
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precioVenta=" + precioVenta + ", precioCompra="
				+ precioCompra + ", idCategoria=" + idCategoria + "]";
	}
	
	
	
	
}
