package productos;

public class ProductoCreator {

	
	public Producto getProducto(String id, String nombre, String cantidad ,String precio) {
		
		Producto devolver = new Producto(id);
		devolver.setNombre(nombre);
		devolver.setCantidad(Integer.parseInt(cantidad));
		devolver.setPrecio(Double.parseDouble(precio));
		
		return devolver;
	
		
		
	}
}
