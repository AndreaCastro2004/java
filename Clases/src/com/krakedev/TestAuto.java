package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// 1.-Instanciar 2 autos y referenciarlos
		//Auto auto1 = new Auto();
		//Auto auto2 = new Auto();
		// 2 Modificar los valores
		//auto1.setMarca( "Toyota");
		//auto1.setAnio(2008);
		//auto1.setPrecio( 2000);
		//auto2.setMarca( "Chevrolet");
		//auto2.setAnio( 2009);
		//auto2.setPrecio(2600);
		
		Auto auto3= new Auto("Chevrolet",2010,3030);
		
		
		// 3.-mostrar los valores en consola
		System.out.println("marca:" + auto3.getMarca());
		System.out.println("anio:" + auto3.getAnio());
		System.out.println("precio:" + auto3.getPrecio());
		

		
	}

}
