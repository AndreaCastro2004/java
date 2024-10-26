package com.krakedev.moduloii.evaluacionfinal.test;

import java.util.ArrayList;

import com.krakedev.moduloii.evaluacionfinal.entidades.Articulo;
import com.krakedev.moduloii.evaluacionfinal.excepciones.InventarioException;
import com.krakedev.moduloii.evaluacionfinal.utils.ConexionBDD;

public class TestBuscarTodos {

	public static void main(String[] args) {
		try {
			ArrayList<Articulo> art = ConexionBDD.RecuperarTodos();
			System.out.println(art);
		} catch (InventarioException e) {
			e.printStackTrace();
		}
	}

}
