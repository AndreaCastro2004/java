package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// 1.-Instanciar 3 variables tipo producto y refenrenciar
		Productos productoA = new Productos();
		Productos productoB = new Productos();
		Productos productoC = new Productos();
		// 2.-Modificar los atributos con productos de farmacia
		productoA.setNombre("Curitas");
		productoA.setDescripcion("Tira adhesiva con un aposito pequeño");
		productoA.setPrecio(1.23);
		productoA.setStockActual (5);

		productoB.setNombre ("Alcohol");
		productoB.setDescripcion ("para tratar heridas grandes o pequeñas");
		productoB.setPrecio (1.50);
		productoB.setStockActual (8);

		productoC.setNombre("Merthiolate");
		productoC.setDescripcion("Desinfectante,germicida, de uso topico");
		productoC.setPrecio (2);
		productoC.setStockActual( 10);
		// 3.-mostrar en pantalla todos los valores
		System.out.println("Nombre:" + productoA.getNombre());
		System.out.println("Descripcion:" + productoA.getDescripcion());
		System.out.println("Precio:" + productoA.getPrecio());
		System.out.println("Stock Actual:" + productoA.getStockActual());
		System.out.println("----------------");
		System.out.println("Nombre:" + productoB.getNombre());
		System.out.println("Descripcion:" + productoB.getDescripcion());
		System.out.println("Precio:" + productoB.getPrecio());
		System.out.println("Stock Actual:" + productoB.getStockActual());
		System.out.println("----------------");
		System.out.println("Nombre:" + productoC.getNombre());
		System.out.println("Descripcion:" + productoC.getDescripcion());
		System.out.println("Precio:" + productoC.getPrecio());
		System.out.println("Stock Actual:" + productoC.getStockActual());

	}

}
