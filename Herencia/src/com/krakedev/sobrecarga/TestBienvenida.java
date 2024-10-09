package com.krakedev.sobrecarga;

public class TestBienvenida {

	public static void main(String[] args) {
		Bienvenida b=new Bienvenida();
		//mismo nombre diferentes parametros eso es la sobrecarga
		b.saludar("Josefina");	
		b.saludar("Marco", "Polo");
	}

}
