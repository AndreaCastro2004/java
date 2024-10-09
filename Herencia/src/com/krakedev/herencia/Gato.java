package com.krakedev.herencia;

public class Gato extends Animal {
	//sobreescribir metodo dormir
	@Override 
	public void dormir() {
		System.out.println("Gatito durmiendo ,MIAUU");
	}
	
	public void maullar() {
		System.out.println("MIAUUUUUUUUU!!  MIAUUUUUUU!!");
	}
	//Sobrecargar el metodo maullar
	public void maullar(String adjetivo) {
		System.out.println("Gato maullando "+adjetivo);
	}
}
