package com.krakedev.excepciones;

import java.io.File;
import java.io.IOException;

public class Ejercicio2 {
	public void metodo1() {
		
		String a=null;
		a.substring(2);
		//NPE Unchecked
	}
	public void metodo2() {
		File f=new File("archivo1.txt");
		try { //para arreglar el error nosotros mismoss
			f.createNewFile(); //	IOexception  checked
		}catch(IOException io) {
			System.out.println("");
		}		
		
	}
	public void metodo3() throws IOException { //para que alguein mas se encarge del error al ejecutar el metodo
		File f=new File("archivo1.txt");
		f.createNewFile(); //	IOexception  checked
	}
}
