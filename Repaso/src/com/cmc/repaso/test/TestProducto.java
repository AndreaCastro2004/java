package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto productos=new Producto("Atun",-1.50);
		productos.setPrecio(-1.50);
		double descuento;
		descuento= productos.calcularPrecioPromo(50);
		
		System.out.println("Producto");
		System.out.println("Nombre producto:"+productos.getNombre());
		System.out.println("Precio:"+productos.getPrecio());
		System.out.println("Descuento aplicado:"+descuento);

	}

}
