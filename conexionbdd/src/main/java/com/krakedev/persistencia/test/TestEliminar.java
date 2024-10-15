package com.krakedev.persistencia.test;


import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestEliminar {

	public static void main(String[] args) {
		String cedula= "1218161732";
		try {
			AdminPersonas.eliminar(cedula);
			System.out.println("Persona eliminada");
		} catch (Exception e) {
			System.out.println("Error en el sistema: "+e.getMessage());
		}

	}

}
