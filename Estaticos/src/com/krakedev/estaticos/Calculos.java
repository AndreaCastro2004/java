package com.krakedev.estaticos;

public class Calculos {
	//la constante no puede cambiar por ende para volver una variable constante utilizamos la palabra final 
	private final double IVA=12;//<--Las constantes van con mayuscula
	
	public double clacularIva(double monto) {
		return monto*IVA/100;
		
	}
	
	
	
	
}
