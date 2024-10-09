package com.krakedev.estaticos.ejercicio.logica;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;

public class AdmindAlarmas {
	private ArrayList<Alarma> alarmas;
	
	public AdmindAlarmas() {
		alarmas=new ArrayList<Alarma>();
	}
	//
	public void agregarAlarma(Alarma alarma) {
		alarmas.add(alarma);
	}
	
	//
	public ArrayList<Alarma> getAlarmas() {
		return alarmas;
	}
	
	
	
	
}
