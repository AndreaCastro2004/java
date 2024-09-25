package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;
	
	//metodos
	public void configurarMaquina(String codigo1,String codigo2,String codigo3,String codigo4) {
		celda1.setCodigo(codigo1);
		celda2.setCodigo(codigo2);
		celda3.setCodigo(codigo3);
		celda4.setCodigo(codigo4);
	}
	public void mostrarConfiguracion() {
		System.out.println("Codigo de celda1:"+celda1.getCodigo());
		System.out.println("Codigo de celda2:"+celda2.getCodigo());
		System.out.println("Codigo de celda3:"+celda3.getCodigo());
		System.out.println("Codigo de celda4:"+celda4.getCodigo());
	}
	public Celda buscarCelda(String codigoCelda) {
		if(celda1.getCodigo()==codigoCelda) {
			return celda1;
		}else if(celda2.getCodigo()==codigoCelda) {
			return celda2;
		}else if(celda3.getCodigo()==codigoCelda) {
			return celda3;
		}else if(celda4.getCodigo()==codigoCelda) {
			return celda4;
		}	
		return null;
	}
	public void cargarProducto(Producto p1,String codigoCelda,int itemns) {	
		Celda celdaRecuperada=buscarCelda(codigoCelda);
		celdaRecuperada.ingresarProducto(p1, itemns);
	}
}