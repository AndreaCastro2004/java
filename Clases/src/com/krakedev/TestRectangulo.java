package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1= new Rectangulo();
		Rectangulo r2=new Rectangulo();
		
		int areaR1;
		int areaR2;
		
		r1.base=10;
		r1.altura=5;
		r2.base=8;
		r2.altura=3;
		
		areaR1=r1.calcularArea();	
		areaR2=r2.calcularArea();
		System.out.println("Resultado area1:"+areaR1);
		System.out.println("Resultado area2:"+areaR2);

	}

}
