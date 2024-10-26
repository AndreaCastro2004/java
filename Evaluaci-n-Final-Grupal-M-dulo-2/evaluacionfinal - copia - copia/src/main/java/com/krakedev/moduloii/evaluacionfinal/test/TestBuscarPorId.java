package com.krakedev.moduloii.evaluacionfinal.test;

import com.krakedev.moduloii.evaluacionfinal.entidades.Articulo;
import com.krakedev.moduloii.evaluacionfinal.excepciones.InventarioException;
import com.krakedev.moduloii.evaluacionfinal.utils.ConexionBDD;

public class TestBuscarPorId {
	public static void main(String[] args) {
		try {
			Articulo art = ConexionBDD.buscarPorId("A011");
			System.out.println(art);
		} catch (InventarioException e) {
			e.printStackTrace();
		}
	}
}
