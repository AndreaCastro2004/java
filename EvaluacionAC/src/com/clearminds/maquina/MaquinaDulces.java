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
	public void mostrarProducto() {
		System.out.println("Codigo de celda1:"+celda1.getCodigo());
		System.out.println("Stock de celda1:"+celda1.getStock());
		System.out.println("Nombre de celda1:"+celda1.getProducto().getNombre());
		System.out.println("Precio de celda1:"+celda1.getProducto().getPrecio());
		
		System.out.println("Codigo de celda2:"+celda2.getCodigo());
		System.out.println("Stock de celda2:"+celda2.getStock());
		System.out.println("Nombre de celda2:"+celda2.getProducto().getNombre());
		System.out.println("Precio de celda2:"+celda2.getProducto().getPrecio());
		
		System.out.println("Codigo de celda3:"+celda3.getCodigo());
		System.out.println("Stock de celda3:"+celda3.getStock());
		System.out.println("Nombre de celda3:"+celda3.getProducto().getNombre());
		System.out.println("Precio de celda3:"+celda3.getProducto().getPrecio());
		
	}
	public Producto buscarProductoEnCelda(String codigoCelda) {
		if(celda1.getCodigo()==codigoCelda) {
			return celda1.getProducto();
		}else if(celda2.getCodigo()==codigoCelda) {
			return celda2.getProducto();
		}else if(celda3.getCodigo()==codigoCelda) {
			return celda3.getProducto();
		}else if(celda4.getCodigo()==codigoCelda) {
			return celda4.getProducto();
		}	
		return null;
		
	}
	public double consultarPrecio(String codigoCelda) {
		if(celda1.getCodigo()==codigoCelda) {
			return celda1.getProducto().getPrecio();
		}else if(celda2.getCodigo()==codigoCelda) {
			return celda2.getProducto().getPrecio();
		}else if(celda3.getCodigo()==codigoCelda) {
			return celda3.getProducto().getPrecio();
		}else if(celda4.getCodigo()==codigoCelda) {
			return celda4.getProducto().getPrecio();
		}
		return 0;	
	}
	public Celda buscarCeldaProducto(String codigoProducto) {
		if(celda1.getProducto().getCodigo()==codigoProducto) {
			return celda1;
		}else if(celda2.getProducto().getCodigo()==codigoProducto) {
			return celda2;
		}else if(celda3.getProducto().getCodigo()==codigoProducto) {
			return celda3;
		}else if(celda4.getProducto().getCodigo()==codigoProducto) {
			return celda4;
		}
		return null;
	}
	public void incrementarProductos(String codigoProducto,int itemns ) {
		Celda celdaEncontrada=buscarCeldaProducto(codigoProducto);
		celdaEncontrada.setStock(itemns);
	}
	
}
