package com.krakedev.persistencia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.servicios.AdminPersonas;

public class ConexionBDD {
	private static final String DRIVE="org.postgresql.Driver";
	private static final String URL="jdbc:postgresql://localhost:5432/postgres";
	private static final String USUARIO="postgres";
	private static final String CLAVE="Andrea2004";
	private static final Logger LOGGER=LogManager.getLogger(ConexionBDD.class);
	
	public static Connection conectar() throws Exception{
		Connection connection=null;
		try {
			Class.forName(DRIVE);
			connection=DriverManager.getConnection(URL,USUARIO,CLAVE);
			LOGGER.debug("Conexion Exitosa");
		} catch (ClassNotFoundException e) {
			LOGGER.error("Error en la infraestructura",e);
			throw new Exception ("Error en la infraestructura");//relanzo la exception y devo indicarla en la firma del metodo
		}catch( SQLException o) {
			LOGGER.error("Error al conectarse revise usuario y clave",o);
			throw new Exception ("Error al conectarse revise usuario y clave");//relanzo la exception y devo indicarla en la firma del metodo
		}
		return connection;
	}
}
