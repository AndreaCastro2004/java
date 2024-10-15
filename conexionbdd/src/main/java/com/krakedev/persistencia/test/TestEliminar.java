package com.krakedev.persistencia.test;


import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.Prestamo;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.servicios.AdminPrestamo;

public class TestEliminar {

	public static void main(String[] args) {
		String cedula= "1218161732";
		try {
			AdminPersonas.eliminar(cedula);
			System.out.println("Persona eliminada");
		} catch (Exception e) {
			System.out.println("Error en el sistema: "+e.getMessage());
		}
		
		
		String pc="1212121121";
		try {
			
			AdminPrestamo.eliminar(pc);
			System.out.println("Persona eliminada");
		} catch (Exception e) {
			System.out.println("Error en el sistema: "+e.getMessage());
		}
		

	}

}
