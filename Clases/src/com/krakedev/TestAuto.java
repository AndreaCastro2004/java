package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// 1.-Instanciar 2 autos y referenciarlos
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		// 2 Modificar los valores
		auto1.setMarca( "Toyota");
		auto1.setAnio(2008);
		auto1.setPrecio( 2000);

		auto2.setMarca( "Chevrolet");
		auto2.setAnio( 2009);
		auto2.setPrecio(2600);
		// 3.-mostrar los valores en consola
		System.out.println("marca:" + auto1.getMarca());
		System.out.println("anio:" + auto1.getAnio());
		System.out.println("precio:" + auto1.getPrecio());
		System.out.println("------------");
		System.out.println("marca:" + auto2.getMarca());
		System.out.println("anio:" + auto2.getAnio());
		System.out.println("precio:" + auto2.getPrecio());

		
	}

}
