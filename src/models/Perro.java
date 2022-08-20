package models;
import java.util.Random;

public class Perro {
	private double estado;
	private int umbral;
	private String nombre;
	
	private int minEstado = -5;
	private int maxEstado = 5;
	
	private int minUmbral = -20;
	private int maxUmbral = 0;
	
	private Random rand;
	
	public Perro(String nombre) {
		super();
		rand = new Random();
		this.estado = rand.nextInt((maxEstado-minEstado))+minEstado;
		this.umbral = rand.nextInt(maxUmbral-minUmbral)+minUmbral;
		this.nombre = nombre;
	}
	
	
	public double getEstado() {
		return estado;
	}
	public void setEstado(double estado) {
		this.estado = estado;
	}
	public int getUmbral() {
		return umbral;
	}
	public void setUmbral(int umbral) {
		this.umbral = umbral;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public boolean morder() {
		
		if(estado<umbral) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean ladrar() {
		if(estado<0 && umbral<estado) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public boolean moverCola() {
		if(estado>0) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
