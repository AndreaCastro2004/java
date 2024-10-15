package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion2 {

	public static void main(String[] args) {
		Connection  connection=null;
		PreparedStatement ps=null;
		
		try {
			Class.forName("org.postgresql.Driver");//registramos el driver  
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Andrea2004");
			System.out.println("conexion establecida");
			//armamos la sentencia
			ps=connection.prepareStatement("insert into personas (cedula,nombre,apellido,estado_civil_codigo,numero_hijos,cantidad_ahorrada,fecha_nacimiento,hora_nacimiento) "
					+"values(?,?,?,?,?,?,?,?)");//estas incognitas
			ps.setString(1, "1212121121");//las remplazo aqui
			ps.setString(2, "Jamaica");
			ps.setString(3, "Azul");
			ps.setString(4, "U");
			ps.setInt(5, 3);
			ps.setBigDecimal(6, new BigDecimal(1200.45));
			
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaString="2020/09/21 10:05:09";
			
			try {
				Date fecha=sdf.parse(fechaString);
				System.out.println(fecha);
				long fechaMilis=fecha.getTime();
				System.out.println(fechaMilis);
				//CREA UN JAVA.SQL DATE PARTIENDO DE UN JVA.UTIL.DATE
				java.sql.Date fechaSQL=new java.sql.Date(fechaMilis);
				System.out.println(fechaSQL);
				
				Time timeSQL=new Time(fechaMilis);
				System.out.println(timeSQL);
				
				ps.setDate(7, fechaSQL);
				ps.setTime(8, timeSQL);
				
				ps.executeUpdate();
				//ejecutamos la sentencia
				System.out.println("ejecuta insert");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	

}
