package com.clearminds.componentes;

public class Celda {
	private Producto producto;
	private int stock;
	private String codigo;
	
	//metodo constructor
	
	public Celda(String codigo) {
		this.codigo = codigo;
	}
	//metodos 
	public void ingresarProducto(Producto producto, int stockInicial) {
			this.producto=producto;
			stock=stockInicial;
	}

	
	
}
