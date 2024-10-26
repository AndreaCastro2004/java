package com.krakedev.evaluacion.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.krakedev.evaluacion.excepciones.KrakeException;

public class ConexionBDD {
	public static Connection obtenerConexion() {
		Context ctx = null;
		DataSource ds = null;
		Connection con = null;
		try {
			ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/ConexionPG");
			con = ds.getConnection();

		} catch (NamingException | SQLException e) {
			e.printStackTrace();
		} 
		
		return con;
	}
}
