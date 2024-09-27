package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;
	
	public MaquinaDulces() {
		celdas= new ArrayList<Celda>();
	}
	
	public void agregarCelda(String codigo) {
		Celda celdaCodigo=new Celda(codigo);
		celdas.add(celdaCodigo);
	}
	public void mostrarConfiguracion() {
		ArrayList<Celda> celda=new ArrayList<Celda>();
		for(int i=0;i<celdas.size();i++) {
			System.out.println("Celdas:"+celda.get(i));
		}
		
	}

	public ArrayList<Celda> getCeldas() {
		return celdas;
	}

	public void setCeldas(ArrayList<Celda> celdas) {
		this.celdas = celdas;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
