package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;
import java.util.Date;



public class Prestamo {
	private String cedula;
	private BigDecimal monto;
	private Date fechaPrestamo;
	private Date horaPrestamo;
	private String garante;
	
	public Prestamo() {}
	
	
	
	
	public Prestamo(String cedula, String garante) {
		super();
		this.cedula=cedula;
		this.monto = monto;
		this.fechaPrestamo = fechaPrestamo;
		this.horaPrestamo = horaPrestamo;
		this.garante = garante;
	}
	

	public String getCedula() {
		return cedula;
	}




	public void setCedula(String cedula) {
		this.cedula = cedula;
	}




	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}
	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}
	public Date getHoraPrestamo() {
		return horaPrestamo;
	}
	public void setHoraPrestamo(Date horaPrestamo) {
		this.horaPrestamo = horaPrestamo;
	}
	public String getGarante() {
		return garante;
	}
	public void setGarante(String garante) {
		this.garante = garante;
	}
	
	
	

}
