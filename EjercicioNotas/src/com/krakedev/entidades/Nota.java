package com.krakedev.entidades;

public class Nota {
	private Materia materia;
	private double calificacion;
	
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
	public double getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	
	
	
	
}
