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
	}
	public String contarClaro(Telefono tel1,Telefono tel2 ,Telefono tel3,Telefono tel4) {
		String resultado="No se encontro ninguna operadora claro";
		if(tel1.getOperadora()=="claro" && tel2.getOperadora()=="claro" && tel3.getOperadora()=="claro" && tel4.getOperadora()=="claro") {
			resultado="Hay cuatro operadoras claro";
			return resultado ;
		}else if(tel1.getOperadora()=="claro" && tel2.getOperadora()=="claro" && tel3.getOperadora()=="claro" && tel4.getOperadora()!="claro") {
			 resultado="Hay tres operadoras claro";
			return resultado ;
		}else if(tel1.getOperadora()=="claro" && tel2.getOperadora()=="claro" && tel3.getOperadora()!="claro" && tel4.getOperadora()=="claro") {
			 resultado="Hay tres operadoras claro";
			return resultado ;
		}else if(tel1.getOperadora()=="claro" && tel2.getOperadora()!="claro" && tel3.getOperadora()=="claro" && tel4.getOperadora()=="claro") {
			 resultado="Hay tres operadoras claro";
			return resultado ;
		}else if(tel1.getOperadora()!="claro" && tel2.getOperadora()=="claro" && tel3.getOperadora()=="claro" && tel4.getOperadora()=="claro") {
			 resultado="Hay tres operadoras claro";
			return resultado ;
		}else if(tel1.getOperadora()!="claro" && tel2.getOperadora()!="claro" && tel3.getOperadora()=="claro" && tel4.getOperadora()=="claro") {
			 resultado="Hay dos operadoras claro";
			return resultado ;
		}else if(tel1.getOperadora()!="claro" && tel2.getOperadora()=="claro" && tel3.getOperadora()!="claro" && tel4.getOperadora()=="claro") {
			 resultado="Hay dos operadoras claro";
			return resultado ;
		}else if(tel1.getOperadora()!="claro" && tel2.getOperadora()=="claro" && tel3.getOperadora()=="claro" && tel4.getOperadora()!="claro") {
			 resultado="Hay dos operadoras claro";
			return resultado ;
		}else if(tel1.getOperadora()=="claro" && tel2.getOperadora()!="claro" && tel3.getOperadora()!="claro" && tel4.getOperadora()=="claro") {
			 resultado="Hay dos operadoras claro";
			return resultado ;
		}else if(tel1.getOperadora()=="claro" && tel2.getOperadora()!="claro" && tel3.getOperadora()=="claro" && tel4.getOperadora()!="claro") {
			 resultado="Hay dos operadoras claro";
			return resultado ;
		}else if(tel1.getOperadora()=="claro" && tel2.getOperadora()=="claro" && tel3.getOperadora()!="claro" && tel4.getOperadora()!="claro") {
			 resultado="Hay dos operadoras claro";
			return resultado ;
		}else if(tel1.getOperadora()=="claro" && tel2.getOperadora()!="claro" && tel3.getOperadora()!="claro"&& tel4.getOperadora()!="claro") {
			 resultado="Hay una operadora claro";
			return resultado ;
		}else if(tel1.getOperadora()!="claro" && tel2.getOperadora()=="claro" && tel3.getOperadora()!="claro"&& tel4.getOperadora()!="claro") {
			 resultado="Hay una operadora claro";
			return resultado ;
		}else if(tel1.getOperadora()!="claro" && tel2.getOperadora()!="claro" && tel3.getOperadora()=="claro"&& tel4.getOperadora()!="claro") {
			 resultado="Hay una operadora claro";
			return resultado ;
		}else if(tel1.getOperadora()!="claro" && tel2.getOperadora()!="claro" && tel3.getOperadora()!="claro"&& tel4.getOperadora()=="claro") {
			 resultado="Hay una operadora claro";
			return resultado ;
		}
		return resultado;
	}
}
