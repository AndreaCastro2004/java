package com.krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes;
	
	public Curso() {
		estudiantes=new ArrayList<Estudiante>();
	}
	//metodos
	public String buscarEstudiantePorCedula(Estudiante estudiante) {
		Estudiante estudiante1;
		String mensaje=null;
		for(int i=0;i<estudiantes.size();i++) {
			estudiante1=estudiantes.get(i);
			if(estudiante.getCedula().equals(estudiante1.getCedula())) {
				mensaje="El estudiante no se encuentra en el curso";
			}
		}
		return mensaje;
	}
	
	public void matricularEstudiante(Estudiante estudiante) {
		String buscaEstudiante;
		buscaEstudiante=buscarEstudiantePorCedula(estudiante);
		if(buscaEstudiante==null) {
			estudiantes.add(estudiante);
		}
	}
	
	public double calcularPromedioCurso() {
		double PromedioEstudiante = 0;
		int totalNotas=0;
		double promedio;
		
		for(int i=0;i<estudiantes.size();i++) {
			PromedioEstudiante=PromedioEstudiante+estudiantes.get(i).calcularPromedioNotasEstudiante();
		}
		promedio = PromedioEstudiante /estudiantes.size();
		return promedio;
	}

	public void mostrar() {
		for (int i = 0; i < estudiantes.size(); i++) {
			estudiantes.get(i).mostrar();
		}

	}
	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	
	
}
