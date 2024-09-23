package com.cmc.repaso.entidades;

public class Validacion {
	public boolean validarMonto(int monto) {
		if(monto>0) {
			return true;
		}
		return false;
		
	}
}
