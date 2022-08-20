package UI;

import java.util.Scanner;

import controllers.Funciones;
import models.Perro;
import models.Persona;

public class DriverProgram {
	
	static Scanner entrada = new Scanner(System.in);
	static Funciones funciones = new Funciones();
	static int opcion=0;
	static Persona persona;
	static Perro perro;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BIENVENIDO");
	while(opcion!=5) {
		System.out.println("ELIGE UNA OPCIÓN");
		System.out.println("1. NUEVA PERSONA");
		System.out.println("2. NUEVO PERRO");
		System.out.println("3. SACAR GALLETA");
		System.out.println("4. INTERACTUAR");
		System.out.println("5. SALIR");
		opcion = entrada.nextInt();
		
		switch(opcion) {
			case 1:
				System.out.println("INGRESA EL NOMBRE DE LA PERSONA ");
				String nombre = entrada.next();
				persona = funciones.nuevaPersona(nombre);
				System.out.println("EL NOMBRE ES: "+ persona.getNombre());
				System.out.println("LA CONFIABILIDAD ES: "+ persona.getConfiabilidad());
				System.out.println("GALLETA: "+ persona.getGalleta());
				break;
			case 2:
				System.out.println("INGRESA EL NOMBRE DEL PERRO ");
				String nombrePerro = entrada.next();
				perro = funciones.nuevoPerro(nombrePerro);
				System.out.println("LA nombre ES: "+ perro.getNombre());
				System.out.println("EL ESTADO DE ANIMO ES: "+ perro.getEstado());				
				System.out.println("EL UMBRAL ES: "+ perro.getUmbral());
				break;
			
			case 3:
				double animo = funciones.darGalleta();
				
				System.out.println("EL NUEVO ANIMO DEL PERRO ES "+animo);
				
				
				
				break;
			
			case 4:
				
				String mensaje = funciones.interactuar();
				System.out.println(mensaje);
				break;
			case 5:
				System.out.println("SALIDA DEL PROGRAMA");
				break;
		}
	}
		
		
	}
	
	
	
}
