package com.krakedev.test;

import com.krakedev.composicion.AdminProducto;
import com.krakedev.composicion.Producto;

public class TestAdminProducto {

	public static void main(String[] args) {
		AdminProducto admin=new AdminProducto();
		
		Producto productoA=new Producto("Doritos", 0.25);
		Producto ProductoB=new Producto("rufles",0.25);
		
		Producto mc;
		
		mc=admin.buscarMasCaro(productoA, ProductoB);
		//para que no nos de null y caigamos en un nullpointException acemos una validacion 
		if(mc==null) {
			System.out.println("Son iguales");
		}else {
			System.out.println("El mas caro es:"+mc.getNombre());
		}
		
		
	}

}
