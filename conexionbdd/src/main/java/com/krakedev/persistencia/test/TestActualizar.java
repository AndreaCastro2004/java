package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizar {

	public static void main(String[] args) {
		EstadoCivil ec= new EstadoCivil("C","Casado");
		Persona persona =new Persona("1218161732", "Roberto", "Andrade", ec, null);
		try {
			Date fechaCon=Convertidor.convertirFecha("2007/07/07");
			Date horaCon=Convertidor.convertirHora("00:30");
			persona.setFechaDeNacimiento(fechaCon);
			persona.setHoraNacimiento(horaCon);
			persona.setCantidadAhorrada(new BigDecimal(777.77));
			persona.setNumeroHijos(1);
			persona.setEstatura(1.60);
			AdminPersonas.actualizar(persona);
			
		} catch (Exception e) {
			System.out.println("Error en el sistema: "+e.getMessage());
		}
	}

}
