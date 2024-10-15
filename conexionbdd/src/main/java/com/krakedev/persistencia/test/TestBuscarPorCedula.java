package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestBuscarPorCedula {

	public static void main(String[] args) {
		try {
			Persona persona=AdminPersonas.buscarPorCedula("1233434343");
			System.out.println(persona);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
