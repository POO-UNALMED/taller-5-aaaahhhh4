package zooAnimales;
import java.util.*;



public class Mamifero extends Animal {
	private static List<Mamifero> listado= new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	public Mamifero(String nom,int ed, String hab, String gen, boolean pel, int pat){
		super(nom,ed,hab,gen);
		pelaje = pel; patas=pat;
		listado.add(this);
	}
	public Mamifero(){
		listado.add(this);
	}
	public static int cantidadMamiferos() {
		return listado.size();
	}
	public static Mamifero crearCaballo(String nom, int ed, String gen) {
		caballos ++;
		return new Mamifero(nom, ed, "pradera", gen, true, 4);
	}
	public static Mamifero crearLeon(String nom, int ed, String gen) {
		leones ++;
		return new Mamifero(nom, ed, "selva", gen, true,4);
	}
	public static List<Mamifero> getListado() {
		return listado;
	}
	public static void setListado(List<Mamifero> listado) {
		Mamifero.listado = listado;
	}
	public boolean isPelaje() {
		return pelaje;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	
}
