package com.krakedev.entidades;

public class Nota {
	private Materia materia;
	private double calificacion;
	
	
	public Nota(Materia materia, double calificacion) {
		this.materia=materia;
		this.calificacion = calificacion;
	}

	//metodos
	public void mostrar() {
		System.out.println("Materia:"+materia.getNombre()+" "+"CodigoMateria:"+materia.getCodigo()+"Calificacion:"+calificacion);

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
