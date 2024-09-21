package com.krakedev;

public class Cuadrado {
	//creamos atributo
	private int lado;
	
	
	
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
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
