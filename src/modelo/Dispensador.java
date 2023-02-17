package modelo;

import java.util.ArrayList;

public class Dispensador {

	private ArrayList<Producto> productosDisponibles = new ArrayList<Producto>();;
	
	public Dispensador( ArrayList<Producto> productosDisponibles) {
		this.productosDisponibles = productosDisponibles;
	}
	
	public Dispensador() {
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
	    }
	    Producto producto = productosDisponibles.get(posicion);
	    if (producto.getCantidad() > 0) {
	        return true;
	    } else {
	        return false;
	    }
	}
	public void agregarProducto(Producto nuevoProducto) {
        productosDisponibles.add(nuevoProducto);
    }
	
	
	
	public Producto buscarProductoPorPosicion(int posicion) { //Metodo que devuleve la informacion de un producto a partir de su posicion
	    if (posicion >= 0 && posicion < productosDisponibles.size()) {
	        Producto producto = productosDisponibles.get(posicion);
	        int cantidad = producto.getCantidad();
	        
	        if (cantidad > 0) {
	            producto.setCantidad(cantidad - 1);
	            return producto;
	            
	        } else {
	            return null;
	        }
	    } else {
	    	return null;
	    }
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
