package gestion;

import java.util.*;

import zooAnimales.*;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private List<Animal> animales= new ArrayList<Animal>();
	Zona(String nom, Zoologico zo, List<Animal> ani){
		nombre=nom;
		zoo=zo;
		animales=ani;
	}
	Zona(){
	}
	public void agregarAnimales(Animal ani) {
		animales.add(ani);
	}
	public int cantidadAnimales() {
		return animales.size();
	}
}
