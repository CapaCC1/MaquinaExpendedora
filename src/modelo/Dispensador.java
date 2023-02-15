package modelo;

import java.util.ArrayList;

public class Dispensador {
	
	private ArrayList<Integer> cambioDisponible = new ArrayList<Integer>();
	
	public Dispensador( ArrayList<Integer> cambioDisponible) {
		this.cambioDisponible = cambioDisponible;
	}
	
	public ArrayList<Integer> getCambioDisponible() {
		return cambioDisponible;
	}

	public void setCambioDisponible(ArrayList<Integer> cambioDisponible) {
		this.cambioDisponible = cambioDisponible;
	}

	public Dispensador() {
		
	}
	
	 public int getCambioDisponible(int valor) {
	        if (valor < 1 || valor > 50 || valor % 1 != 0) {
	            throw new IllegalArgumentException("El valor de cambio debe ser 1, 2, 10, 20 o 50 céntimos.");
	        }
	        return cambioDisponible.get(valor / 1 - 1);
	    }
	 
	  public void setCambioDisponible(int valor, int cantidad) {
	        if (valor < 1 || valor > 50 || valor % 1 != 0) {
	            throw new IllegalArgumentException("El valor de cambio debe ser 1, 2, 10, 20 o 50 céntimos.");
	        }
	        cambioDisponible.set(valor / 1 - 1, cantidad);
	    }
	            
	
}
