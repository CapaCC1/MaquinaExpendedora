package modelo;

public class Moneda {
	
	private int valor;
	private int cantidadMonedas;
	
	public Moneda(int valor, int cantidadMonedas) {
		this.valor = valor;
		this.cantidadMonedas = cantidadMonedas;
	}

	public int getValor() {
		return valor;
	}

	public int getCantidadMonedas() {
		return cantidadMonedas;
	}

	public void setCantidadMonedas(int cantidadMonedas) {
		this.cantidadMonedas = cantidadMonedas;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
}
