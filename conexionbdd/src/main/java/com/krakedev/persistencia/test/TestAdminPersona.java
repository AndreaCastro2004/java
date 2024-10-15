package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

//el sysout solo se va a poder utilizar en los test
public class TestAdminPersona {
	public static void main(String[] args) {
		EstadoCivil ec=new  EstadoCivil("U","Union Libre");
		Persona p=new Persona("1234444444","Marco","Polo",ec,null);
		try {
			Date fechaNa =Convertidor.convertirFecha("2006/09/23");
			Date horaNa =Convertidor.convertirHora("12:32");
			p.setFechaDeNacimiento(fechaNa);
			p.setHoraNacimiento(horaNa);
			p.setCantidadAhorrada(new BigDecimal(130.26));
			p.setNumeroHijos(2);
			AdminPersonas.inserta(p);
		} catch (Exception e) {
			System.out.println("Error en el sistema: "+e.getMessage());
		}
		
		
	}
}
