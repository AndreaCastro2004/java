package com.krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes;
	
	//metodos
	public String buscarEstudiantePorCedula(Estudiante estudiante) {
		Estudiante estudiante1 = new Estudiante();
		if(estudiante.getCedula().equals(estudiante1.getCedula())) {
			System.out.println("El estudiante no se encuentra en el curso");
		}
		return null;
		
		
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	
	
}
