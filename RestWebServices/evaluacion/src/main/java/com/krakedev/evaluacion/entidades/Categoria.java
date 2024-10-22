package com.krakedev.evaluacion.entidades;

public class Categoria {//entidades
	private String id;
	private String nombre;
	
	public Categoria() {}
	public Categoria(String id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	
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
	
	@Override //valida que el nombre y los parametros sean iguales a los del padre para hacer la sobreescritura 
	public String toString() {
		return "Categoria [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
	
}
