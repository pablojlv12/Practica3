package listas;

import java.util.ArrayList;

import operaciones.Read;
import productos.Producto;

public class Lista2 {

	private ArrayList<Producto> listilla2 = new ArrayList<Producto>();

	public Lista2() {

		Read read = new Read();
		listilla2 = read.getDatos2();
	}

	@Override
	public String toString() {
		return "Lista [productos=" + listilla2 + "]";
	}
}
