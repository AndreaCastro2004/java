package com.kerakedev.colecciones;

public class TestAdminPersonas {

	public static void main(String[] args) {
		AdminPersonas admin= new AdminPersonas();
		admin.agregar(new Persona("Jose","Maria",18));
		admin.agregar(new Persona("Roberto","Cali",18));
		admin.agregar(new Persona("Rosita","Paredez",18));
		admin.agregar(new Persona("Marcos","Suntaxi",18));

		admin.imprimir();

	}

}
