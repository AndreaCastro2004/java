package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Persona {
	private String cedula;
	private String nombre;
	private String apellido;
	
	private EstadoCivil estadoCivil;
	
	private int numeroHijos;
	private double estatura;
	private BigDecimal cantidadAhorrada;
	private Date fechaDeNacimiento;
	private Date horaNacimiento;
	
	public Persona() {}
	public Persona(String cedula, String nombre, String apellido, EstadoCivil estadoCivil, int numeroHijos,
			double estatura, BigDecimal cantidadAhorrada, Date fechaDeNacimiento, Date horaNacimiento) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estadoCivil = estadoCivil;
		this.numeroHijos = numeroHijos;
		this.estatura = estatura;
		this.cantidadAhorrada = cantidadAhorrada;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.horaNacimiento = horaNacimiento;
	}


	public Persona(String cedula, String nombre, String apellido, EstadoCivil estadoCivil, Date fechaDeNacimiento) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estadoCivil = estadoCivil;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public int getNumeroHijos() {
		return numeroHijos;
	}
	public void setNumeroHijos(int numeroHijos) {
		this.numeroHijos = numeroHijos;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public BigDecimal getCantidadAhorrada() {
		return cantidadAhorrada;
	}
	public void setCantidadAhorrada(BigDecimal cantidadAhorrada) {
		this.cantidadAhorrada = cantidadAhorrada;
	}
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public Date getHoraNacimiento() {
		return horaNacimiento;
	}
	public void setHoraNacimiento(Date horaNacimiento) {
		this.horaNacimiento = horaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", estadoCivil="
				+ estadoCivil + ", numeroHijos=" + numeroHijos + ", estatura=" + estatura + ", cantidadAhorrada="
				+ cantidadAhorrada + ", fechaDeNacimiento=" + fechaDeNacimiento + ", horaNacimiento=" + horaNacimiento
				+ "]";
	}
	
	
	
	
	
	
	
	
}
