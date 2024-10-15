package com.krakedev.persistencia.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Convertidor {
	private static final String FORMATO_FECHA="yyyy/MM/dd" ;
	private static final String FORMATO_HORA="hh:mm";
	private static final Logger LOGGER=LogManager.getLogger(Convertidor.class);
	
	public static Date convertirFecha(String fechaString) throws Exception {
		SimpleDateFormat sdf=new SimpleDateFormat(FORMATO_FECHA);
		Date fecha=null;
		try {
			LOGGER.trace("Convirtiendo la fecha: "+ fechaString);
			fecha=sdf.parse(fechaString);
			LOGGER.trace("Fecha convertida: "+ fecha);
		} catch (ParseException e) {
			LOGGER.error("La fecha no tiene el formato correcto"+fechaString,e);
			throw new Exception("La fecha no tiene el formato correcto"+fechaString);
		}
		return fecha;
	}
	public static Date convertirHora(String horaString) throws Exception {
		SimpleDateFormat sdf=new SimpleDateFormat(FORMATO_HORA);
		Date hora=null;
		try {
			hora=sdf.parse(horaString);
		} catch (ParseException e) {
			LOGGER.error("La hora no tiene el formato correcto"+horaString,e);
			throw new Exception("La hora no tiene el formato correcto"+horaString);
		}
		return hora;
	}

}
