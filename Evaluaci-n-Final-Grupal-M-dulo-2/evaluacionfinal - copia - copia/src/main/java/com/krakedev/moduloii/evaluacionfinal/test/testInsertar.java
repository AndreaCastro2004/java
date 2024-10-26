package com.krakedev.moduloii.evaluacionfinal.test;

import java.math.BigDecimal;

import com.krakedev.moduloii.evaluacionfinal.entidades.Articulo;
import com.krakedev.moduloii.evaluacionfinal.entidades.Grupo;
import com.krakedev.moduloii.evaluacionfinal.excepciones.InventarioException;
import com.krakedev.moduloii.evaluacionfinal.utils.ConexionBDD;

public class testInsertar {
	public static void main(String[] args) {
		BigDecimal pCompra = new BigDecimal(200.5);
		BigDecimal pVenta = new BigDecimal(125);
		
		Grupo gr =new Grupo("G002","Tecnologia");
		Articulo art = new Articulo("A011","Telefono",pCompra,pVenta,gr);
		try {
			ConexionBDD.insertar(art);
		} catch (InventarioException e) {
			System.out.println("Error");
		}
		
	}
}
