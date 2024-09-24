package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telf=new Telefono ("claro","098234234",20);
		Contacto c=new Contacto("Ari", "Reyes", telf, 52);
		
		
		System.out.println("--Informacion de contacto--");
		System.out.println("nombre:"+c.getNombre());
		System.out.println("apellido:"+c.getApellido());
		System.out.println("activo:"+c.isActivo());
		System.out.println("telefono:"+telf.getNumero());
		System.out.println("peso:"+c.getPeso());
		System.out.println("operadora:"+telf.getOperadora());





		

	}

}
