package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefono;

	// metodo constructor
	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		telefono = new ArrayList<Telefono>();
	}

	// metodos
	public void imprimir() {
		System.out.println("***" + nombre + " " + apellido + "****");
		if (direccion != null) {
			System.out.println("Direccion:" + direccion.getCallePrincipal() + " y " + direccion.getCalleSecundaria());
		} else {
			System.out.println("No tiene asociada una direccion");
		}

	}

	public void agregarTelefono(Telefono telefono) {
		if(telefono.getNumero()!=null && telefono.getTipo()!=null) {
			this.telefono.add(telefono);
		}
	}

	public void mostrarTelefonos() {
		Telefono recTelefono;
		System.out.println("Telefono con estado 'C': ");
		for(int i=0;i<telefono.size();i++) {
			recTelefono=telefono.get(i);
			if(recTelefono.getEstado()=="C" ) {
				System.out.println("Numero:"+telefono.get(i).getNumero()+", "+"Tipo:"+telefono.get(i).getTipo());
			}
		}
	}
	// getter and setters
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Telefono> getTelefono() {
		return telefono;
	}

	public void setTelefono(ArrayList<Telefono> telefono) {
		this.telefono = telefono;
	}

}
