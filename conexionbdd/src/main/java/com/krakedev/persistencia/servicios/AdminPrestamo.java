package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Prestamo;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPrestamo {
private static final Logger LOGGER=LogManager.getLogger(AdminPersonas.class);
	
	public static void inserta(Prestamo prestamo) throws Exception{
		Connection con=null;
		PreparedStatement ps;
		LOGGER.trace("Prestamo a insertar >>>>"+prestamo);
		try{
			//abro la conexion
			 con=ConexionBDD.conectar();
			
			ps=con.prepareStatement("insert into prestamo (cedula,monto,fecha_prestamo,hora_prestamo,garante) "
					+"values(?,?,?,?,?)");//estas incognitas
			ps.setString(1, prestamo.getCedula());//las remplazo aqui
			ps.setBigDecimal(2, prestamo.getMonto());
			ps.setDate(3, new java.sql.Date(prestamo.getFechaPrestamo().getTime()));
			ps.setTime(4, new Time(prestamo.getHoraPrestamo().getTime()));
			ps.setString(5, prestamo.getGarante());
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
	
	
	public static void actualizar(Prestamo prestamo) throws Exception {
		Connection con= null;
		PreparedStatement ps;
		LOGGER.trace("Prestamo a actualizar >>>>"+prestamo);
		try {
			con=ConexionBDD.conectar();
			ps=con.prepareStatement("update prestamo set monto=?,fecha_prestamo=?,hora_prestamo=?,"
					+ "garante=? where cedula=?" );
			ps.setBigDecimal(1, prestamo.getMonto());
			ps.setDate(2, new java.sql.Date(prestamo.getFechaPrestamo().getTime()));
			ps.setTime(3, new Time(prestamo.getHoraPrestamo().getTime()));
			ps.setString(4, prestamo.getGarante());
			ps.setString(5, prestamo.getCedula());
			
			ps.executeUpdate();
			
		} catch (Exception e) {
			LOGGER.error("Error al actualizar datos",e);
			throw new Exception("Error al actualizar datos");
		}
	}
	
	public static void eliminar (String cedula) throws Exception {
		Connection con=null;
		PreparedStatement ps;
		LOGGER.trace("Prestamo a eliminar >>>>"+cedula);
		try {
			con=ConexionBDD.conectar();
			ps=con.prepareStatement("delete from prestamo where cedula=?");
			ps.setString(1, cedula);
			ps.executeUpdate();
		} catch (Exception e) {
			LOGGER.error("Error al eliminar el prestamo al propietario de la cedula: "+cedula,e);
			throw new Exception ("Error al eliminar el prestamo al propietario de la cedula: "+cedula);
		}
	}
}




