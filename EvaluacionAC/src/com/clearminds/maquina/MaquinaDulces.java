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
		 celda1= new Celda(codigo1);
		 celda2= new Celda(codigo2);
		 celda3= new Celda(codigo3);
		 celda4= new Celda(codigo4);
		
	}
	public void mostrarConfiguracion() {
		System.out.println("CELDA 1:"+celda1.getCodigo());
		System.out.println("CELDA 2:"+celda2.getCodigo());
		System.out.println("CELDA 3:"+celda3.getCodigo());
		System.out.println("CELDA 4:"+celda4.getCodigo());
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
	public void mostrarProductos() {
		System.out.println("********CELDA A1");
		if(celda1.getProducto()!=null) {
			System.out.println("Saldo:"+saldo);
			System.out.println("Stock:"+celda1.getStock());
			System.out.println("Nombre Producto:"+celda1.getProducto().getNombre());
			System.out.println("Precio Producto:"+celda1.getProducto().getPrecio());
			System.out.println("Código Producto:"+celda1.getProducto().getCodigo());
		}else {
			System.out.println("Saldo:"+saldo);
			System.out.println("Stock:"+celda1.getStock());
			System.out.println("La celda no tiene producto!!");
		}
		System.out.println("********CELDA A2");
		if(celda2.getProducto()!=null) {
			System.out.println("Saldo:"+saldo);
			System.out.println("Stock de celda2:"+celda2.getStock());
			System.out.println("Nombre de celda2:"+celda2.getProducto().getNombre());
			System.out.println("Precio de celda2:"+celda2.getProducto().getPrecio());
			System.out.println("Codigo de celda2:"+celda2.getProducto().getCodigo());

		}else {
			System.out.println("Saldo:"+saldo);
			System.out.println("Stock:"+celda2.getStock());
			System.out.println("La celda no tiene producto!!");
		}
		System.out.println("********CELDA B1");
		if(celda3.getProducto()!=null) {
			System.out.println("Saldo:"+saldo);
			System.out.println("Stock:"+celda3.getStock());
			System.out.println("Nombre Producto:"+celda3.getProducto().getNombre());
			System.out.println("Precio Producto:"+celda3.getProducto().getPrecio());
			System.out.println("Codigo Producto:"+celda3.getProducto().getCodigo());
		}else {
			System.out.println("Saldo:"+saldo);
			System.out.println("Stock:"+celda2.getStock());
			System.out.println("La celda no tiene producto!!");
		}
		System.out.println("********CELDA B2");
		if(celda4.getProducto()!=null) {
			System.out.println("Saldo:"+saldo);
			System.out.println("Stock:"+celda4.getStock());
			System.out.println("Nombre Producto:"+celda4.getProducto().getNombre());
			System.out.println("Precio Producto:"+celda4.getProducto().getPrecio());
			System.out.println("Codigo Producto:"+celda4.getProducto().getCodigo());
		}else {
			System.out.println("Saldo:"+saldo);
			System.out.println("Stock:"+celda2.getStock());
			System.out.println("La celda no tiene producto!!");
		}
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
		if(celda1.getProducto()!=null && celda1.getProducto().getCodigo()==codigoProducto) {
			return celda1;
		}else if(celda2.getProducto()!=null && celda2.getProducto().getCodigo()==codigoProducto) {
			return celda2;
		}else if(celda3.getProducto()!=null && celda3.getProducto().getCodigo()==codigoProducto) {
			return celda3;
		}else if(celda4.getProducto()!=null && celda4.getProducto().getCodigo()==codigoProducto) {
			return celda4;
		}
		return null;
	}
	public void incrementarProductos(String codigoProducto,int itemns ) {
		Celda celdaEncontrada=buscarCeldaProducto(codigoProducto);
		celdaEncontrada.setStock(celdaEncontrada.getStock()+itemns);
	}
	public void vender(String codigoCelda) {
		if(celda1.getCodigo()==codigoCelda) {
			celda1.setStock(celda1.getStock()-1);

			double precio=celda1.getProducto().getPrecio();
			saldo=precio+saldo;
		}else if(celda2.getCodigo()==codigoCelda) {
			celda2.setStock(celda2.getStock()-1);
			
			double precio=celda2.getProducto().getPrecio();
			saldo=precio+saldo;
		}else if(celda3.getCodigo()==codigoCelda) {
			celda3.setStock(celda3.getStock()-1);
			
			double precio=celda3.getProducto().getPrecio();
			saldo=precio+saldo;
		}else if(celda4.getCodigo()==codigoCelda) {
			celda4.setStock(celda4.getStock()-1);
			
			double precio=celda4.getProducto().getPrecio();
			saldo=precio+saldo;
		}
		mostrarProductos();
	}
	public double venderConCambio(String codigoCelda,double saldo) {
		if(celda1.getCodigo()==codigoCelda) {
			celda1.setStock(celda1.getStock()-1);
			
			double precio=celda1.getProducto().getPrecio();
			this.saldo=precio+this.saldo;
			
			saldo=saldo-celda1.getProducto().getPrecio();
			return saldo;
		}else if(celda2.getCodigo()==codigoCelda) {
			celda2.setStock(celda2.getStock()-1);	
			
			double precio=celda2.getProducto().getPrecio();
			this.saldo=precio+this.saldo;
			
			saldo=saldo-celda2.getProducto().getPrecio();
			return saldo;
		}else if(celda3.getCodigo()==codigoCelda) {
			celda3.setStock(celda3.getStock()-1);
			
			double precio=celda3.getProducto().getPrecio();
			this.saldo=precio+this.saldo;
			
			saldo=saldo-celda3.getProducto().getPrecio();
			return saldo;
		}else if(celda4.getCodigo()==codigoCelda) {
			celda4.setStock(celda4.getStock()-1);
			
			double precio=celda4.getProducto().getPrecio();
			this.saldo=precio+this.saldo;
			
			saldo=saldo-celda4.getProducto().getPrecio();
			return saldo;
		}
		return 0;
		
	}
	
	public Celda getCelda1() {
		return celda1;
	}
	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}
	public Celda getCelda2() {
		return celda2;
	}
	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}
	public Celda getCelda3() {
		return celda3;
	}
	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}
	public Celda getCelda4() {
		return celda4;
	}
	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
