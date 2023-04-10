package ar.edu.unju.edm.ejercicio4;

import ar.edu.unju.edm.ejercicio4.model.Calculo;

public class Principal {

	public static void main(String[] args) {
		
		Calculo unCalculo = new Calculo();
		
		int li=4,ls=12;
		
		String eleccion="IMPAR";
		
		unCalculo.determinarParesImpares(ls, li, eleccion);

	}

}
