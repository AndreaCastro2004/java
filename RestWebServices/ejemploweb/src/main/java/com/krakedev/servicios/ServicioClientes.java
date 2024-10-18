package com.krakedev.servicios;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.krakedev.entidades.Cliente;


@Path("customers")//para atar el paht al url
public class ServicioClientes {
	@Path("m1")
	@GET
	public String saludar() {
		return "Hola mundo web rest services";
		
	}
	@Path("mbuscar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Cliente buscar() {
		Cliente cliente=new Cliente("1234567890","Samon");
		return cliente;
	}
	
	@Path("insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Cliente cliente) {
		System.out.println("jsjjs"+cliente);
	}
	
	@Path("actualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizar(Cliente cliente) {
		System.out.println("Actualizando cliente>>>>"+cliente);
	}
}
