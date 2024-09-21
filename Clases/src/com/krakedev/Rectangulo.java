package com.krakedev;

public class Rectangulo {
	// Creamos los atributos
	private int base;
	private int altura;
	
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

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
