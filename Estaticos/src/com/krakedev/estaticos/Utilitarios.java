package com.krakedev.estaticos;

public class Utilitarios {
	//para que se vuelva un metodo statico utilizamos static y hay si el metodo pertenece a la clase
	public static boolean validarRango(int valor ) {
		if(valor>=0 && valor<=10) {
			return true;
		}else {
			return false;
		}
	}
}
