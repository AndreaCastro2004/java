package com.kerakedev.colecciones;

import java.util.ArrayList;

public class AdminPersonas {
	private ArrayList<Persona> personas;
	
	public AdminPersonas() {
		personas=new ArrayList<Persona>();
	}
	
	public void agregar (Persona persona) {
		personas.add(persona);
	}
	public void imprimir() {
		Persona elementoPersona;
		for(int i=0;i<personas.size();i++) {
			elementoPersona=personas.get(i);
			System.out.println("Persona:"+elementoPersona.getNombre()+" "+elementoPersona.getEdad());
		}
	}
	
	public Persona buscarPorNombre(String nombre) {
		Persona personaEncontrada=null;
		Persona elementoPersona=null;
		for(int i=0;i<personas.size();i++) {
			elementoPersona=personas.get(i);
			if(nombre.equals(elementoPersona.getNombre())) {
				personaEncontrada=elementoPersona;
			}
		}
		
		return personaEncontrada;
		
	}
}

