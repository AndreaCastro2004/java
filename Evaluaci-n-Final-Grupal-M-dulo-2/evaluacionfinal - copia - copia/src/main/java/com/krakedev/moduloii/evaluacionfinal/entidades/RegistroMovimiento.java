package com.krakedev.moduloii.evaluacionfinal.entidades;

import java.util.Date;

public class RegistroMovimiento {
	private int id;
	private Articulo id_articulos;
	private int cantidad;
	private java.util.Date fecha_movimiento;
	
	public RegistroMovimiento(int id, Articulo id_articulos, int cantidad, Date fecha_movimiento) {
		super();
		this.id = id;
		this.id_articulos = id_articulos;
		this.cantidad = cantidad;
		this.fecha_movimiento = fecha_movimiento;
	}
	
	public RegistroMovimiento() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Articulo getId_articulos() {
		return id_articulos;
	}

	public void setId_articulos(Articulo id_articulos) {
		this.id_articulos = id_articulos;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public java.util.Date getFecha_movimiento() {
		return fecha_movimiento;
	}

	public void setFecha_movimiento(java.util.Date fecha_movimiento) {
		this.fecha_movimiento = fecha_movimiento;
	}

	@Override
	public String toString() {
		return "RegistroMovimiento [id=" + id + ", id_articulos=" + id_articulos + ", cantidad=" + cantidad
				+ ", fecha_movimiento=" + fecha_movimiento + "]";
	}	
	
}
