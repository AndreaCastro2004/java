package com.krakedev.composicion;

public class Direccion {
	private String callePrincipal;
	private String CalleSecundaria;
	private double latitud;
	private double longitud;
	private String numeroCasa;
	
	public String getNumeroCasa() {
		return numeroCasa;
	}
	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
	public String getCallePrincipal() {
		return callePrincipal;
	}
	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}
	public String getCalleSecundaria() {
		return CalleSecundaria;
	}
	public void setCalleSecundaria(String calleSecundaria) {
		CalleSecundaria = calleSecundaria;
	}
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	
	
}
