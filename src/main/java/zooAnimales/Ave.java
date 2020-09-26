package zooAnimales;

import java.util.ArrayList;
import java.util.List;


public class Ave extends Animal {
		private static List<Ave> listado = new ArrayList<Ave>();
		public static int halcones;
		public static int aguilas;
		private String colorPlumas;
		public Ave(String nom,int ed, String hab, String gen, String col){
			super(nom,ed,hab,gen);
			colorPlumas = col;
			listado.add(this);
		}
		public Ave(){
			listado.add(this);
		}
		public static int cantidadAves() {
			return listado.size();
		}
		public String movimiento() {
			return "volar";
		}
		public static Ave crearHalcon(String nom, int ed, String gen) {
			halcones ++;
			return new Ave(nom, ed, "montañas", gen, "cafe glorioso");
		}
		public static Ave crearAguila(String nom, int ed, String gen) {
			aguilas ++;
			return new Ave(nom, ed, "montanas", gen, "blanco y amarillo");
		}
		public static List<Ave> getListado() {
			return listado;
		}
		public static void setListado(List<Ave> listado) {
			Ave.listado = listado;
		}
		public String getColorPlumas() {
			return colorPlumas;
		}
		public void setColorPlumas(String colorPlumas) {
			this.colorPlumas = colorPlumas;
		}
	
}
