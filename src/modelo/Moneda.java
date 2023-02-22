package modelo;

public class Moneda {
	
	private int valor;
	
	public Moneda(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
			sb.append(valor + " Centimos\n");
		return sb.toString();
	}
	
	
	
}
