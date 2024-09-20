package com.krakedev;

public class Rectangulo {
	// Creamos los atributos
	public int base;
	public int altura;

	// creamos los metodos
	public int calcularArea() {
		int area;
		area = base * altura;
		return area;
	}

	public double calcularPerimetro() {
		double resultado = base + base + altura + altura;
		return resultado;

	}

}
