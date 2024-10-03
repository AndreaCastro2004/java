package com.entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;
	
	//metodo constructor
	public Naipe() {
		numerosPosibles=new ArrayList<Numero>();
		cartas=new ArrayList<Carta>();
		Numero numeroNaipe1 =new Numero("A",11);
		Numero numeroNaipe2 =new Numero("2",2);
		Numero numeroNaipe3 =new Numero("3",3);
		Numero numeroNaipe4 =new Numero("4",4);
		Numero numeroNaipe5 =new Numero("5",5);
		Numero numeroNaipe6 =new Numero("6",6);
		Numero numeroNaipe7 =new Numero("7",7);
		Numero numeroNaipe8 =new Numero("8",8);
		Numero numeroNaipe9 =new Numero("9",9);
		Numero numeroNaipe10 =new Numero("10",10);
		Numero numeroNaipe11 =new Numero("J",10);
		Numero numeroNaipe12 =new Numero("Q",10);
		Numero numeroNaipe13 =new Numero("K",10);
		numerosPosibles.add(numeroNaipe1);
		numerosPosibles.add(numeroNaipe2);
		numerosPosibles.add(numeroNaipe3);
		numerosPosibles.add(numeroNaipe4);
		numerosPosibles.add(numeroNaipe5);
		numerosPosibles.add(numeroNaipe6);
		numerosPosibles.add(numeroNaipe7);
		numerosPosibles.add(numeroNaipe8);
		numerosPosibles.add(numeroNaipe9);
		numerosPosibles.add(numeroNaipe10);
		numerosPosibles.add(numeroNaipe11);
		numerosPosibles.add(numeroNaipe12);
		numerosPosibles.add(numeroNaipe13);
		Palos palo=new Palos();
		for(int i=0;i<numerosPosibles.size();i++) {
			Numero numeEncontrados=numerosPosibles.get(i);
			Carta numeroCarta=new Carta(numeEncontrados, palo.getCorazonRojo());
			Carta numeroCarta2=new Carta(numeEncontrados, palo.getCorazonNegro());
			Carta numeroCarta3=new Carta(numeEncontrados, palo.getDiamante());
			Carta numeroCarta4=new Carta(numeEncontrados, palo.getTrebol());
			cartas.add(numeroCarta);
			cartas.add(numeroCarta2);
			cartas.add(numeroCarta3);
			cartas.add(numeroCarta4);
		}
	}
	
	//metodos
	public ArrayList<Carta> barajar(){
		ArrayList<Carta> auxiliar=new ArrayList<Carta>();
		int numero=100;
		int numAleatorio;
		Carta carRecuperada;
		Carta revCarRecuperada;
		for(int i=0;i<numero;i++) {
			numAleatorio=Random.obtenerPosicion();
			carRecuperada=cartas.get(numAleatorio);
			if(carRecuperada.getEstado()=="N") {
				carRecuperada.setEstado("C");
				auxiliar.add(carRecuperada);
				
			}	
		}
		for(int i=0;i<cartas.size();i++) {
			revCarRecuperada=cartas.get(i);
			if(revCarRecuperada.getEstado()=="N") {
				revCarRecuperada.setEstado("C");
				auxiliar.add(revCarRecuperada);		
			}	
		}
		
		return auxiliar;
		
	}
	//getters
	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	
	
}
