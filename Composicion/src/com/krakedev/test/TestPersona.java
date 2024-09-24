package com.krakedev.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona persona1=new Persona();
		
		persona1.setNombre("Ruri");
		persona1.setApellido("Cadenas");
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
		persona1.imprimir();
		System.out.println("------------");
		
		Persona persona2=new Persona();
		Direccion d2=new Direccion("Simo bolivar","VENARCASAR","N56");
		persona2.setDireccion(d2);
		persona2.setNombre("Maria");
		persona2.imprimir();
		System.out.println("------------");
		//Forma mas corta de guardar los datos en la clase direccion que la realizada en persona2
		Persona persona3=new Persona();
		persona3.setDireccion(new Direccion("x","y","N12"));
		persona3.imprimir();

	}

}
