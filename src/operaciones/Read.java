	package operaciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import productos.Producto;
import productos.ProductoCreator;


public class Read {

	
	private static String FICHERO1 = "C:\\CLASE\\Programacion\\3_Evaluacion\\ST1.txt";
	private static String FICHERO2 = "C:\\CLASE\\Programacion\\3_Evaluacion\\ST2.txt";
	
	/**
	 * Lee una línea de un fichero de texto y los saca por pantalla
	 * y esto lo hace hasta que no queden líneas por leer
	 * @return 
	 */
	public ArrayList<Producto> getDatos1() {
			
		// creo una variable que permite conectar con un fichero para poder leer sus líneas
		BufferedReader ficheroEntrada;
        ArrayList<Producto> lista = new ArrayList<Producto>();
        try {
        	// BufferedReader enlaza con un fichero; para ello en java hay que crear un FileReader
            ficheroEntrada = new BufferedReader(new FileReader(FICHERO1));
 
            // leo la primera linea del fichero, el id         
            String id =ficheroEntrada.readLine();
            
            // mientras que las lineas existan y no leamos null
            while(id!=null){
            	  	
            	//LEO LA SEGUNDA LINEA Y ESTABLEZCO EL NOMBRE
            	String nombre=ficheroEntrada.readLine();
          
            	//LEO LA TERCERA LINEA Y ESTABLEZCO LA CANTIDAD
            	String cantidad=ficheroEntrada.readLine();

            	//LEO LA CUARTA LINEA Y ESTABLEZCO EL PRECIO
            	String precio = ficheroEntrada.readLine();
            	
            	ProductoCreator pc = new ProductoCreator();
            	Producto producto = pc.getProducto(id, nombre, cantidad, precio);
            	if(producto!=null) {
            		lista.add(producto);
            	}
                //VUELVO A LEER UNA POSIBLE PRIMERA LINEA

	            	nombre=ficheroEntrada.readLine();
            }           
            ficheroEntrada.close();
        }
        catch (IOException e) {
            System.out.println("Problemas: " +e.getMessage() );
        } 
        catch (Exception e) {
			// Otro fallos
			e.printStackTrace();
		}
        return lista;
	}
	/**
	 * Lee una línea de un fichero de texto y los saca por pantalla
	 * y esto lo hace hasta que no queden líneas por leer
	 * @return 
	 */
	public ArrayList<Producto> getDatos2() {
			
		// creo una variable que permite conectar con un fichero para poder leer sus líneas
		BufferedReader ficheroEntrada;
        ArrayList<Producto> lista = new ArrayList<Producto>();
        try {
        	// BufferedReader enlaza con un fichero; para ello en java hay que crear un FileReader
            ficheroEntrada = new BufferedReader(new FileReader(FICHERO2));
 
            // leo la primera linea del fichero, el id         
            String id =ficheroEntrada.readLine();
            
            // mientras que las lineas existan y no leamos null
            while(id!=null){
            	  	
            	//LEO LA SEGUNDA LINEA Y ESTABLEZCO EL NOMBRE
            	String nombre=ficheroEntrada.readLine();
          
            	//LEO LA TERCERA LINEA Y ESTABLEZCO LA CANTIDAD
            	String cantidad=ficheroEntrada.readLine();

            	//LEO LA CUARTA LINEA Y ESTABLEZCO EL PRECIO
            	String precio = ficheroEntrada.readLine();
            	
            	ProductoCreator pc = new ProductoCreator();
            	Producto producto = pc.getProducto(id, nombre, cantidad, precio);
            	if(producto!=null) {
            		lista.add(producto);
            	}
                //VUELVO A LEER UNA POSIBLE PRIMERA LINEA

	            	nombre=ficheroEntrada.readLine();
            }           
            ficheroEntrada.close();
        }
        catch (IOException e) {
            System.out.println("Problemas: " +e.getMessage() );
        } 
        catch (Exception e) {
			// Otro fallos
			e.printStackTrace();
		}
        return lista;
	}

	
	
}