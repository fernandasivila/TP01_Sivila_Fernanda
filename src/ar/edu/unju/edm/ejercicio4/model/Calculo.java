package ar.edu.unju.edm.ejercicio4.model;

public class Calculo {
	
	public void determinarParesImpares (int ls, int li, String eleccion) {
		if(li>ls) {
			System.out.println("Limites no validos");
		}
		else {
		for (int i=li; i<=ls;i++) {

			if(eleccion=="PAR") {
				if(i%2==0) {
					System.out.println(i);
				}
			}
			
			if(eleccion=="IMPAR") {
				if(i%2!=0) {
					System.out.println(i);
				}
			}
		}
		
	}
	}

}
