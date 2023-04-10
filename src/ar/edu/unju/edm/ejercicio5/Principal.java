package ar.edu.unju.edm.ejercicio5;

import java.util.Date;

import ar.edu.unju.edm.ejercicio5.model.Empleado;

public class Principal {

	public static void main(String[] args) {
		
		Empleado unEmpleado = new Empleado();
		
		unEmpleado.setNombre("Jose Mendez");
		unEmpleado.setFechaIngreso(new Date(100,8,14)); //(año: 1900+num,mes: contando desde 0, dia)
		unEmpleado.setEmail("josemendez@gmail.com");
		unEmpleado.setLegajo(2347364);
		unEmpleado.setHorasTrabajadas((float) 185.0);
		
		Empleado otroEmpleado = new Empleado("Maria Tolaba",null,4382920,null,(float)143.5);
		
		unEmpleado.mostrarEmpleado();
		otroEmpleado.mostrarEmpleado();

	}

}
