package modelo;

import java.util.Objects;

public class Producto {
	
	private String nombre;
	private int precio;
	private int cantidad;
	
	public Producto(String nombre, int precio, int cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

	public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void restarCantidad(int cantidad) {
        this.cantidad -= cantidad;
    }
    
    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		
		return String.format(
        		".  %-15s %-5s centimos     %10s Unidades\n",
                nombre, precio, cantidad);
                
	}
}