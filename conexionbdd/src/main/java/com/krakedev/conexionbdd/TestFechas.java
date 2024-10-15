package com.krakedev.conexionbdd;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFechas {
	public static void main(String[] args) {
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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
