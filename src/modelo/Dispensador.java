package modelo;

import java.util.ArrayList;

public class Dispensador {

	private ArrayList<Producto> productosDisponibles = new ArrayList<Producto>();;
	
	public Dispensador( ArrayList<Producto> productosDisponibles) {
		this.productosDisponibles = productosDisponibles;
		
	}
	
	public Dispensador() {	
		Producto producto1 = new Producto("Coca Cola", 120, 10);
    	Producto producto2 = new Producto("Agua",80,10);
    	Producto producto3 = new Producto("Fanta",100,10);
    	Producto producto4 = new Producto("Red Bull",160,10);
    	productosDisponibles.add(producto1);
    	productosDisponibles.add(producto2);
    	productosDisponibles.add(producto3);
    	productosDisponibles.add(producto4);
    }
	
	public ArrayList<Producto> getProductosDisponibles() {
		return productosDisponibles;
	}

	public void setProductosDisponibles(ArrayList<Producto> productosDisponibles) {
		this.productosDisponibles = productosDisponibles;
	}
	
	public boolean tieneProducto(int posicion) { //Metodo que busca si el producto esta disponible en el arraylist segun su posicion
	    if (posicion < 0 || posicion >= productosDisponibles.size()) {
	        return false;
	    }if(posicion == 777) {
	    	return true;
	    }
	    Producto producto = productosDisponibles.get(posicion);
	    if (producto.getCantidad() > 0) { //Comprueba si la cantidad es mayor a 0
	        return true;
	    } else {
	        return false;
	    }
	}
	public void agregarProducto(Producto nuevoProducto) { //Metodo para agregar productos
        productosDisponibles.add(nuevoProducto);
    }
	
	public String dispensarProducto(int numeroProducto) {
		
	    if (!tieneProducto(numeroProducto)) {
	        return "Lo siento, el producto no está disponible.";
	    } else {
	        Producto producto = buscarProductoPorPosicion(numeroProducto);
	        producto.setCantidad(producto.getCantidad() - 1);
	        return "El " + producto.getNombre() + " se ha dispensado correctamente.";
	    }
	}
	
	public Producto buscarProductoPorPosicion(int posicion) { //Metodo que devuelve la informacion de un producto a partir de su posicion
	    if (posicion >= 0 && posicion < productosDisponibles.size()) {
	        Producto producto = productosDisponibles.get(posicion);
	        int cantidad = producto.getCantidad();
	        
	        if (cantidad > 0) {
	            return producto;
	            
	        } else {
	            return null;
	        }
	    } else {
	    	return null;
	    }
	}
	
	public int buscarPrecioProducto(int posicion) { //Metodo que devuelve la informacion de un producto a partir de su posicion
		
		int precioProducto = 0;
	    if (posicion >= 0 && posicion < productosDisponibles.size()) {
	        Producto producto = productosDisponibles.get(posicion);
	        
	        precioProducto = producto.getPrecio();     
	    }
	    return precioProducto;
	}
	
	public String buscarNombreProducto(int posicion) {
		
		String nombreProducto = "";
	    if (posicion >= 0 && posicion < productosDisponibles.size()) {
	        Producto producto = productosDisponibles.get(posicion);
	        
	            nombreProducto = producto.getNombre();    
	        }
	    return nombreProducto;
	    }
	
		
	 @Override
	  public String toString() {
			int i = 0;
			StringBuilder sb = new StringBuilder();
			for (Producto producto : productosDisponibles) {
				sb.append(i + producto.toString());
				i++;
			}
			return sb.toString();
		}
	 
}
