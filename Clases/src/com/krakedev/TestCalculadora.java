package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		int resultadoSuma;
		int resultadoResta;
		double resultadoMultiplicacion;
		
		calcu=new Calculadora();
		
		resultadoSuma=calcu.sumar(5,3);
		resultadoResta=calcu.restar(10, 18);
		resultadoMultiplicacion=calcu.multiplicar(5, 10);
		
		System.out.println("Resultado Suma:"+resultadoSuma);
		System.out.println("Resultado Resta:"+resultadoResta);
		System.out.println("Resultado Multiplicacion:"+resultadoMultiplicacion);
	
	}

}
