package com.krakedev;

/*COMENTARIO PARA VARIAS LINEAS
 * 
 * */
public class TestPersona {

	public static void main(String[] args) {
		Persona p;// 1.-declaro una variable llamada p de tipo persona
		Persona p2 = new Persona();
		p = new Persona();// 2.- instancio un objeto persona y lo referencio con p

		p.nombre = "Maria";
		p.edad = 13;
		p.estatura = 1.2;
		// acceder a los atributos
		System.out.println("nombre:" + p.nombre);
		System.out.println("edad:" + p.edad);
		System.out.println("estatura:" + p.estatura);

		p2.nombre = "Angelica";
		System.out.println("p.nombre:" + p.nombre);
		System.out.println("p2.nombre:" + p2.nombre);
		
		System.out.println("-------------------");
		// modificar los atributos
		p.nombre = "JOSE";
		p.edad = 17;
		p.estatura = 2.6;
		// acceder a los atributos
		System.out.println("nombre:" + p.nombre);
		System.out.println("edad:" + p.edad);
		System.out.println("estatura:" + p.estatura);

	}

}
