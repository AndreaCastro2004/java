package com.krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes;
	
	//metodos
	public String buscarEstudiantePorCedula(Estudiante estudiante) {
		Estudiante estudiante1 = new Estudiante();
		for(int i=0;i<estudiantes.size();i++) {
			estudiante1=estudiantes.get(i);
			if(estudiante.getCedula().equals(estudiante1.getCedula())) {
				System.out.println("El estudiante no se encuentra en el curso");
			}
		}
		return null;
	}
	
	public void matricularEstudiantes(Estudiante estudiante) {
		String buscaEstudiante=buscarEstudiantePorCedula(estudiante);
		if(buscaEstudiante!=null) {
			estudiantes.add(estudiante);
		}
	}
	
	public double calcularPromedioCurso() {
		Estudiante estudiante;
		double sumaNotas = 0;
		int totalNotas=0;
		double promedio;
		
		for(int i=0;i<estudiantes.size();i++) {
			estudiante=estudiantes.get(i);
			for(int j=0;j<estudiante.getNotas().size();j++) {
				Nota notas=estudiante.getNotas().get(j);
				sumaNotas+=notas.getCalificacion();
				totalNotas++;
			}
		}
		promedio = sumaNotas /totalNotas;
		return promedio;
	}

	public void mostrar() {
		Estudiante elementoEstudiante;
		for (int i = 0; i < estudiantes.size(); i++) {
			elementoEstudiante = estudiantes.get(i);
			System.out.println("Nombre:" + elementoEstudiante.getNombre()+ " " + "Apellido:" +elementoEstudiante.getApellido() + " " + "Cedula:" + elementoEstudiante.getCedula() + "Nota:"
					+ elementoEstudiante.getNotas());
		}

	}
	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	
	
}
