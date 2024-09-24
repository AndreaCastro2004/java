package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		AdminTelefono al =new AdminTelefono();
		Telefono tel1=new Telefono("movi","098234234",20);
		Telefono tel2=new Telefono("claro","098234234",20);
		Telefono tel3=new Telefono("movi","098234234",20);
		String operadora;
		operadora=al.contarMovi(tel1, tel2, tel3);
		
		System.out.println("--Cuantas Operadoras Movi Hay--");
		System.out.println(operadora);
		
	}

}
