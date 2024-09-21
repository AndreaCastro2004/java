package com.krakedev;

public class TestFecha {

	public static void main(String[] args) {
		Fecha fecha1= new Fecha();
		//modificamos con set
		fecha1.setAnio(2000);
		fecha1.setMes(4);
		fecha1.setDia(13);
		//recuperamos con get
		System.out.println("anio:"+fecha1.getAnio());
		
		

	}

}
