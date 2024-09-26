package com.kerakedev.colecciones;

public class TestAdminPersonas {

	public static void main(String[] args) {
		AdminPersonas admin= new AdminPersonas();
		admin.agregar(new Persona("Jose","Roberto",18));
		admin.agregar(new Persona("Roberto","Cali",18));
		admin.agregar(new Persona("Rosita","Paredez",18));
		admin.agregar(new Persona("Marcos","Suntaxi",18));

		admin.imprimir();
		Persona p1=admin.buscarPorNombre("Jose");
		if(p1!= null) {
			System.out.println("Encontrado:"+p1.getApellido()+" "+p1.getEdad());
		}else {
			System.out.println("No existe la persona con el nombre ingresado");
		}
	}

}
