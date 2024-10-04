package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cliente;
import com.cmc.evaluacion.entidades.Prestamo;

public class Banco {
	private ArrayList<Prestamo> prestamos;
	private ArrayList<Cliente> clientes;
	
	public Banco() {
		prestamos=new ArrayList<Prestamo>();
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
	
	//
	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	
	
	
	
	
}
