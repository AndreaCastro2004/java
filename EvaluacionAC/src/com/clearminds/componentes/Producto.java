package com.clearminds.componentes;

public class Producto {
	private String nombre;
	private double precio;
	private String codigo;
	
	//metodos
	public void incrementarPrecio(int porcentajeIncremento) {
		//como el parametro es un entero le dividimos con el 100 en decimales para que no me de solo cero
		//tambien podemos convertir a double 
		double incremento=porcentajeIncremento/100.0;	
		double montoIncremento=precio*incremento;
		precio=precio+montoIncremento;
	}
	public void disminuirPrecio(double descuento) {
		precio=precio-descuento;
	} 
	//constructores
	public Producto( String codigo,String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
	}
	//getters and setters
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
