package com.krakedev.evaluacion.servicios;

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

import com.krakedev.evaluacion.entidades.Categoria;
import com.krakedev.evaluacion.excepciones.KrakeException;
import com.krakedev.evaluacion.persistencia.HistorialBDD;

@Path("funciones")
public class ServiciosCategoria {
	@Path("probarInsertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertar(Categoria categoria) {
		HistorialBDD his= new HistorialBDD();
		try {
			his.insertar(categoria);
			return Response.ok().build();
		} catch (KrakeException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
		
	}
	
	@Path("probarActualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response actualizar(Categoria categoria) {
		HistorialBDD his= new HistorialBDD();
		try {
			his.actualizar(categoria);
			return Response.ok().build();
		} catch (KrakeException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
		
	}
	
	@Path("probarBuscar/{paramId}")//parametro path param ({cedulaParam})
	@GET//1.-cuando tenemos get y queremos enviar informacion lo ponemos en el path param alado del nombre del metodo y lo que reciba es lo que va a buscar nuestro metodo rest web servid
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarPorId(@PathParam("paramId") String id) {//para recuperar ponemos el @path param 
		HistorialBDD his= new HistorialBDD();
		Categoria categoria=null;
		try {
			categoria=his.buscarPorId(id);
			return Response.ok(categoria).build();//como toda va bien y mandamos el objeto
		} catch (KrakeException e) {
			e.printStackTrace();
			return Response.serverError().build();//ENCASO DE ERROR para controlar la excepcion y no tragarmela y que al usuario no le salga que esta bien cuando esta mal
		}
		
	}
	@Path("probarRecuperar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response probarRecuperar() {
		HistorialBDD his= new HistorialBDD();
		ArrayList<Categoria>categoria=null;
		try {
			categoria=his.recuperarTodos();
			return Response.ok(categoria).build();
		} catch (KrakeException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
		
	}
	
}
