package com.krakedev.herencia;
//clase hija
//Herencia
public class Perro extends Animal {
	public void ladrar() {
		System.out.println("GUAUF ");
	}
	//sobreescribir el metodo de animal
	@Override
	public void dormir() {
		super.dormir(); //<-- Aquí podemos llamar al metodo padre sin sobreescribir con el super 
		System.out.println("Perro durmiendo ");
	}
}
