package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		Telefono telf=new Telefono ("claro","0125364789",105);
		AdminTelefono al=new AdminTelefono();
		Contacto c1=new Contacto("Rosita", "Sufragio", telf, 119);
		
		Telefono tel=c1.getTelefono();
		al.activarMensajeria(tel);
		
		System.out.println("nombre:"+c1.getNombre());
		System.out.println("apellido:"+c1.getApellido());
		System.out.println("activo:"+c1.isActivo());
		System.out.println("telefono:"+tel.getNumero());
		System.out.println("peso:"+c1.getPeso());
		System.out.println("operadora:"+tel.getOperadora());
		System.out.println("Tiene Whatsapp:"+telf.isTieneWhatsapp());
		System.out.println("--------------------");
		
		
		

	}

}
