package com.krakedev.evaluacion;

import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	//metodos
	public Directorio() {
		contactos=new ArrayList<Contacto>();
	}
	public boolean agregarContacto(Contacto contacto) {
		contactos.add(contacto);
		return true;
		
	}
	public Contacto buscarPorCedula(String cedula) {
		Contacto conCedula;
		for(int i=0;i<contactos.size();i++) {
			conCedula=contactos.get(i);
			if(cedula.equals(conCedula.getCedula())) {
				return conCedula;
			}
		}
		return null;
		
	}
	//getters y setters
	public ArrayList<Contacto> getContactos() {
		return contactos;
	}
	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	
}
