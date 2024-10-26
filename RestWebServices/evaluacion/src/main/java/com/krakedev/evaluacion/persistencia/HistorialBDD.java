package com.krakedev.evaluacion.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import com.krakedev.evaluacion.entidades.Categoria;
import com.krakedev.evaluacion.excepciones.KrakeException;
import com.krakedev.evaluacion.utils.ConexionBDD;


public class HistorialBDD {
	public void insertar(Categoria categoria) throws KrakeException {
		Connection con =null;
		PreparedStatement ps=null;//nos ayuda a poner el insert o update en el SQL(la base de datos)
		try {
			con=ConexionBDD.obtenerConexion();
			ps=con.prepareStatement("insert into categorias (id,nombre)"+"values(?,?)");
			ps.setString(1, categoria.getId());
			ps.setString(2, categoria.getNombre());
			
			ps.executeUpdate();
		} catch (KrakeException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeException ("No logro insertar"+e.getMessage());
		}finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
	
	public void actualizar (Categoria categoria) throws KrakeException {
		Connection con =null;
		PreparedStatement ps=null;//nos ayuda a poner el insert o update en el SQL(la base de datos)
		try {
			con=ConexionBDD.obtenerConexion();
			ps=con.prepareStatement("update categorias set nombre=? where id=?");
			ps.setString(1, categoria.getNombre());
			ps.setString(2, categoria.getId());
			
			ps.executeUpdate();
		} catch (KrakeException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeException ("No logro Actualizar"+e.getMessage());
		}finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
	
	public Categoria buscarPorId (String buscarId) throws KrakeException {
		Connection con =null;
		PreparedStatement ps=null;//nos ayuda a poner el insert o update en el SQL(la base de datos)
		Categoria categoria=null;
		ResultSet rs=null;
		try {
			con=ConexionBDD.obtenerConexion();
			ps=con.prepareStatement("select nombre,id from categorias where id=?");
			ps.setString(1,buscarId);
			
			rs=ps.executeQuery();
			
			if(rs.next()) {
				System.out.println("Buscando Id");
				String nombre1=rs.getString("nombre");
				String id1=rs.getString("id");
				
				categoria= new Categoria(id1,nombre1);
			}else {
				System.out.println("No se encontro ningun id");
			}
		} catch (KrakeException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeException ("No logro Encontrarlo"+e.getMessage());
		}finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
		return categoria;
	}
	public ArrayList<Categoria>recuperarTodos() throws KrakeException{
		ArrayList<Categoria> categorias=new ArrayList<Categoria>();
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Categoria categoria =null;
		try {
			con=ConexionBDD.obtenerConexion();
			ps=con.prepareStatement("select nombre,id from categorias");
			rs=ps.executeQuery();
			
			while(rs.next()) {
				String nombre=rs.getString("nombre");
				String id=rs.getString("id");
				categoria = new Categoria(nombre,id);
				categorias.add(categoria);
			}
		} catch (KrakeException  e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeException("ERROR AL CONSULTAR. DETALLE: "+e.getMessage());
		}
		return categorias;
		
	}
}
