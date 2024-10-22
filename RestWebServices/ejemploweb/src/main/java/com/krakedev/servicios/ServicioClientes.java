package com.krakedev.servicios;


import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.krakedev.entidades.Cliente;
import com.krakedev.excepciones.KrakeDevException;
import com.krakedev.persistencia.ClientesBDD;


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
		Cliente cliente=new Cliente("1234567890","Samon",2);
		return cliente;
	}
	
	@Path("insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertar(Cliente cliente) {
		System.out.println(">>>>>"+cliente);
		ClientesBDD cli=new ClientesBDD();
		try {
			cli.insertar(cliente);
			return Response.ok().build();
		} catch (KrakeDevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	
	@Path("actualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response actualizar(Cliente cliente) {
		System.out.println("Actualizando cliente>>>>"+cliente);
		ClientesBDD cli=new ClientesBDD();
		try {
			cli.actualizar(cliente);
			return Response.ok().build();
		} catch (KrakeDevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	@Path("all")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response obtenerClientes() {
		ClientesBDD cli=new ClientesBDD();
		ArrayList<Cliente> clientes=null;
		try {
			clientes = cli.recuperarTodos();
			return Response.ok(clientes).build();//como toda va bien y mandamos el objeto
		} catch (KrakeDevException e) {
		
			e.printStackTrace();
			return Response.serverError().build();//ENCASO DE ERROR para controlar la excepcion y no tragarmela y que al usuario no le salga que esta bien cuando esta mal
		}
		
	}
	
	@Path("buscarPorCedula/{cedulaParam}") //parametro path param ({cedulaParam})
	@GET//1.-cuando tenemos get y queremos enviar informacion lo ponemos en el path param alado del nombre del metodo y lo que reciba es lo que va a buscar nuestro metodo rest web servid
	@Produces(MediaType.APPLICATION_JSON)
	
	public Response buscarPorCedula(@PathParam("cedulaParam") String cedula) { //para recuperar ponemos el @path param 
		ClientesBDD cli=new ClientesBDD();
		Cliente clientes=null;
		try {
			clientes = cli.buscarPorPK(cedula);
			return Response.ok(clientes).build();//como toda va bien y mandamos el objeto
		} catch (KrakeDevException e) {
		
			e.printStackTrace();
			return Response.serverError().build();//ENCASO DE ERROR para controlar la excepcion y no tragarmela y que al usuario no le salga que esta bien cuando esta mal
		}
		
	}
	@Path("buscarPorNumeroHijos/{numHijosParam}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarPorNumeroHijos(@PathParam("numHijosParam") int numeroHijos) {
		ClientesBDD cli=new ClientesBDD();
		ArrayList<Cliente> clientes=null;
		try {
			clientes = cli.buscarPorNumeroHijos(numeroHijos);
			return Response.ok(clientes).build();
		} catch (KrakeDevException e) {
		
			e.printStackTrace();
			return Response.serverError().build();
		}
		
	}
}
