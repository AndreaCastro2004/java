package com.krakedev.herencia;

public class TestHerencia {

	public static void main(String[] args) {
		Perro perro=new Perro();
		//aqui aunque perro no tiene el metodo dormir como tiene un extends puede acceder a los metodos de la clase animal
		perro.dormir();
		/*Animal a= new Animal();
		System.out.println(a.hashCode());*/
		
	}

}
