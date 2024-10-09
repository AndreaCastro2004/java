package com.krakedev.herencia;

public class TestPersona {
	public static void main(String[] args) {
		Cuenta c= new Cuenta ("1234",24.0);
		Persona p=new Persona("1234567890","Masria",c);
		System.out.println(p);
		
		
	}
}
