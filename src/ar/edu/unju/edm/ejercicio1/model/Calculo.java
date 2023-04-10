package ar.edu.unju.edm.ejercicio1.model;

public class Calculo {
	
	public String determinarAñoBisiesto (int anio) {
		String aux;
		if(((anio%400==0)||(anio%4==0 && anio%100!=0))&&(anio>0)) {
			aux=("Es un año bisiesto");
		}
		else {
			aux=("NO es un año bisiesto");
		}
		return aux;
	}

}
