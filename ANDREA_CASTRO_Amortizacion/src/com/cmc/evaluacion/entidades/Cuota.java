package com.cmc.evaluacion.entidades;

import java.text.DecimalFormat;

public class Cuota {
	private int numero;
	private double cuota;// lo que tienen que pagar cada mes
	private double capital;// El capital que tiene al inicio del mes sin abonar
	   private double inicio;// capital al inicio del periodo despues de abonar osea el salo que quedo del
							// anterior mes
	private double interes;// lo saco con el interes mensual
	private double abonoCapital;// lo que abono restando el inteeres
	private double saldo;// el saldo que queda despues de abonar

	// constructor
	public Cuota(int numero) {
		this.numero = numero;
	}

	// metodo
	public void mostrarPrestamo() {
		Utilitario redondear = new Utilitario();
		double numero1=redondear.redondear(numero);
		double cuota1=redondear.redondear(cuota);
		double capital1=redondear.redondear(capital);
		double interes1=redondear.redondear(interes);
		double abonoCapital1=redondear.redondear(abonoCapital);
		double saldo1=redondear.redondear(saldo);

		System.out.println(
				numero1 + " | "+ cuota1 + " | " + capital1 + " | " + interes1 + " | " +abonoCapital1 + " | " + saldo);
	}

	// getters and setters
	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	public double getCapital() {
		return capital;
	}

	public void setCapital(double capital) {
		this.capital = capital;
	}

	public double getInicio() {
		return inicio;
	}

	public void setInicio(double inicio) {
		this.inicio = inicio;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public double getAbonoCapital() {
		return abonoCapital;
	}

	public void setAbonoCapital(double abonoCapital) {
		this.abonoCapital = abonoCapital;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
