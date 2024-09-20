package com.krakedev;

public class Cuadrado {
	//creamos atributo
	public int lado;
	
	//creamos metodos
	
	public double calcularArea() {
		double resultado=lado*lado;
		return resultado;
	}
	
	public double calcularPerimetro() {
		double resultado=lado*4;
		return resultado;
		
	}
	
}
