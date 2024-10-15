package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.entidades.Prestamo;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.servicios.AdminPrestamo;
import com.krakedev.persistencia.utils.Convertidor;

public class TestPrestamo {
	public static void main(String[] args) {
		Prestamo pc=new Prestamo("1212121121","Joseluis");
		
		try {
			Date fechaCon=Convertidor.convertirFecha("2024/09/30");
			Date horaCon =Convertidor.convertirHora("12:32");
			pc.setFechaPrestamo(fechaCon);
			pc.setHoraPrestamo(horaCon);
			pc.setMonto(new BigDecimal(300.56));
			
			AdminPrestamo.inserta(pc);
		} catch (Exception e) {
			System.out.println("Error en el sistema: "+e.getMessage());
		}
		
		
	}
}
