package modelo;

import java.util.ArrayList;

public class Maquina {
	
		private Monedero monedero;
		private Dispensador dispensador;
		private int saldo;

		public Maquina(Monedero monedero, ArrayList<Producto> productosDisponibles, int saldo) {
        this.monedero = monedero;
        this.dispensador = new Dispensador(productosDisponibles);
        this.saldo = 0;
		}
		
	    public Maquina() {
	    	monedero = new Monedero();
	    	dispensador = new Dispensador();
	    	Producto producto1 = new Producto("Coca Cola", 120, 10);
	    	Producto producto2 = new Producto("Agua",80,10);
	    	Producto producto3 = new Producto("Fanta",100,10);
	    	Producto producto4 = new Producto("Red Bull",160,10);
	    	dispensador.agregarProducto(producto1);
	    	dispensador.agregarProducto(producto2);
	    	dispensador.agregarProducto(producto3);
	    	dispensador.agregarProducto(producto4);
	    }
		public int getSaldo() {
			return saldo;
		}

		public void setSaldo(int saldo) {
			this.saldo = saldo;
		}
	    
	    public Dispensador getDispensador() {
			return dispensador;
		}

		public void setDispensador(Dispensador dispensador) {
			this.dispensador = dispensador;
		}
		
		public Monedero getMonedero() {
			return monedero;	
		}

		public void setMonedero(Monedero monedero) {
			this.monedero = monedero;
		}
		
		public String comprarProducto(int numeroProducto, int valorMoneda) {
		    String resultado = "";
		    
		    if (dispensador.tieneProducto(numeroProducto)) { // Si existe el producto
		        Producto producto = dispensador.buscarProductoPorPosicion(numeroProducto);
		        int precioProducto = producto.getPrecio();
		        
		        if (monedero.comprobarMoneda(valorMoneda)) { // Si la moneda introducida es valida
		            saldo += valorMoneda;
		            resultado += "\nSaldo actual: " + saldo;
		            
		        } else {
		           resultado += "\nMoneda no válida. Inténtalo de nuevo.\n";
		           producto.setCantidad(producto.getCantidad() + 1);
		            return resultado;
		        }
		        
		        if (saldo >= precioProducto) { // Si el saldo es mayor o igual al precio del producto se devuelve el cambio y se dispensa el producto
		        	
		            saldo -= precioProducto;
		            
		            resultado += "\nGracias por su compra " + "\n\nPuede recoger su " + producto.getNombre() + "\n\nSu cambio es: " + monedero.devolverCambio(saldo) + "\n";
		            
		        } else { // Sino se pide que se introduzcan mas monedas
		            resultado += "\nIntroduce más monedas.\n";

		        }
		    } else {
		        resultado += "\nEl producto NO está disponible!\n";
		        
		    }
		    return resultado;
		}
		
		@Override
		 public String toString() {
		     return dispensador.toString();
		
		}
}		
 