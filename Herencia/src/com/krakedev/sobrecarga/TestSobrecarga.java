package com.krakedev.sobrecarga;

import com.krakedev.herencia.Gato;

public class TestSobrecarga {
	public static void main(String[] args) {
		Gato g=new Gato();
		g.maullar();
		g.maullar("MIAUUUU");
	}

}
