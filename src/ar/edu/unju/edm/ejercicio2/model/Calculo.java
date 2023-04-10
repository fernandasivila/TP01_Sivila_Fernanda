package ar.edu.unju.edm.ejercicio2.model;

public class Calculo {
	
	public String determinarMes (int mes){
		String aux;
		
		switch(mes) {
		case 1: aux="January";
		break;
		case 2: aux="Febreary";
		break;
		case 3: aux="March";
		break;
		case 4: aux="April";
		break;
		case 5: aux="May";
		break;
		case 6: aux="June";
		break;
		case 7: aux="July";
		break;
		case 8: aux="August";
		break;
		case 9: aux="September";
		break;
		case 10: aux="October";
		break;
		case 11: aux="November";
		break;
		case 12: aux="December";
		break;
		default: aux="No existe ese mes";
		}
		
		return aux;
	}

}
