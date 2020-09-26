package zooAnimales;

import java.util.ArrayList;
import java.util.List;


public class Reptil extends Animal {
	private static List<Reptil> listado= new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	public Reptil(String nom,int ed, String hab, String gen,String col,int lar){
		super(nom,ed,hab,gen);
		colorEscamas = col; largoCola=lar;
		listado.add(this);
	}
	public Reptil() {
		listado.add(this);
	}
	public static int cantidadReptiles() {
		return listado.size();
	}
	public String movimiento() {
		return "reptar";
	}
	public static Reptil crearIguana(String nom, int ed, String gen) {
		iguanas ++;
		return new Reptil(nom, ed, "humedal", gen, "verde", 3);
	}
	public static Reptil crearSerpiente(String nom, int ed, String gen) {
		serpientes ++;
		return new Reptil(nom, ed, "jungla", gen, "blanco", 1);

	}
	public static List<Reptil> getListado() {
		return listado;
	}
	public static void setListado(List<Reptil> listado) {
		Reptil.listado = listado;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
}
