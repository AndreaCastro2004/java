package com.servicios;

import java.util.ArrayList;

import com.entidades.Carta;
import com.entidades.Jugadores;
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
		for(int i=0;i<naipeBarajado.size();i++) {
			naiBarajado=naipeBarajado.get(i);
			for(int j=0;j<cartasJugadores.size();j++) {
				if(cartasJugadores.get(j).size()<=cartasPorJugador) {
					cartasJugadores.get(j).add(naiBarajado);
				}
			}
		}	
	}
	public int devolverTotal(int i) {
		int valorCarta = 0;
		ArrayList<Carta> recCarta; 
		recCarta=cartasJugadores.get(i);
		for(int j=0;j<recCarta.size();j++) {
			valorCarta=valorCarta+recCarta.get(i).getNumero().getValor();
		}
		return valorCarta;
		
	}
	public String determinarGanador() {
		String idGanador="1";
		int valorCarta2=0;
		int valorCarta = 0;
		int sumaGanador=valorCarta;
		valorCarta=devolverTotal(0);
		
		for(int i=0;i<cartasJugadores.size();i++) {
			valorCarta2=devolverTotal(i);
			if(valorCarta2>=sumaGanador) {
				//Integer me permite convertir un int a una cadena de texto
				idGanador=Integer.toString(i+1);
			}
			sumaGanador=valorCarta2;
			
		}
		return idGanador;
		
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
