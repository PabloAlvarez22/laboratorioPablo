package controllers;

import java.util.Random;

import models.Perro;
import models.Persona;

public class Funciones {
	Persona cuidador;
	Perro perro;
	Random rand = new Random();
	
	public Persona nuevaPersona(String nombre) {
		cuidador = new Persona(nombre);
		return cuidador;
	}
	
	public Perro nuevoPerro(String nombre) {
		perro = new Perro(nombre);
		
		return perro;
	}
	
	public double darGalleta() {
		double animo = ((1/cuidador.getConfiabilidad())*(rand.nextFloat()-0.5)*10)+perro.getEstado();
		if(cuidador.getGalleta()) {
			cuidador.darGalleta();
			animo  += (1/cuidador.getConfiabilidad())*(rand.nextInt(2));
			perro.setEstado(animo);
			System.out.println("GALLETA DISPONIBLE");
		}else {
			System.out.println("GALLETA no DISPONIBLE");
		}
		
	
		
		return perro.getEstado();
	}
	
	public String interactuar() {
		String mensaje = "";
		if(perro.ladrar()) {
			mensaje = "WAO WAO, EL PERRO TE HA LADRADO";
		}else if(perro.morder()) {
			mensaje = "CUIDADO, EL PERRO TE HA MORDIDO";
		}else if(perro.moverCola()) {
			mensaje = "EL PERRO ESTA MOVIENDO LA COLA, FELICIDADES";
		}
		return mensaje;
	}
}
