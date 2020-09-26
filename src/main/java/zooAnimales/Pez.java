package zooAnimales;
import java.util.*;
public class Pez extends Animal {
	private static List<Pez> listado= new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	public Pez(String nom,int ed, String hab, String gen,String col,int can){
		super(nom,ed,hab,gen);
		colorEscamas = col; cantidadAletas=can;
		listado.add(this);
	}
	public Pez() {
		listado.add(this);
	}
	public static int cantidadPeces() {
		return listado.size();
	}
	public String movimiento() {
		return "nadar";
	}
	public static Pez crearSalmon(String nom, int ed, String gen) {
		salmones ++;
		return new Pez(nom, ed, "oceano", gen, "rojo", 6);
	}
	public static Pez crearBacalao(String nom, int ed, String gen) {
		bacalaos ++;
		return new Pez(nom, ed, "oceano", gen, "gris", 6);
	}
	public static List<Pez> getListado() {
		return listado;
	}
	public static void setListado(List<Pez> listado) {
		Pez.listado = listado;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
}
