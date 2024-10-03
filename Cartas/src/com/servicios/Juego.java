package com.servicios;

import java.util.ArrayList;

import com.entidades.Carta;
import com.entidades.Naipe;

public class Juego {
	private Naipe naipe;
	private ArrayList<ArrayList<Carta>> cartasJugadores;
	private ArrayList<Carta> naipeBarajado;
	
	//metodo constructor
	public Juego(ArrayList<String> idsJugadore) {
		cartasJugadores=new ArrayList<ArrayList<Carta>>();
		naipeBarajado=new ArrayList<Carta>();
		naipe=new Naipe();

		naipeBarajado=naipe.barajar();
		
		for(int i=0;i<idsJugadore.size();i++) {
			ArrayList<Carta> cartaJugador=new ArrayList<Carta>();//
			cartasJugadores.add(cartaJugador);
		}
	}
	
	//metodos
	public void entregarCartas(int cartasPorJugador) {
		Carta naiBarajado;
		ArrayList<Carta> carJugador;
		int repartir=0;
		for(int i=0;i<naipeBarajado.size();i++) {
			repartir++;
			if(repartir <= cartasPorJugador) {
				naiBarajado=naipeBarajado.get(i);
				carJugador=cartasJugadores.get(i);
			}else {
				break;
			}
		}
	}
	//getter and setters
	public Naipe getNaipe() {
		return naipe;
	}

	public void setNaipe(Naipe naipe) {
		this.naipe = naipe;
	}

	public ArrayList<ArrayList<Carta>> getCartasJugadores() {
		return cartasJugadores;
	}
	
	
}
