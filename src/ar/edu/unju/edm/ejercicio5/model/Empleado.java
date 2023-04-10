package ar.edu.unju.edm.ejercicio5.model;

import java.util.Date;

public class Empleado {
	private String nombre;
	private Date fechaIngreso;
	private Integer legajo;
	private String email;
	private Float sueldo;
	private Float horasTrabajadas;


 public Empleado() {
	 
 }

public Empleado(String nombre, Date fechaIngreso, Integer legajo, String email, Float horasTrabajadas) {
	super();
	this.nombre = nombre;
	this.fechaIngreso = fechaIngreso;
	this.legajo = legajo;
	this.email = email;
	this.horasTrabajadas = horasTrabajadas;
	this.sueldo = calcularSueldo(this.horasTrabajadas);
}



    public Float calcularSueldo (Float horasTrabajadas) {
    	Float sueldoAPagar=(float) 0.0;
    	Float sueldoPorHoraOrdinario=(float) 4000.0;
    	Float sueldoPorHoraEspecial=(float) 5500.0;
    	Float horasOrdinarias=(float) 160.0;
    	if(horasTrabajadas<=horasOrdinarias) {
    		sueldoAPagar=horasTrabajadas*sueldoPorHoraOrdinario;
    	}
    	else {
    		sueldoAPagar=horasOrdinarias*sueldoPorHoraOrdinario+(horasTrabajadas-horasOrdinarias)*sueldoPorHoraEspecial;
    	}
    	
    	return sueldoAPagar;
    }
    
    public void mostrarEmpleado() {
    	System.out.println("EMPLEADO: ");
    	System.out.println("Nombre: " + this.getNombre());
		System.out.println("Legajo: " + this.getLegajo());
		System.out.println("Fecha de Ingreso: " + this.getFechaIngreso());
		System.out.println("Email: " + this.getEmail());
		System.out.println("Horas Trabajadas: " + this.getHorasTrabajadas());
		System.out.println("Sueldo: " + this.getSueldo());
    }



public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public Date getFechaIngreso() {
	return fechaIngreso;
}

public void setFechaIngreso(Date fechaIngreso) {
	
	this.fechaIngreso = fechaIngreso;
}

public Integer getLegajo() {
	return legajo;
}

public void setLegajo(Integer legajo) {
	this.legajo = legajo;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public Float getSueldo() {
	sueldo = calcularSueldo(this.horasTrabajadas);
	return sueldo;
}

public Float getHorasTrabajadas() {
	return horasTrabajadas;
}

public void setHorasTrabajadas(Float horasTrabajadas) {
	this.horasTrabajadas = horasTrabajadas;
}

}
