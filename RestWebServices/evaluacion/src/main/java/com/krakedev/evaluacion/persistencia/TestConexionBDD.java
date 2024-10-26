package com.krakedev.evaluacion.persistencia;

import java.sql.Connection;

import com.krakedev.evaluacion.excepciones.KrakeException;
import com.krakedev.evaluacion.utils.ConexionBDD;

public class TestConexionBDD {
	public void probarConexion() {
		Connection con=null;
		try {
			con=ConexionBDD.obtenerConexion();
			System.out.println("CONEXION EXITOSA");
		} catch (KrakeException e) {
			e.printStackTrace();
			System.out.println("ERROR AL OBTENER CONEXION");
		}
	}
}
