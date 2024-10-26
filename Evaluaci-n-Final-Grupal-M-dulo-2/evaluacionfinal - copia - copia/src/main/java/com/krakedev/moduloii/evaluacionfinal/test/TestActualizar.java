package com.krakedev.moduloii.evaluacionfinal.test;

import java.math.BigDecimal;

import com.krakedev.moduloii.evaluacionfinal.entidades.Articulo;
import com.krakedev.moduloii.evaluacionfinal.entidades.Grupo;
import com.krakedev.moduloii.evaluacionfinal.excepciones.InventarioException;
import com.krakedev.moduloii.evaluacionfinal.utils.ConexionBDD;

public class TestActualizar {
	public static void main(String[] args) {
		BigDecimal pCompra = new BigDecimal(50.5);
		BigDecimal pVenta = new BigDecimal(25);
		
		Grupo gr =new Grupo("G003","Ropa");
		Articulo art = new Articulo("A011","Pepito",pCompra,pVenta,gr);
		try {
			ConexionBDD.actualizar(art);
		} catch (InventarioException e) {
			System.out.println("Error");
		}
	}
}
