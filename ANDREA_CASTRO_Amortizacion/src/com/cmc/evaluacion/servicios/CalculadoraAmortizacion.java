package com.cmc.evaluacion.servicios;

import com.cmc.evaluacion.entidades.Prestamo;

public class CalculadoraAmortizacion {
	public static double calcularCuota(Prestamo prestamo) {
		Prestamo prestamo1=new Prestamo(prestamo.getMonto(), prestamo.getInteres(), prestamo.getPlazo());
		//calcular el interes de i
		double interesMensual=prestamo.getInteres()/12;
		double interesPeriodo=interesMensual/100;
		double dividiendo=0;
		double divisor=0;
		double valorCuota = 0;
		//calculo el valor cuorta
		dividiendo=(prestamo1.getMonto()*interesPeriodo);
		divisor=1-Math.pow(1+interesPeriodo, -prestamo.getPlazo());
		valorCuota=dividiendo/divisor;
		return valorCuota;
	} 
}
