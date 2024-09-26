package com.kerakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		AdminPersonas admin= new AdminPersonas();
		admin.agregar(new Persona("Jose","Roberto",18));
		admin.agregar(new Persona("Roberto","Cali",28));
		admin.agregar(new Persona("Rosita","Paredez",38));
		admin.agregar(new Persona("Marcos","Suntaxi",48));

		admin.imprimir();
		Persona p1=admin.buscarPorNombre("Jose");
		if(p1!= null) {
			System.out.println("Encontrado:"+p1.getApellido()+" "+p1.getEdad());
		}else {
			System.out.println("No existe la persona con el nombre ingresado");
		}
		ArrayList<Persona> personasMayores=admin.buscarMayores(40);
		System.out.println("mayores:"+ personasMayores.size());
		
	}
	

}
