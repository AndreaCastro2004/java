package com.kerakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		ArrayList<Persona> personas;
		personas =new ArrayList<Persona>();
		//instancio los objetos Persona
		personas.add(new Persona("Juana","Jonsales"));
		personas.add(new Persona("Maria","Brit"));
		personas.add(new Persona("Carlos","Billavicencio"));
		personas.add(new Persona("Juanito","Perez"));

		Persona elementoPersona;
		for(int i=0;i<personas.size();i++) {
			elementoPersona=personas.get(i);
			System.out.println(elementoPersona.getNombre()+"-"+elementoPersona.getApellido());
		}
	}

}
