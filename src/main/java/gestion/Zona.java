package gestion;

import java.util.*;

import zooAnimales.*;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private List<Animal> animales= new ArrayList<Animal>();
	public Zona(String nom, Zoologico zo){
		nombre=nom;
		zoo=zo;
	}
	public Zona(){
	}
	public void agregarAnimales(Animal ani) {
		animales.add(ani);
		ani.setZona(this);
	}
	public int cantidadAnimales() {
		return animales.size();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Zoologico getZoo() {
		return zoo;
	}
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	public List<Animal> getAnimales() {
		return animales;
	}
	public void setAnimales(List<Animal> animales) {
		this.animales = animales;
	}
	
}
