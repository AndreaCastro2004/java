package com.krakedev.excepciones;

public class Ejercicio1 {
	public static void main(String[] args) {
		System.out.println("inicio");
		String e=null;
		try {
			System.out.println("ENTRA A LA BDD");
			e.substring(2);
			System.out.println("fin");
		}catch(Exception ex) {
			System.out.println("entra al catch");
		}finally {
			System.out.println("entra al Finally");
			System.out.println("SALE DE LA BASE DE DATOS");
		}
		System.out.println("sale del catch");
	}
}
