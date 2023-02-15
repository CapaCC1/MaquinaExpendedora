package modelo;

import java.util.ArrayList;

public class Monedero {
	private ArrayList<Moneda> monedas;
	private int cantidadMaximaMonedas;
	
	public Monedero(ArrayList<Moneda> monedas, int cantidadMaximaMonedas) {
		monedas = new ArrayList<>();
		this.cantidadMaximaMonedas = cantidadMaximaMonedas;
	}
	public ArrayList<Moneda> getMonedas() {
		return monedas;
	}
	public void setMonedas(ArrayList<Moneda> monedas) {
		this.monedas = monedas;
	}
	public int getCantidadMaximaMonedas() {
		return cantidadMaximaMonedas;
	}
	public void setCantidadMaximaMonedas(int cantidadMaximaMonedas) {
		this.cantidadMaximaMonedas = cantidadMaximaMonedas;
	}
	
	public void inicializarMonedas() {
	    monedas.add(new Moneda(1,40));
	    monedas.add(new Moneda(2,40));
	    monedas.add(new Moneda(10,40));
	    monedas.add(new Moneda(20,40));
	    monedas.add(new Moneda(50,40));
	}

    public int calcularTotal() {
        int total = 0;
        for (Moneda moneda : monedas) {
            total += moneda.getValor();
        }
        return total;
    }
    
    public boolean comprobarMoneda(int monedaIntroducida) {
    	
    	for (Moneda moneda : monedas) {
    		if(moneda.getValor() == monedaIntroducida) {
    			return true;
    		}else {
    		}
    		return false;
		}
		return false;
    }
    
    public void vaciarMonedero() {
        monedas.clear();
    }
}
