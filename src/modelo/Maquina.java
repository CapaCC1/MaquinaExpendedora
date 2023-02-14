package modelo;

import java.util.ArrayList;


public class Maquina {
	
	private ArrayList<Producto> productosDisponibles = new ArrayList<Producto>();
	
	public Maquina(ArrayList<Producto> productosDisponibles) {
		this.productosDisponibles = productosDisponibles;
	}
	
	public Maquina() {
		
	}
	public ArrayList<Producto> getProductosDisponibles() {
		return productosDisponibles;
	}

	public void setProductosDisponibles(ArrayList<Producto> productosDisponibles) {
		this.productosDisponibles = productosDisponibles;
	}
	
	public void crearProducto() {
		Producto producto1 = new Producto("Coca Cola", 120, 10);
		Producto producto2 = new Producto("Agua",80,10);
		Producto producto3 = new Producto("Fanta",100,10);
		Producto producto4 = new Producto("Red Bull",160,10);
		productosDisponibles.add(producto1);
		productosDisponibles.add(producto2);
		productosDisponibles.add(producto3);
		productosDisponibles.add(producto4);
		
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Producto producto : productosDisponibles) {
			sb.append(producto.toString());
			
		}
		return sb.toString();
	}
}
 