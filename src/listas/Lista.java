package listas;

import java.util.ArrayList;

import operaciones.Read;
import productos.Producto;

public class Lista {

	private ArrayList <Producto> listilla = new ArrayList<Producto>();

	public Lista() {
		
		Read read = new Read();
		listilla = read.getDatos1();
	}
	
	@Override
	public String toString() {
		return "Lista [productos=" + listilla + "]";
	}
}
