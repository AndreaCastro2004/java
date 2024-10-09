package com.krakedev.estaticos.ejercicio.utils;

public class Util {
	
	public static String formatearHora(int valor) {
		String valorString=valor+"";
		if(valorString.length()==1) {
			valorString="0"+valorString;
			return valorString;
		}else {
			return valorString;
		}
	}
	
	public static String formatearDia(int dia) {
		String stringDia=null;
		if(dia==0) {
			stringDia="Lunes";
			return stringDia;
		}else if(dia==1) {
			stringDia="Martes";
			return stringDia;
		}else if(dia==2) {
			stringDia="Miercoles";
			return stringDia;
		}else if(dia==3) {
			stringDia="Jueves";
			return stringDia;
		}else if(dia==4) {
			stringDia="Viernes";
			return stringDia;
		}else if(dia==5) {
			stringDia="Sabado";
			return stringDia;
		}else if(dia==6) {
			stringDia="Domingo";
			return stringDia;
		}
		return stringDia;
		
	}
}
