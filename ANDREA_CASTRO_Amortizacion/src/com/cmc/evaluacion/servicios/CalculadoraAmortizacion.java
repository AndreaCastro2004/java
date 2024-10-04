package com.cmc.evaluacion.servicios;

import com.cmc.evaluacion.entidades.Cuota;
import com.cmc.evaluacion.entidades.Prestamo;

public class CalculadoraAmortizacion {
	public static double calcularCuota(Prestamo prestamo) {
		Prestamo prestamo1 = new Prestamo(prestamo.getMonto(), prestamo.getInteres(), prestamo.getPlazo());
		// calcular el interes de i
		double interesMensual = prestamo.getInteres() / 12;// se mantiene ;
		double interesPeriodo = interesMensual / 100;
		double dividiendo = 0;
		double divisor = 0;
		double valorCuota = 0;
		// calculo el valor cuorta
		dividiendo = (prestamo1.getMonto() * interesPeriodo);
		divisor = 1 - Math.pow(1 + interesPeriodo, -prestamo.getPlazo());
		valorCuota = dividiendo / divisor;
		return valorCuota;
	}

	public static void generarTabla(Prestamo prestamo) {
		double valorCuota = calcularCuota(prestamo);
		Cuota cuota1 = new Cuota(1);
		Cuota valores1=calcularValoresCuota(prestamo.getInteres(),valorCuota,prestamo.getMonto());
		
		cuota1.setInicio(prestamo.getMonto());
		cuota1.setCuota(valorCuota);
		cuota1.setInteres(valores1.getInteres());
		cuota1.setAbonoCapital(valores1.getAbonoCapital());
		cuota1.setSaldo(valores1.getSaldo());
		prestamo.getCuotas().add(cuota1);
		for(int i=0;i<prestamo.getCuotas().size();i++) {
			if(prestamo.getCuotas().size()<=prestamo.getPlazo()-1) {
				cuota1=new Cuota(i+2);
				prestamo.getCuotas().add(cuota1);
				double saldo=prestamo.getCuotas().get(i).getSaldo();
				cuota1.setInicio(saldo);
				cuota1.setCuota(prestamo.getCuotas().get(i).getCuota());
				valores1=calcularValoresCuota(prestamo.getInteres(),valorCuota,prestamo.getCuotas().get(i).getSaldo());
				cuota1.setInteres(valores1.getInteres());
				cuota1.setAbonoCapital(valores1.getAbonoCapital());
				cuota1.setSaldo(valores1.getSaldo());
				if(prestamo.getCuotas().size()==prestamo.getPlazo()) {
					double ultimoSaldo=cuota1.getSaldo();
					double restandoSaldoPendiente=ultimoSaldo-cuota1.getSaldo();
					cuota1.setSaldo(restandoSaldoPendiente);
				}	
				}
			}
		
		

	}

	public static void mostrarTabla(Prestamo prestamo) {
		System.out.println("numero" + "  | " + "cuota" + "  | " + "capital" + "  | " + "interes" + "  | " + "abonoCapital"
				+ "  | " + "saldo"); 
		for(int j=0;j<prestamo.getCuotas().size();j++) {
			prestamo.getCuotas().get(j).mostrarPrestamo();
		}
	}

	public static Cuota calcularValoresCuota(double interes, double calculadaCuota, double cuota) {//cuota saldo que se va restandodel monto//
		// objeto cuota;
		Cuota cuota1 = new Cuota(1);
		// calcular el valor del interes
		double interesMensual = interes / 12;
		double interesAPagar = cuota * (interesMensual / 100);
		cuota1.setInteres(interesAPagar);
		double abonoCapital = calculadaCuota - interesAPagar;
		cuota1.setAbonoCapital(abonoCapital);
		double saldoCuotaActual = cuota - abonoCapital;
		cuota1.setSaldo(saldoCuotaActual);
		return cuota1;

	}
}
