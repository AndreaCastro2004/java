package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;

	// metodos
	public Directorio() {
		contactos = new ArrayList<Contacto>();
		// Instanciamos fecha
		fechaModificacion = new Date();
		correctos = new ArrayList<Contacto>();
		incorrectos = new ArrayList<Contacto>();
	}

	public boolean agregarContacto(Contacto contacto) {
		Contacto recuperado = buscarPorCedula(contacto.getCedula());
		Date ultiModificacion = new Date();
		if (recuperado == null) {
			contactos.add(contacto);
			fechaModificacion = Directorio.this.fechaModificacion;
			return true;
		} else {
			return false;
		}

	}

	public String consultarUltimaModificacion() {
		SimpleDateFormat formato = new SimpleDateFormat("yyy/MM/dd HH:mm:ss");
		String fecha = formato.format(fechaModificacion);
		return fecha;

	}

	public Contacto buscarPorCedula(String cedula) {
		Contacto conCedula;
		for (int i = 0; i < contactos.size(); i++) {
			conCedula = contactos.get(i);
			if (cedula.equals(conCedula.getCedula())) {
				return conCedula;
			}
		}
		return null;
	}

	public int contarPerdidos() {
		Contacto buscar;
		int aumPerdidos = 0;
		for (int i = 0; i < contactos.size(); i++) {
			buscar = contactos.get(i);
			if (buscar.getDireccion() == null) {
				aumPerdidos = aumPerdidos + 1;
			}
		}
		return aumPerdidos;

	}

	public int contarFijos() {
		Contacto contacto;
		Telefono telefono;
		int aumFijos = 0;
		for (int i = 0; i < contactos.size(); i++) {
			contacto = contactos.get(i);
			for (int j = 0; j < contacto.getTelefono().size(); j++) {
				telefono = contacto.getTelefono().get(j);
				if (telefono.getTipo().equals("Convencional") && telefono.getEstado().equals("C")) {
					aumFijos = aumFijos + 1;
				}
			}
		}
		return aumFijos;

	}
	public void depurar() {
		Contacto buscar;
		for (int i = 0; i < contactos.size(); i++) {
			buscar = contactos.get(i);
			if (buscar.getDireccion() == null) {
				incorrectos.add(buscar);
			}else {
				correctos.add(buscar);
			}
		}
		contactos.clear();
	}

	// getters y setters
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

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}
	
}
