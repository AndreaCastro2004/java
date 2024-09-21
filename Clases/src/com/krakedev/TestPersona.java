package com.krakedev;

/*COMENTARIO PARA VARIAS LINEAS
 * 
 * */
public class TestPersona {

	public static void main(String[] args) {
		Persona p;// 1.-declaro una variable llamada p de tipo persona
		Persona p2 = new Persona();
		p = new Persona();// 2.- instancio un objeto persona y lo referencio con p

		p.setNombre("Maria");
		p.setEdad(13);
		p.setEstatura(1.2);
		// acceder a los atributos
		System.out.println("nombre:" + p.getNombre());
		System.out.println("edad:" + p.getEdad());
		System.out.println("estatura:" + p.getEstatura());

		p2.setNombre("Angelica");
		
		System.out.println("p.nombre:" + p.getNombre());
		System.out.println("p2.nombre:" + p2.getNombre());
		
		System.out.println("-------------------");
		// modificar los atributos
		p.setNombre("JOSE");
		p.setEdad(17);
		p.setEstatura(2.6);
		// acceder a los atributos
		System.out.println("nombre:" + p.getNombre());
		System.out.println("edad:" + p.getEdad());
		System.out.println("estatura:" + p.getEstatura());

	}

}
