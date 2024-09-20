package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado lado1= new Cuadrado();
		Cuadrado lado2= new Cuadrado();
		Cuadrado lado3= new Cuadrado();
		
		double resultadoAreaLad1;
		double resultadoPerimetroLad1;
		double resultadoAreaLad2;
		double resultadoPerimetroLad2;
		double resultadoAreaLad3;
		double resultadoPerimetroLad3;
		
		lado1.lado=4;
		lado2.lado=5;
		lado3.lado=8;
		
		resultadoAreaLad1=lado1.calcularArea();		
		resultadoPerimetroLad1=lado1.calcularPerimetro();
		resultadoAreaLad2=lado2.calcularArea();
		resultadoPerimetroLad2=lado2.calcularPerimetro();
		resultadoAreaLad3=lado3.calcularArea();
		resultadoPerimetroLad3=lado3.calcularPerimetro();
		
		System.out.println("Resultado Area lado1:"+resultadoAreaLad1);
		System.out.println("Resultado Perimetro lado1:"+resultadoPerimetroLad1);
		System.out.println("Resultado Area lado1:"+resultadoAreaLad2);
		System.out.println("Resultado Perimetro lado1:"+resultadoPerimetroLad2);
		System.out.println("Resultado Area lado1:"+resultadoAreaLad3);
		System.out.println("Resultado Perimetro lado1:"+resultadoPerimetroLad3);
		
		
		
	}

}
