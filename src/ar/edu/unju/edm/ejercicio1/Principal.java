package ar.edu.unju.edm.ejercicio1;

import ar.edu.unju.edm.ejercicio1.model.Calculo;

public class Principal {

	public static void main(String[] args) {
	
		int anio=2020;
		
		Calculo unCalculo = new Calculo();
		
		System.out.println(unCalculo.determinarAñoBisiesto(anio));

	}

}
