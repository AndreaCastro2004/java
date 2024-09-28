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
		Materia elementoCodigo = null;
		for (int i = 0; i < notas.size(); i++) {
			elementoNota = notas.get(i);
			if ((elementoCodigo.getCodigo() != elementoCodigo.getCodigo()) && nuevaNota.getCalificacion() >= 0
					&& nuevaNota.getCalificacion() <= 10) {
				notas.add(nuevaNota);
			}
		}
	}

	public void modidificarNota(String codigo,double nuevaNota) {
		Materia materia = null;
		Nota nota;
		if(codigo.equals(materia.getCodigo())) {
			for(int i=0;i<notas.size();i++) {
				nota=notas.get(i);
				if(nota.getCalificacion() >= 0 && nota.getCalificacion() <= 10) {
					nota.setCalificacion(nuevaNota);
				}
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
