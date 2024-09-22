package com.krakedev.test;

import com.krakedev.Rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();

		int areaR1;
		int areaR2;
		double perimetro1;

		r1.setBase(10);
		r1.setAltura (5);
		r2.setBase (8);
		r2.setAltura (3);

		areaR1 = r1.calcularArea();
		areaR2 = r2.calcularArea();
		perimetro1 = r1.calcularPerimetro();

		System.out.println("Resultado area1:" + areaR1);
		System.out.println("Resultado area2:" + areaR2);
		System.out.println("Resultado perimetro1:" + perimetro1);

	}

}
