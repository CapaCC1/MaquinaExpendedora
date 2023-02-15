package modelo;

import java.util.ArrayList;

	public class Maquina {
	
		private Monedero monedero;
		private ArrayList<Producto> productosDisponibles = new ArrayList<Producto>();
	    private String passwordMantenimiento;
	    private Dispensador dispensador;
	    
	    
		public Maquina(Monedero monedero, ArrayList<Producto> productosDisponibles, String passwordMantenimiento, Dispensador dispensador) {
			this.monedero = monedero;
			this.productosDisponibles = productosDisponibles;
			this.passwordMantenimiento = passwordMantenimiento;
			this.dispensador = dispensador;
		}
	    
	    public Dispensador getDispensador() {
			return dispensador;
		}

		public void setDispensador(Dispensador dispensador) {
			this.dispensador = dispensador;
		}

		public Maquina() {
	    	
	    }
		public Monedero getMonedero() {
			return monedero;
		}

		public void setMonedero(Monedero monedero) {
			this.monedero = monedero;
		}

		public String getPasswordMantenimiento() {
			return passwordMantenimiento;
		}

		public void setPasswordMantenimiento(String passwordMantenimiento) {
			this.passwordMantenimiento = passwordMantenimiento;
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
		
		public String comprarProducto(int numeroProducto, int saldo) {
			
		    String resultado = "";
		    if (tieneProducto(numeroProducto) == true) {
		    	Producto producto = buscarProductoPorPosicion(numeroProducto);
		    	int precioProducto = producto.getPrecio();
		    
		    	if (precioProducto <= saldo) {
		            saldo -= precioProducto;
		            resultado += "\nProducto " + producto.getNombre() + " comprado. Su cambio es: " + saldo + "\n";
		        } else{
		        	resultado+= "\nLo siento, no tienes suficiente saldo.\n";
		        }
		    } else {
		    	resultado += "\nEl producto NO Esta Disponible!\n";
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
 