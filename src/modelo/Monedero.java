package modelo;

import java.util.ArrayList;

public class Monedero {
	private ArrayList<Moneda> monedas;
	private int cantidadMaximaMonedas;
	
	public Monedero(ArrayList<Moneda> monedas, int cantidadMaximaMonedas) {
		monedas = new ArrayList<>();
		this.cantidadMaximaMonedas = cantidadMaximaMonedas;
	}
	
	public Monedero() {
        monedas = new ArrayList<Moneda>();
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
	
	public boolean agregarMoneda(int valorMoneda) {
	    boolean monedaAceptada = false;
	    switch (valorMoneda) {
	        case 100: monedas.add(new Moneda(100,40));
	        monedaAceptada = true;
	        break;
	        case 200: monedas.add(new Moneda(200,40));
	        monedaAceptada = true;
	        break;
	        case 10:monedas.add(new Moneda(10,40));
	        monedaAceptada = true;
	        break;
	        case 20:monedas.add(new Moneda(20,40));
	        monedaAceptada = true;
	        break;
	        case 50:monedas.add(new Moneda(50,40));
	        monedaAceptada = true;
	        break;
	        default:
	            monedaAceptada = false;
	            break;
	    }
	    return monedaAceptada;
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

