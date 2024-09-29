package com.krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;

	public Estudiante(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		notas = new ArrayList<Nota>();
	}

	// metodo
	public void agregarNota(Nota nuevaNota) {
		String nota1;
		boolean validar = false;
		if (notas.size() == 0) {
			notas.add(nuevaNota);
		} else {
			for (int i = 0; i < notas.size(); i++) {
				nota1 = notas.get(i).getMateria().getCodigo();
				if (nota1.equals(nuevaNota.getMateria().getCodigo())) {
					validar = true;
				}
			}
			if (validar = false) {
				if (nuevaNota.getCalificacion() >= 0 && nuevaNota.getCalificacion() <= 10) {
					notas.add(nuevaNota);
				}else {
					System.out.println("nota incorrecta");
				}
			}
		}
	}

	public void modificarNota(String codigo, double nuevaNota) {
		String codigoMateria;
		boolean codigo1 = false;
		for (int i = 0; i < notas.size(); i++) {
			codigoMateria = notas.get(i).getMateria().getCodigo();
			if (codigo.equals(codigoMateria)) {
				codigo1 = true;
				if (nuevaNota >= 0 && nuevaNota <= 10) {
					notas.get(i).setCalificacion(nuevaNota);
				}
			}
		}
		if (codigo1 == false) {
			System.out.println("El codigo Ingresado no se encuentra registrado");
		}
	}

	public double calcularPromedioNotasEstudiante() {
		Nota elementoNota;
		double notaRecuperada = 0;
		double promedio = 0;
		double totalNotas = 0;
		for (int i = 0; i < notas.size(); i++) {
			elementoNota = notas.get(i);
			notaRecuperada = notaRecuperada +elementoNota.getCalificacion();
			totalNotas++;

		}
		promedio = notaRecuperada / totalNotas;
		return promedio;

	}

	public void mostrar() {
		System.out.println("Nombre:" + nombre + " " + "Apellido:" + apellido + " " + "Cedula:" + cedula);
		for (int j = 0; +j < notas.size(); j++) {
			notas.get(j).mostrar();
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
