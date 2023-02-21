package modelo;

public class Maquina {
	
	private Dispensador dispensador;
    private Monedero monedero;
    private int saldo = 0;
    
    public Maquina(Dispensador dispensador, Monedero monedero) {
    	
    	monedero = new Monedero();
    	dispensador = new Dispensador();
    }
	
    public Maquina() {
    	monedero = new Monedero();
    	dispensador = new Dispensador();
    }
    
	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public String aniadirCantidadProducto(int posicion, int cantidad) {
		String resultado = "";
		String nombreProducto = "";
		int cantidadActual = 0;
		if(dispensador.tieneProducto(posicion)){
			nombreProducto = dispensador.buscarNombreProducto(posicion);
			cantidadActual = dispensador.buscarCantidadProducto(posicion);
			dispensador.setCantidadProducto(posicion, cantidadActual + cantidad);
			resultado += "\nEl producto " + nombreProducto + " ha sido rellenado con " + cantidad + " UDs\n";
		}else {
			resultado += "Producto NO Disponible!";
		}
		return resultado;
	}
	
	public String mostrarMonedas() {
		return monedero.getMonedas().toString();
	}
	
	private boolean procesarMoneda(int valorMoneda) { //Comprueba si la moneda introducida es correcta
		if (monedero.comprobarMoneda(valorMoneda)) {
			saldo += valorMoneda;
	            return true;
	        } else {
	            return false;
	        }
	    }	    
	
	private String procesarCompra(int numeroProducto) { //Metodo del proceso de la compra
		String resultado = "";
	    if (!dispensador.tieneProducto(numeroProducto)) {// Se comprueba si existe el producto buscado
	    	resultado+= "El producto no está disponible.";
	    }else {
	    	int precioProducto = dispensador.buscarPrecioProducto(numeroProducto); 
	    	String nombreProducto = dispensador.buscarNombreProducto(numeroProducto);
	    	resultado += "\nSaldo: " +  saldo + "\n";
	    int cambio = saldo - precioProducto;
	   
	    if (saldo >= precioProducto) {// Si el saldo es igual o mayor a al precio se dispensa el producto
	        dispensador.dispensarProducto(numeroProducto);
	        resultado+= "Gracias por su compra\n\nPuede recoger su " + nombreProducto + "\n\nSu cambio es: " + cambio + monedero.devolverCambio(cambio) + "\n";
	    } else {
	        resultado+= "Introduce más monedas.\n";
	        }
	    }
	    return resultado;
	}
	    
	public String comprarProducto(int numeroProducto, int valorMoneda) {//Metodo que realiza la compra en la clase main
		if (!procesarMoneda(valorMoneda)) {
	            return "Moneda no válida. Inténtalo de nuevo.";
	        }
	        return procesarCompra(numeroProducto);
	    }
	@Override
	public String toString() {
    	return dispensador.toString();
		}
	}

		
	
 