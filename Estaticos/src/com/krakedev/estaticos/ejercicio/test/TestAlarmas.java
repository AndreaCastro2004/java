package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdmindAlarmas;
import com.krakedev.estaticos.ejercicio.utils.DiasSemana;

public class TestAlarmas {

	public static void main(String[] args) {
		AdmindAlarmas adAlar=new AdmindAlarmas();
		Alarma alarma1=new Alarma(DiasSemana.LUNES, 10, 35);
		Alarma alarma2=new Alarma(DiasSemana.JUEVES, 9, 24);
		Alarma alarma3=new Alarma(DiasSemana.VIERNES, 8, 56);
		adAlar.agregarAlarma(alarma1);
		adAlar.agregarAlarma(alarma2);
		adAlar.agregarAlarma(alarma3);
		ArrayList<Alarma> alarmasActuales= adAlar.getAlarmas();
		System.out.println(alarmasActuales);
		
	}

}
