package ar.edu.unju.edm.ejercicio3.model;

public class Calculo {
	
	public void determinarPrimos (int num) {
		for(int i=1;i<=num;i++) {
			if(esPrimo(i)) {
				System.out.println(i);
			}
		}
	}
	
	public boolean esPrimo (int num) {
		boolean esPrimo=true;
		if (num==1) {
			esPrimo=false;
		}
		for(int i=2;i<=num/2 && esPrimo==true;i++){
			if(num%i==0) {
				esPrimo=false;
			}
		}
		
		return esPrimo;
	}

}
