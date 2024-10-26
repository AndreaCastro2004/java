package com.krakedev.moduloii.evaluacionfinal.entidades;

public class Grupo {
	private String id;
	private String nombre;
	
	public Grupo(String id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	public Grupo() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Grupo [id=" + id + ", nombre=" + nombre + "]";
	}
	
}
