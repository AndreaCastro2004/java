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
}
