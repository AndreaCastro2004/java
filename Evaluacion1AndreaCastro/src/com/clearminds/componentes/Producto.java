package com.clearminds.componentes;

public class Producto {
	private String nombre;
	private double precio;
	private String codigo;
	
	//metodos
	public void incrementarPrecio( int porcentajeIncremento) {
			double incremento=porcentajeIncremento/100.0;	
			double montoIncremento=precio*incremento;
			precio=precio+montoIncremento;
		}
	public void disminuirPrecio(double valorDescuento) {
		precio=precio-valorDescuento;
	}
	
}
