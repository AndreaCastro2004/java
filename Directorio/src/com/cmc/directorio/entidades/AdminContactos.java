package com.cmc.directorio.entidades;

public class AdminContactos {
	public Contacto buscarMasPesado(Contacto c1,Contacto c2){
		if(c1.getPeso()>c2.getPeso()) {
			return  c1;
		}else {
			return c2;
		}
	}
	public boolean compararOperadoras(Contacto oper1, Contacto oper2) {
		Telefono op1=oper1.getTelefono();
		Telefono op2=oper2.getTelefono();
		if(op1.getOperadora()==op2.getOperadora()) {
			return true;
		}else {
			return false;
		}
	}
	public void activarUsuario(Contacto c1) {
		Telefono telf=c1.getTelefono();
		if(telf.isTieneWhatsapp()==true) {
			c1.setActivo(true);
		}
	}
}