package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cliente;
import com.cmc.evaluacion.entidades.Prestamo;

public class Banco {
	private ArrayList<Cliente> clientes;
	
	public Banco() {
		clientes=new ArrayList<Cliente>();
	}
	
	//
	public Cliente buscarCliente(String cedula) {
		Cliente encontrado=null;
		for(int i=0;i<clientes.size();i++) {
			if(clientes.get(i).getCedula()==cedula) {
			encontrado=clientes.get(i);
			return encontrado;
			}
		}
		return encontrado;
	}
	
	public void registrarCliente(Cliente cliente) {
		if(clientes.size()==0) {
			clientes.add(cliente);
		}else {
			for(int i=0;i<clientes.size();i++) {
				if(clientes.get(i).getCedula()!=cliente.getCedula()) {
					clientes.add(cliente);
					break;
				}else {
					System.out.println("Cliente ya existe:"+clientes.get(i).getCedula());
				}
			}
			
		}
		
	}
	
	public void asignarPrestamo(String cedula,Prestamo prestamo) {
		Cliente buscando;
		buscando=buscarCliente(cedula);
		if(buscando==null) {
			System.out.println("No es cliente de este banco");
		}else {
			buscando.getPrestamo().add(prestamo);	
		}
	}
	public ArrayList<Prestamo> buscarPrestamos(String cedula) {
		ArrayList<Prestamo> prestamoCliente=null;
		for(int i=0;i<clientes.size();i++) {
			if(clientes.get(i).getCedula()==cedula) {
				if(clientes.get(i).getPrestamo()!=null) {
					prestamoCliente=clientes.get(i).getPrestamo();
					return prestamoCliente;
				}
			}
			
		}
		return prestamoCliente;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	
	//

	
	
	
	
	
	
}
