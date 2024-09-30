package com.krakedev.evaluacion;

public class Telefono {
	private String numero;
	private String tipo;
	private String estado;
	
	
	
	public Telefono(String numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
		if(numero!=null && tipo!=null ) {
			if(tipo.equals("Movil") || tipo.equals("Convencional")) {
				estado="C";
				if(tipo.equals("Movil")) {
					if(numero.length()==10) {
						this.numero = numero;
						this.tipo = tipo;
					}else if(numero.length()<10){
						this.numero = numero;
						this.tipo = tipo;
						estado="E";
					}
				}else if(tipo.equals("Convencional")) {
					if(numero.length()==7) {
						this.numero = numero;
						this.tipo = tipo;
					}
				}
			}else {
				estado="E";
			}
		}else if(numero==null || tipo==null ){
			estado="E";
		}
	}
	public String getNumero() {
		return numero;
	}
	public String getTipo() {
		return tipo;
	}
	public String getEstado() {
		return estado;
	}
	
	
}
