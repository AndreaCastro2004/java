package com.krakedev.moduloii.evaluacionfinal.utils;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.krakedev.moduloii.evaluacionfinal.entidades.Articulo;
import com.krakedev.moduloii.evaluacionfinal.entidades.Grupo;
import com.krakedev.moduloii.evaluacionfinal.excepciones.InventarioException;

public class ConexionBDD {

	public static void insertar(Articulo art) throws InventarioException {

		Grupo gr1 = new Grupo("G001", "Aseo Personal");
		Grupo gr2 = new Grupo("G002", "Tecnologia");
		Grupo gr3 = new Grupo("G003", "Ropa");

		Connection connection = null;
		PreparedStatement ps = null;

		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/INVENTARIOS_KRAKEDEV",
					"postgres","postgres");
			System.out.println("conexion exitosa");

			ps = connection.prepareStatement(
					"insert into articulos(id,nombre,precio_venta,precio_compra,id_grupo)" + "values(?,?,?,?,?)");
			ps.setString(1, art.getId());
			ps.setString(2, art.getNombre());
			ps.setBigDecimal(3, art.getPrecio_venta());
			ps.setBigDecimal(4, art.getPrecio_compra());

			if (gr1.getId() == art.getId_grupo().getId()) {
				ps.setString(5, gr1.getId());
			} else if (gr2.getId() == art.getId_grupo().getId()) {
				ps.setString(5, gr2.getId());
			} else {
				ps.setString(5, gr3.getId());
			}

			ps.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}



	public static void actualizar(Articulo art) throws InventarioException {

		Connection connection = null;
		PreparedStatement ps = null;

		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/INVENTARIOS_KRAKEDEV",
					"postgres","postgres");
			System.out.println("conexion exitosa");

			ps = connection.prepareStatement(
					"update articulos set nombre=?,precio_venta=?,precio_compra=?,id_grupo=?" + " where id = ?");
			ps.setString(5, art.getId());
			ps.setString(1, art.getNombre());
			ps.setBigDecimal(2, art.getPrecio_venta());
			ps.setBigDecimal(3, art.getPrecio_compra());
			ps.setString(4, art.getId_grupo().getId());

			ps.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Articulo buscarPorId(String id) throws InventarioException {
		
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		Articulo art = null;
		
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/INVENTARIOS_KRAKEDEV",
					"postgres","postgres");
			System.out.println("conexion exitosa");

			ps = connection.prepareStatement(
					"select * from articulos where id =?");
			
			ps.setString(1, id);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				String nombre = rs.getString("nombre");
				BigDecimal precio_venta = rs.getBigDecimal("precio_venta");
				BigDecimal precio_compra = rs.getBigDecimal("precio_compra");
				String id_grupo = rs.getString("id_grupo");
				Grupo gr1 = new Grupo(id_grupo, "Aseo Personal");
				
				art = new Articulo(id,nombre,precio_venta,precio_compra,gr1);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return art;
	}
	
	public static ArrayList<Articulo> RecuperarTodos() throws InventarioException {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		Articulo art = null;
		ArrayList<Articulo> arts = new ArrayList<Articulo>();

		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/INVENTARIOS_KRAKEDEV",
					"postgres","postgres");
			System.out.println("conexion exitosa");

			ps = connection.prepareStatement(
					"select * from articulos");
			rs= ps.executeQuery();
			
			while (rs.next()) {
				String id = rs.getString("id");
				String nombre = rs.getString("nombre");
				BigDecimal precio_venta = rs.getBigDecimal("precio_venta");
				BigDecimal precio_compra = rs.getBigDecimal("precio_compra");
				String id_grupo = rs.getString("id_grupo");
				
				Grupo gr1 = new Grupo(id_grupo, "Aseo Personal");
				art = new Articulo(id,nombre,precio_venta,precio_compra,gr1);
				arts.add(art);
			}

		} catch (SQLException e) {
			throw new InventarioException("Error al Recuperar. Detalle: "+e.getMessage());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return arts;
	}

	
	
	
}




