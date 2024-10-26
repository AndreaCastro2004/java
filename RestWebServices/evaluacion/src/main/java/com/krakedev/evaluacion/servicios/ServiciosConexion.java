package com.krakedev.evaluacion.servicios;

import java.sql.Connection;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.krakedev.evaluacion.excepciones.KrakeException;
import com.krakedev.evaluacion.utils.ConexionBDD;

@Path("bases")
public class ServiciosConexion {
	@Path("probarConexion")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	//el response nos ayuda a devolver el error al usuario para que no paresca que todo salio bien cuando no es asi 
	public Response probarConn() {
		Connection con=null;
		try {
			con=ConexionBDD.obtenerConexion();
			return Response.ok().build();//para devolver un 200 osea exito
		} catch (KrakeException e) {
			e.printStackTrace();
			return Response.serverError().build();//devolvemos un error 500
		}

	}
}
