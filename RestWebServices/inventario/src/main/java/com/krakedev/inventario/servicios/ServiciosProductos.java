package com.krakedev.inventario.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.krakedev.inventario.entidades.Categoria;
import com.krakedev.inventario.entidades.Producto;

@Path("productos")
public class ServiciosProductos {
	@Path("insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Producto producto) {
		System.out.println("Producto>>>"+producto);
	}
	@Path("actualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizar(Producto producto) {
		System.out.println("Producto Actualizado>>>"+producto);
	}
	@Path("consultar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Producto> recuperarTodos() {
		ArrayList<Producto> productosArray=new ArrayList<Producto>();
		Categoria categoria=new Categoria(123,"QKW");
		Producto producto=new Producto("123","yogurt",categoria,1.23,4);
		
		Categoria categoria2=new Categoria(1233,"AAA");
		Producto producto2=new Producto("1233","carne",categoria2,2.45,4);
		Producto producto3=new Producto("1233","calabaza",categoria2,2.45,4);
		
		productosArray.add(producto);
		productosArray.add(producto2);
		productosArray.add(producto3);
		return productosArray;
		
	}
			

}
