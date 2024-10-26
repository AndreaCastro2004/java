package com.krakedev.evaluacion.excepciones;

public class KrakeException extends Exception { //heredamos de la clase Exception para eso utilixamos estends 
	public KrakeException (String mensaje) { //utilizamos ek constructor de la clase el cual recibe un parametro
		super(mensaje);//con el super llama al constructor del papa en este caso el papa es la clase exception
	}
}
