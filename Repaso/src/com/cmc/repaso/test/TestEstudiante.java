package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante estudiante=new Estudiante("Maria");
		Estudiante estudiante2=new Estudiante("Julia");

		estudiante.calificar(7);
		estudiante2.calificar(9);
		
		System.out.println("Datos estudiante");
		System.out.println("Nombre:"+estudiante.getNombre());
		System.out.println("Nota:"+estudiante.getNota());
		System.out.println("Resultado:"+estudiante.getResultado());
		System.out.println("--------------------------------");
		System.out.println("Datos estudiante");
		System.out.println("Nombre:"+estudiante2.getNombre());
		System.out.println("Nota:"+estudiante2.getNota());
		System.out.println("Resultado:"+estudiante2.getResultado());
	}
	

}
