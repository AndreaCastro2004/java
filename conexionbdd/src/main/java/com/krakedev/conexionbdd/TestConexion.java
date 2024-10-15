package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {
		//para la conexion con java
		Connection  connection=null;
		PreparedStatement ps=null;
		
		try {
			Class.forName("org.postgresql.Driver");//registramos el driver  
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Andrea2004");
			System.out.println("conexion establecida");
			//armamos la sentencia
			ps=connection.prepareStatement("insert into  prestamo (cedula,monto,fecha_prestamo,hora_prestamo,garante) "
					+"values(?,?,?,?,?)");//estas incognitas
			ps.setString(1, "1234767800");//las remplazo aqui
			ps.setBigDecimal(2, new BigDecimal(156.78));
			ps.setString(5, "Martina");
			
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaString="2023/09/21 13:00:09";
			
			try {
				Date fecha=sdf.parse(fechaString);
				long fechaMilis=fecha.getTime();
				//CREA UN JAVA.SQL DATE PARTIENDO DE UN JVA.UTIL.DATE
				java.sql.Date fechaSQL=new java.sql.Date(fechaMilis);
				
				Time timeSQL=new Time(fechaMilis);
				
				ps.setDate(3, fechaSQL);
				System.out.println(fechaSQL);
				ps.setTime(4, timeSQL);
				System.out.println(timeSQL);
			
				//ejecutamos la sentencia
				ps.executeUpdate();
				System.out.println("ejecuta insert");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
