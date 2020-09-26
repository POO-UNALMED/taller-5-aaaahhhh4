package gestion;

import java.util.*;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private List<Zona> zona= new ArrayList<Zona>();
	public Zoologico(String nom, String ubi){
		nombre = nom;
		ubicacion = ubi;
	}
	public Zoologico(){		
	}
	public void agregarZonas(Zona zon) {
		zona.add(zon);
	}
	public int cantidadTotalAnimales() {
		int cantidad=0;
		for(int i=0; i< zona.size();i++) {
			Zona decoy= zona.get(i);
			cantidad += decoy.cantidadAnimales();
		}
		return cantidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public List<Zona> getZona() {
		return zona;
	}
	public void setZona(List<Zona> zonas) {
		this.zona = zonas;
	}
}
