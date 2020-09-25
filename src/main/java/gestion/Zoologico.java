package gestion;

import java.util.*;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private List<Zona> zonas= new ArrayList<Zona>();
	Zoologico(String nom, String ubi, List<Zona> zon){
		nombre = nom;
		ubicacion = ubi;
		zonas = zon;
	}
	Zoologico(){		
	}
	public void agregarZonas(Zona zon) {
		zonas.add(zon);
	}
	public int cantidadTotalAnimales() {
		int cantidad=0;
		for(int i=0; i< zonas.size();i++) {
			Zona decoy= zonas.get(i);
			cantidad += decoy.cantidadAnimales();
		}
		return cantidad;
	}
}
