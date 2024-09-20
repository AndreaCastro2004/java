package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// 1.-Instanciar 3 variables tipo producto y refenrenciar
		Productos productoA = new Productos();
		Productos productoB = new Productos();
		Productos productoC = new Productos();
		// 2.-Modificar los atributos con productos de farmacia
		productoA.nombre = "Curitas";
		productoA.descripcion = "Tira adhesiva con un aposito pequeño";
		productoA.precio = 1.23;
		productoA.stockActual = 5;

		productoB.nombre = "Alcohol";
		productoB.descripcion = "para tratar heridas grandes o pequeñas";
		productoB.precio = 1.50;
		productoB.stockActual = 8;

		productoC.nombre = "Merthiolate";
		productoC.descripcion = "Desinfectante,germicida, de uso topico";
		productoC.precio = 2;
		productoC.stockActual = 10;
		// 3.-mostrar en pantalla todos los valores
		System.out.println("Nombre:" + productoA.nombre);
		System.out.println("Descripcion:" + productoA.descripcion);
		System.out.println("Precio:" + productoA.precio);
		System.out.println("Stock Actual:" + productoA.stockActual);
		System.out.println("----------------");
		System.out.println("Nombre:" + productoB.nombre);
		System.out.println("Descripcion:" + productoB.descripcion);
		System.out.println("Precio:" + productoB.precio);
		System.out.println("Stock Actual:" + productoB.stockActual);
		System.out.println("----------------");
		System.out.println("Nombre:" + productoC.nombre);
		System.out.println("Descripcion:" + productoC.descripcion);
		System.out.println("Precio:" + productoC.precio);
		System.out.println("Stock Actual:" + productoC.stockActual);

	}

}
