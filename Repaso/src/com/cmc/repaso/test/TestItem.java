package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item producto1=new Item();
		Item producto2=new Item();
		//No vendo nada
		producto1.setNombre("Agua");
		producto1.setProductosActuales(20);
		producto1.imprimir();
		//vendo 10
		producto1.vender(10);
		producto1.imprimir();
		//devuelvo 5 
		producto1.devolver(5);
		producto1.imprimir();
		
		//producto 2 no vendo nada
		producto2.setNombre("chicles");
		producto2.setProductosActuales(10);
		producto2.imprimir();
		//vendo 5
		producto2.vender(5);
		producto2.imprimir();
		//no queremos caries y devuelvo 2
		producto2.devolver(2);
		producto2.imprimir();
	}

}
