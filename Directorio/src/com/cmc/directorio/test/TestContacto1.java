package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		AdminContactos al=new AdminContactos();
		Telefono telf1=new Telefono ("claro","098234234",20);
		Contacto c=new Contacto("Ari", "Reyes", telf1, 52);
		Telefono telf2=new Telefono ("movi","098135135",70);
		Contacto c2=new Contacto("Maria", "Paredes", telf2, 87);
		
		Contacto p1=al.buscarMasPesado(c, c2);
		Telefono pe1=p1.getTelefono();
		
		System.out.println("--Informacion de contacto Por mas pesado--");
		System.out.println("nombre:"+p1.getNombre());
		System.out.println("apellido:"+p1.getApellido());
		System.out.println("activo:"+p1.isActivo());
		System.out.println("telefono:"+pe1.getNumero());
		System.out.println("peso:"+p1.getPeso());
		System.out.println("operadora:"+pe1.getOperadora());
		System.out.println("--------------------");

		boolean operadoras=al.compararOperadoras(c, c2);
		System.out.println("--Tienen la misma operadora--");
		System.out.println("operadora:"+operadoras);




		

	}

}
