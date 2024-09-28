package com.krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;

	// metodo
	public void agregarNota(Nota nuevaNota) {
		
		Nota elementoNota;
		for (int i = 0; i < notas.size(); i++) {
			elementoNota = notas.get(i);
			if ((elementoNota.getMateria() != nuevaNota.getMateria()) && nuevaNota.getCalificacion() >= 0
					&& nuevaNota.getCalificacion() <= 10) {
				notas.add(nuevaNota);
			}
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

}
