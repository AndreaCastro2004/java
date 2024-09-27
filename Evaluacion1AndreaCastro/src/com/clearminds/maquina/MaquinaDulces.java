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
		for (int i = 0; i < celdas.size(); i++) {
			elementos = celdas.get(i);
			System.out.println("Celda" + (i + 1) + ":" + elementos.getCodigo());
		}

	}

	public Celda buscarCelda(String codigoCelda) {
		Celda celdaCodigo;
		Celda celdaEncontrada = null;
		for (int i = 0; i < celdas.size(); i++) {
			celdaCodigo = celdas.get(i);
			if (celdaCodigo.getCodigo() == codigoCelda) {
				celdaEncontrada = celdaCodigo;
			}
		}
		return celdaEncontrada;

	}

	public void cargarProducto(Producto p1, String codigoCelda, int itemns) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		celdaRecuperada.ingresarProducto(p1, itemns);
	}

	public void mostrarProductos() {
		Celda elemento;
		for (int i = 0; i < celdas.size(); i++) {
			elemento = celdas.get(i);
			if (elemento.getProducto() != null) {
				System.out.println("Celda:" + elemento.getCodigo() + " " + "Stock:" + elemento.getStock() + " "
						+ "Producto:" + elemento.getProducto().getNombre() + " " + "Precio:"
						+ elemento.getProducto().getPrecio());
			}else {
				System.out.println("Celda:" + elemento.getCodigo() + " " + "Stock:" + elemento.getStock() + " "
						+ "Sin producto asignado");
			}
		}
		System.out.println("Saldo:"+saldo);

	}
	
	
	public Producto buscarProductoEnCelda(String codigoCelda) {
		Celda elemento;
		Celda elementoEncontrado;
		for(int i=0;i<celdas.size();i++) {
			elemento=celdas.get(i);
			if(codigoCelda.equals(elemento.getCodigo())) {
				elementoEncontrado=elemento;
				return elementoEncontrado.getProducto();
			}
		}
		return null;
	}
	
	public double consultarPrecio(String codigoCelda) {
		
		Celda elemento;
		Celda elementoEncontrado;
		for(int i=0;i<celdas.size();i++) {
			elemento=celdas.get(i);
			if(codigoCelda.equals(elemento.getCodigo())) {
				elementoEncontrado=elemento;
				return elementoEncontrado.getProducto().getPrecio();
			}
		}
		return 0;
	}
	
	public Celda buscarCeldaProducto(String codigoProducto) {
		Celda elemento;
		Celda elementoEncontrado;
		for(int i=0;i<celdas.size();i++) {
			elemento=celdas.get(i);
			if(elemento.getProducto()!=null) {
				if(codigoProducto.equals(elemento.getProducto().getCodigo())) {
					elementoEncontrado=elemento;
					return elementoEncontrado;
				}
			}
		}
		return null;
	}
	
	
	public void incrementarProductos(String codigoProducto,int itemns ) {
		Celda celdaEncontrada=buscarCeldaProducto(codigoProducto);
		celdaEncontrada.setStock(celdaEncontrada.getStock()+itemns);
	}
	
	public void vender(String codigoCelda) {
		Celda elemento;
		for(int i=0;i<celdas.size();i++) {
			elemento=celdas.get(i);
			if(codigoCelda.equals(elemento.getCodigo())) {
				elemento.setStock(elemento.getStock()-1);

				double precio=elemento.getProducto().getPrecio();
				saldo=precio+saldo;
			}	
		}
		mostrarProductos();
	}
	
	
	public double venderConCambio(String codigoCelda,double saldo) {
		Celda elemento;
		for(int i=0;i<celdas.size();i++) {
			elemento=celdas.get(i);
			if(codigoCelda.equals(elemento.getCodigo())) {
				elemento.setStock(elemento.getStock()-1);

				double precio=elemento.getProducto().getPrecio();
				this.saldo=precio+this.saldo;
			}
		}
		return 0;
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
