package com.krakedev.herencia;

public class Persona {
	private String cedula;
	private String nombre;
	
	
	
	
	//
	public Persona(String cedula, String nombre) {
		this.cedula = cedula;
		this.nombre = nombre;
	}
	

	//
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//sobreescribiendo metodos padre
	@Override //<----esto es una anotacion ,nos permite hacer una validacion de que si se esta sobreescribiendo un metodo que se encuentre en la clasepadre
	public String toString() {
		return "Persona [cedula=" + cedula + ", nombre=" + nombre + "]";
	}
	
	
	
	
	
	
	
}
