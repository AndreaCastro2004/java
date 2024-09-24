package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono telefono) {
		if(telefono.getOperadora()=="movi") {
			telefono.setTieneWhatsapp(true);
		}
	}
	public String contarMovi(Telefono tel1,Telefono tel2 ,Telefono tel3) {
		String resultado="No se encontro ninguna operadora movi";
		if(tel1.getOperadora()=="movi" && tel2.getOperadora()=="movi" && tel3.getOperadora()=="movi") {
			resultado="Hay tres operadoras movi";
			return resultado ;
		}else if(tel1.getOperadora()=="movi" && tel2.getOperadora()=="movi" && tel3.getOperadora()!="movi") {
			 resultado="Hay dos operadora movi";
			return resultado ;
		}else if(tel1.getOperadora()=="movi" && tel2.getOperadora()!="movi" && tel3.getOperadora()=="movi") {
			 resultado="Hay dos operadora movi";
			return resultado ;
		}else if(tel1.getOperadora()!="movi" && tel2.getOperadora()=="movi" && tel3.getOperadora()=="movi") {
			 resultado="Hay dos operadora movi";
			return resultado ;
		}else if(tel1.getOperadora()=="movi" && tel2.getOperadora()!="movi" && tel3.getOperadora()!="movi") {
			 resultado="Hay una operadora movi";
			return resultado ;
		}else if(tel1.getOperadora()!="movi" && tel2.getOperadora()=="movi" && tel3.getOperadora()!="movi") {
			 resultado="Hay una operadora movi";
			return resultado ;
		}else if(tel1.getOperadora()!="movi" && tel2.getOperadora()!="movi" && tel3.getOperadora()=="movi") {
			 resultado="Hay una operadora movi";
			return resultado ;
		}
		return resultado;
	}}
