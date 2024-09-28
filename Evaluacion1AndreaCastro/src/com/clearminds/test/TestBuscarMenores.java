package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda(new Celda("1"));
        maquina.agregarCelda(new Celda("2"));
        maquina.agregarCelda(new Celda("3"));
        maquina.agregarCelda(new Celda("4"));
        maquina.agregarCelda(new Celda("5"));
        maquina.agregarCelda(new Celda("6"));
 
        Producto producto = new Producto("OU84", "Papitas", 0.85);
		maquina.cargarProducto(producto, "1", 4);
		
		Producto producto2 = new Producto("ÑA90", "Doritos", 0.65);
		maquina.cargarProducto(producto2, "2", 3);
		
		Producto producto3 = new Producto("PO34", "Cachitos", 0.35);
		maquina.cargarProducto(producto3, "3", 5);
		
		Producto producto4 = new Producto("NA84", "Coca Cola", 1.00);
		maquina.cargarProducto(producto4, "4", 4);
		
		Producto producto5 = new Producto("LA90", "Platanitos", 0.70);
		maquina.cargarProducto(producto5, "5", 3);
		
		Producto producto6 = new Producto("UY34", "Cueritos", 0.75);
		maquina.cargarProducto(producto6, "6", 5);
		
		ArrayList<Producto> productosMenores=maquina.buscarMenores(0.50);
		Producto encontrados;
		System.out.println("Productos menores:"+productosMenores.size());
		for(int i=0;i<productosMenores.size();i++) {
			encontrados=productosMenores.get(i);
			System.out.println("Nombre:"+encontrados.getNombre()+" "+"Precio:"+encontrados.getPrecio());
		}
		

	}

}
