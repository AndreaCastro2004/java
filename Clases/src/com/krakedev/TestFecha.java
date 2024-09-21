package com.krakedev;

public class TestFecha {

	public static void main(String[] args) {
		/*Este ya no funcionaria porque no hay un metodo constructivo vacio
		 * Fecha fecha1= new Fecha();
		 * por ende esto tampoco iria
		 * fecha1.setAnio(2000);
		 *fecha1.setMes(4);
		 *fecha1.setDia(13);*/
		
		Fecha fecha2=new Fecha(2006,4,15);
		
		System.out.println("anio:"+fecha2.getAnio());
		System.out.println("mes:"+fecha2.getMes());
		System.out.println("dia:"+fecha2.getDia());
		

	}

}
