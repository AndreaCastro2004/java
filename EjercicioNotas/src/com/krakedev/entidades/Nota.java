package com.krakedev.entidades;

public class Nota {
	private Materia materia;
	private String calificacion;
	
	//metodos
	public void mostrar() {
		System.out.println("Materia:"+materia.getNombre()+" "+"Calificacion:"+calificacion);

	}
	
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	public String getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}
	
	
	
	
}
