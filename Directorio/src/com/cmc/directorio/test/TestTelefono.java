package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono {

	public static void main(String[] args) {
		Telefono telf=new Telefono("movistar","09941234123",10);
		System.out.println("Datos telefono");
		System.out.println("Operadora:"+telf.getOperadora());
		System.out.println("Numero:"+telf.getNumero());
		System.out.println("Codigo:"+telf.getCodigo());
		System.out.println("Tiene Whatsapp:"+telf.isTieneWhatsapp());
	}

}
