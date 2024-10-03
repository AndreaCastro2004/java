package com.entidades;

public class Numero {
	private String numeroCarta;
	private int valor;
	
	//metodo constructor
	public Numero(String numeroCarta, int valor) {
		this.numeroCarta = numeroCarta;
		this.valor = valor;
	}
	//metodos
	public void mostrarInformacion() {
		System.out.println(numeroCarta+"-"+valor);
	}
	//getters and setters 
	public String getNumeroCarta() {
		return numeroCarta;
	}
	public void setNumeroCarta(String numeroCarta) {
		this.numeroCarta = numeroCarta;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
}
