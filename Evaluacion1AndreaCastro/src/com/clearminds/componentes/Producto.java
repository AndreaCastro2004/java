package com.clearminds.componentes;

public class Producto {
	private String nombre;
	private double precio;
	private String codigo;
	
	//metodo constructor
	public Producto(String codigo,String nombre , double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
	}
	//metodos
	public void incrementarPrecio( int porcentajeIncremento) {
			double incremento=porcentajeIncremento/100.0;	
			double montoIncremento=precio*incremento;
			precio=precio+montoIncremento;
		}
	public void disminuirPrecio(double valorDescuento) {
		precio=precio-valorDescuento;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
}
