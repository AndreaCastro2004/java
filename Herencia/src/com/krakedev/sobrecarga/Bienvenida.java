package com.krakedev.sobrecarga;

public class Bienvenida {
	//puedo tener varios metodos con el mismo nombre pero cada uno debe tener distintos parametros
	public void saludar(String nombre) {
		System.out.println("Hola "+nombre);
	}
	public void saludar(String nombre,String apellido) {
		System.out.println("Hola "+nombre+" "+apellido);
	}
}
