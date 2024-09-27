package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;

	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
	}

	public void agregarCelda(Celda codigo) {
		celdas.add(codigo);
	}

	public void mostrarConfiguracion() {
		Celda elementos;
		for(int i=0;i<celdas.size();i++) {
			elementos=celdas.get(i);
			System.out.println("Celda"+(i+1)+":"+elementos.getCodigo());
		}
		
	}
	
	public Celda buscarCelda(String codigoCelda) {
		Celda celdaCodigo;
		Celda celdaEncontrada=null;
		for(int i=0;i<celdas.size();i++) {
			celdaCodigo=celdas.get(i);
			if(celdaCodigo.getCodigo()==codigoCelda) {
				celdaEncontrada=celdaCodigo;
			}
		}
		return celdaEncontrada;
	
	}
	public void cargarProducto(Producto p1,String codigoCelda,int itemns) {	
		Celda celdaRecuperada=buscarCelda(codigoCelda);
		celdaRecuperada.ingresarProducto(p1, itemns);
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
