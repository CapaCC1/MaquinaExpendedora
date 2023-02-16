package modelo;

import java.util.ArrayList;

	public class Maquina {
	
		private Monedero monedero;
		private ArrayList<Producto> productosDisponibles = new ArrayList<Producto>();
	    private Dispensador dispensador;
	    private int saldo;
	    
	    
		public int getSaldo() {
			return saldo;
		}

		public void setSaldo(int saldo) {
			this.saldo = saldo;
		}

		public Maquina(Monedero monedero, ArrayList<Producto> productosDisponibles, Dispensador dispensador, int saldo) {
			this.monedero = monedero;
			this.productosDisponibles = productosDisponibles;
			this.dispensador = dispensador;
			this.saldo = 0;
		}
	    
	    public Dispensador getDispensador() {
			return dispensador;
		}

		public void setDispensador(Dispensador dispensador) {
			this.dispensador = dispensador;
		}

		public Maquina() {
	    	monedero = new Monedero();
	    }
		public Monedero getMonedero() {
			return monedero;
		}

		public void setMonedero(Monedero monedero) {
			this.monedero = monedero;
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
		
		private Producto buscarProductoPorPosicion(int posicion) {
		    if (posicion >= 0 && posicion < productosDisponibles.size()) {
		        Producto producto = productosDisponibles.get(posicion);
		        int cantidad = producto.getCantidad();
		        
		        if (cantidad > 0) {
		            producto.setCantidad(cantidad - 1);
		            return producto;
		            
		        } else {
		            return null;
		        }
		    } else {
		    	return null;
		    }
		}
		
		private boolean tieneProducto(int posicion) {
		    if (posicion < 0 || posicion >= productosDisponibles.size()) {
		        return false;
		    }
		    Producto producto = productosDisponibles.get(posicion);
		    if (producto.getCantidad() > 0) {
		        return true;
		    } else {
		        return false;
		    }
		}
		
		
		public String comprarProducto(int numeroProducto, int valorMoneda) {
			int saldo = 0;
		    String resultado = "";
		    if (tieneProducto(numeroProducto)) {
		        Producto producto = buscarProductoPorPosicion(numeroProducto);
		        int precioProducto = producto.getPrecio();
		        if (monedero.agregarMoneda(valorMoneda)) {
		            saldo += valorMoneda;
		            resultado += "Saldo actual: " + saldo;
		        } else {
		           resultado += "Moneda no válida. Inténtalo de nuevo.";
		            return resultado;
		        }
		        if (saldo >= precioProducto) {
		            saldo -= precioProducto;
		            resultado += "\nProducto " + producto.getNombre() + " comprado. Su cambio es: " + saldo + "\n";
		        } else {
		            resultado += "\nIntroduce más monedas.\n";

		        }
		    } else {
		        resultado += "\nEl producto NO está disponible!\n";
		        
		    }
		    return resultado;
		}
		
		@Override
		public String toString() {
			int i = 0;
			StringBuilder sb = new StringBuilder();
			for (Producto producto : productosDisponibles) {
				sb.append(i + producto.toString());
				i++;
			}
			return sb.toString();
		}
		
}		
 