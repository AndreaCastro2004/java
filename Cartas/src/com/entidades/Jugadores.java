package com.entidades;

import java.util.ArrayList;

import com.servicios.Juego;

public class Jugadores {
	private ArrayList<String> jugadores;

	//metodoConstructor
	public Jugadores() {
		jugadores=new ArrayList<String>();
		
	}
	//metodo
	public void jugarPrimero() {
		ArrayList<String> jugadores = null;//este va a agregar 3 jugadores;
		int totaJuga=0;
		Juego ganador = null;
		Juego idJugadores=new Juego(jugadores);
		idJugadores.entregarCartas(5);
		for(int i=0;i<jugadores.size();i++) {
			totaJuga++;
			System.out.println(i);
		}
		System.out.println(totaJuga);
		ganador.determinarGanador();

	}
	
	//getters and setters
	public ArrayList<String> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<String> jugadores) {
		this.jugadores = jugadores;
	}
	
	
}
