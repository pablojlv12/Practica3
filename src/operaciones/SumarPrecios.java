package operaciones;

import java.util.ArrayList;
import java.util.Iterator;

import errores.PrecioErroneoError;
import productos.Producto;

public class SumarPrecios {

	public ArrayList<Producto> sumarArrayList(ArrayList<Producto> p1, ArrayList<Producto> p2) throws Exception {

		p1 = new ArrayList<Producto>();
		p2 = new ArrayList<Producto>();

		Producto productoFinal = new Producto(null);
		
		Iterator<Producto> iterador1 = p1.iterator();
		Iterator<Producto> iterador2 = p2.iterator();

		ArrayList<Producto> listaFinal = new ArrayList<Producto>();

		while (iterador1.hasNext() && iterador2.hasNext()) {
			for (int i = 0; i < p1.size(); i++) {
				for (int j = 0; j < p2.size(); j++) {

					Producto producto1 = p1.get(i);
					Producto producto2 = p2.get(j);

					if ((p1.get(i).getId()) == (p2.get(j).getId())
						 &&(p1.get(i).getPrecio())==(p2.get(j).getPrecio())) {

						listaFinal.add(productoFinal);
						productoFinal.setId(producto1.getId());
						productoFinal.setNombre(producto1.getNombre());
						productoFinal.setCantidad(producto1.getCantidad()+producto2.getCantidad());
						productoFinal.setPrecio(producto1.getPrecio());
					}
					
					else if ((p1.get(i).getId()) == (p2.get(j).getId())
							 &&(p1.get(i).getPrecio())!=(p2.get(j).getPrecio())) {
					
						PrecioErroneoError error = new PrecioErroneoError("Precio erroneo, revísalo"); 
						
						throw error;
 					}
					
				}
			}
		}
		return listaFinal;

	}
}
