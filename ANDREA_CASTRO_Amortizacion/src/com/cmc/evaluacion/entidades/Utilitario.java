package com.cmc.evaluacion.entidades;

import java.text.DecimalFormat;

public class Utilitario {

	public double redondear(double valor) {
		double redondeado=Math.round(valor*100.0)/100.0;
		return redondeado;
	}
}
