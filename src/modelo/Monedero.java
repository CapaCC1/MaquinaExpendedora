package modelo;

import java.util.ArrayList;

public class Monedero {
	private ArrayList<Moneda> monedas;
	
	
	public Monedero(ArrayList<Moneda> monedas) {
		monedas = new ArrayList<>();
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
	
	public boolean comprobarMoneda(int valorMoneda) { //Metodo que a partir de un valor entero comprueba si el valor es valido
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
       
    public String devolverCambio(int cambio) { //Metodo para devolver el cambio segun un valor entero
    	String resultado = "";
    	
        int mon2Euros = cambio / 200; // Cantidad de monedas de 2 euros
        cambio %= 200; // Resto para calcular las siguientes monedas
        if(mon2Euros != 0) {
        	resultado += ("\n" + mon2Euros + " moneda(s) de 2 euros");
        	
        }else {
        	resultado += "";
        }
        int mon1Euro = cambio / 100; // Cantidad de monedas de 1 euro
        cambio %= 100;
        if(mon1Euro != 0) {
        	resultado += ("\n" + mon1Euro + " moneda(s) de 1 euro");
        	
        }else {
        	resultado += "";
        }
        int mon50cent = cambio / 50; // Cantidad de monedas de 50 centimos
        cambio %= 50;
        if(mon50cent != 0) {
        	resultado += ("\n" + mon50cent + " moneda(s) de 50 centimos");	
        }else {
        	resultado += "";
        }
        int mon20cent = cambio / 20; // Cantidad de monedas de 20 centimos
        cambio %= 20;
        if(mon20cent != 0) {
        	resultado += ("\n" + mon20cent + " moneda(s) de 20 centimos");	
        }else {
        	resultado += "";
        }
        int mon10cent = cambio / 10; // Cantidad de monedas de 10 centimos
        if(mon10cent != 0) {
        	resultado += ("\n" + mon10cent + " moneda(s) de 10 centimos");	
        }else {
        	resultado += "";
        }
        
        if(mon2Euros == 0 && mon1Euro == 0 && mon50cent == 0 && mon20cent == 0 && mon10cent == 0) {
        	resultado += "0";
        }
        return resultado;
        
    }
    public void vaciarMonedero() {
        monedas.clear();
    }
    
}

