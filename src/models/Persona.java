package models;

import java.util.Random;

public class Persona {
	private int confiabilidad;
	private boolean galleta;
	private String nombre;
	Random rand = new Random();
	
	
	public Persona(String nombre) {
		super();
		this.confiabilidad = 1+rand.nextInt(10);
		
		if(rand.nextBoolean()) {
			this.galleta = true;
		}else {
			this.galleta = false;
		}
		
		this.nombre = nombre;
	}

	public int getConfiabilidad() {
		return confiabilidad;
	}
	
	public void setConfiabilidad(int confiabilidad) {
		this.confiabilidad = confiabilidad;
	}
	
	public boolean getGalleta() {
		return galleta;
	}
	
	public void setGalleta(boolean galleta) {
		this.galleta = galleta;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public boolean darGalleta() {
		if(galleta) {
			galleta= false;
			return true;
		}else {
			return false;
		}
	}
}
