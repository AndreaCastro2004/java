package com.krakedev.evaluacion.entidades;

import java.util.Date;

public class HistorialMovimiento {
	private String id;
	private String idProducto;
	private int cantidad;
	private Date fechaMovimiento;
	
	public HistorialMovimiento() {}
	public HistorialMovimiento(String id, String idProducto, int cantidad, Date fechaMovimiento) {
		super();
		this.id = id;
		this.idProducto = idProducto;
		this.cantidad = cantidad;
		this.fechaMovimiento = fechaMovimiento;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Date getFechaMovimiento() {
		return fechaMovimiento;
	}
	public void setFechaMovimiento(Date fechaMovimiento) {
		this.fechaMovimiento = fechaMovimiento;
	}

	@Override
	public String toString() {
		return "HistorialMovimiento [id=" + id + ", idProducto=" + idProducto + ", cantidad=" + cantidad
				+ ", fechaMovimiento=" + fechaMovimiento + "]";
	}
	
	
	
	
}
