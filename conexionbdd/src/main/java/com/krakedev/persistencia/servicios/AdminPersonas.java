package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {
	private static final Logger LOGGER=LogManager.getLogger(AdminPersonas.class);
	
	public static void inserta(Persona persona) throws Exception{
		Connection con=null;
		PreparedStatement ps;
		LOGGER.trace("Persona a insertar >>>>"+persona);
		try{
			//abro la conexion
			 con=ConexionBDD.conectar();
			
			ps=con.prepareStatement("insert into personas (cedula,nombre,apellido,estado_civil_codigo,numero_hijos,estatura,cantidad_ahorrada,fecha_nacimiento,hora_nacimiento) "
					+"values(?,?,?,?,?,?,?,?,?)");//estas incognitas
			ps.setString(1, persona.getCedula());//las remplazo aqui
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setString(4, persona.getEstadoCivil().getCodigo());
			ps.setInt(5, persona.getNumeroHijos());
			ps.setDouble(6, persona.getEstatura());
			ps.setBigDecimal(7, persona.getCantidadAhorrada());//tipo de dato money
			ps.setDate(8,new java.sql.Date(persona.getFechaDeNacimiento().getTime()));
			ps.setTime(9,new Time(persona.getHoraNacimiento().getTime()));
			ps.executeUpdate();
			
		}catch(Exception e) {
			//llogear el error
			LOGGER.error("Error al insetar",e);
			throw new Exception("Error al insetar");//como no utilizamos sisout utilizamos el throw para mostrar el mensaje al usuario
		}finally {
			//cerrar conexion
			try {
				con.close();
			} catch (SQLException e) {
		
				LOGGER.error("Error con la base de datos",e);
				throw new Exception("Error con la base de datos");
			}
		}
	}
	
	public static void actualizar(Persona persona) throws Exception {
		Connection con= null;
		PreparedStatement ps;
		LOGGER.trace("Persona a actualizar >>>>"+persona);
		try {
			con=ConexionBDD.conectar();
			ps=con.prepareStatement("update personas set nombre=?,apellido=?,estatura=?,"
					+ "fecha_nacimiento=?,hora_nacimiento=?,cantidad_ahorrada=?,"
					+ "numero_hijos=?,estado_civil_codigo=? where cedula=?");
			ps.setString(1,persona.getNombre());
			ps.setString(2,persona.getApellido());
			ps.setDouble(3,persona.getEstatura());
			ps.setDate(4,new java.sql.Date(persona.getFechaDeNacimiento().getTime()));
			ps.setTime(5,new Time(persona.getHoraNacimiento().getTime()));
			ps.setBigDecimal(6,persona.getCantidadAhorrada());
			ps.setInt(7,persona.getNumeroHijos());
			ps.setString(8,persona.getEstadoCivil().getCodigo());
			ps.setString(9,persona.getCedula());
			
			ps.executeUpdate();
			
		} catch (Exception e) {
			LOGGER.error("Error al insertar datos",e);
			throw new Exception("Error al insertar datos");
		}
	}
	
	public static void eliminar (String cedula) throws Exception {
		Connection con=null;
		PreparedStatement ps;
		LOGGER.trace("Persona a eliminar >>>>"+cedula);
		try {
			con=ConexionBDD.conectar();
			ps=con.prepareStatement("delete from personas where cedula=?");
			ps.setString(1, cedula);
			ps.executeUpdate();
		} catch (Exception e) {
			LOGGER.error("Error al eliminar al propietario de la cedula: "+cedula,e);
			throw new Exception ("Error al eliminar al propietario de la cedula: "+cedula);
		}
	}
}










