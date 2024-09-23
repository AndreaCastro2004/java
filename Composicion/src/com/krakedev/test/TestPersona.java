package com.krakedev.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona persona1=new Persona();
		/*3.-para solucionar el nullPointer vamos a darle valores a d1 que se encuentra en null
		 * para ello a la clase Direccion la instanciamos como objeto*/
		Direccion dir=new Direccion();
		/*4.-Y los valores de los atributos que tiene el objeto Direccion los seteamos*/
		dir.setCallePrincipal("Avenida Rio frio");
		dir.setCalleSecundaria("Imbabura");
		dir.setNumeroCasa("N-46");
		//5.-Ponemos los nuevos valores en persona1 seteando direccion con el objeto dir
		persona1.setDireccion(dir);
		/*1.-para recuperar lo que haya dentro de nuestros atributos cuando son un tipo de dato clase
		 * los guardamos en una variable anteponiendo el tipo de dato que son*/
		String p1=persona1.getNombre();
		Direccion d1=persona1.getDireccion();
		System.out.println(p1);
		/*2.-d1 esta null y trato de invocar a un metodo con esa variable 
		y eso nos causa al ejecutar un nullPointerExectionS*/
		System.out.println(d1.getCallePrincipal());
		                 //null.algunMetodo
	}

}
