package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto1=new Producto(2004,"Jabon");
		producto1.setDescripcion("Realizado con avena");
		producto1.setPeso(13);
		
		System.out.println("Datos del producto");
		System.out.println("Codigo:"+producto1.getCodigo());
		System.out.println("Nombre:"+producto1.getNombre());
		System.out.println("Descripcion:"+producto1.getDescripcion());
		System.out.println("Peso:"+producto1.getPeso()+"gr");

	}

}
