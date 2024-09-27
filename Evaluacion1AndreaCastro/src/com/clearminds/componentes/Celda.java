package com.clearminds.componentes;

public class Celda {
	private Producto producto;
	private int stock;
	private String codigo;
	
	//metodos 
	public void ingresarProducto(Producto producto, int stockInicial) {
			this.producto=producto;
			stock=stockInicial;
			
	}
}
