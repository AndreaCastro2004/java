package com.cmc.repaso.entidades;

public class Producto {
	private String nombre;
	private double precio;
	
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
		if(precio <0 ) {
			this.precio=precio*-1;
		}
	}
	 //metodos
	public Producto(String nombre,double precio) {
		this.nombre=nombre;
		this.precio=precio;
		
	}
	public double calcularPrecioPromo(double descuento) {
		double resultado;
		double aplicadoDescuento;
		resultado=(descuento/100)*precio;
		aplicadoDescuento=precio-resultado;
		return aplicadoDescuento;
	}
	
}
