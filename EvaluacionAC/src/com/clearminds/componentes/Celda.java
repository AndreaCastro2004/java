package com.clearminds.componentes;

public class Celda {
	private Producto producto;
	private int stock;
	private String codigo;
	
	//metodos
	public void ingresarProducto(Producto p1,int stoc) {
		producto=p1;
		stock=stoc;
	}
	//getters and setters

	public Celda(String codigo) {
		this.codigo = codigo;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
}
