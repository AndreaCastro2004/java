package com.kerakedev.colecciones;

import java.util.ArrayList;


public class Ejercicio1 {

	public static void main(String[] args) {
		//creo la variable con el Arraylist
		ArrayList<String> cadenas;
		String valorRecuperado;
		//Instancio 
		cadenas=new ArrayList<String>();
		//para ver el tamaño de la cadena utilizamos size
		System.out.println(cadenas.size());
		//Agregar elementos al Array con add
				
		cadenas.add("Marco");//posicion 0
		cadenas.add("Polo");//posicion 1
				
		System.out.println(cadenas.size());
				
		//para recuperar el valor en la posicion del array utilizo get
		 valorRecuperado=cadenas.get(1);
		 System.out.println(valorRecuperado);
		 //utilizamos el for para iterar
		 String cadena;
		 for(int i=0;i<cadenas.size();i++) {
			 cadena=cadenas.get(i);
			 System.out.println("cadena:"+cadena);
		 }
	}

}
