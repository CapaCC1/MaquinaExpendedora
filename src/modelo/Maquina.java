package modelo;

import java.util.ArrayList;

	public class Maquina {
	
		private Billetero billetero;
		private ArrayList<Producto> productosDisponibles = new ArrayList<Producto>();
	    private String passwordMantenimiento;
	    private Dispensador dispensador;
	    
	    
		public Maquina(Billetero billetero, ArrayList<Producto> productosDisponibles, String passwordMantenimiento, Dispensador dispensador) {
			this.billetero = billetero;
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
		public Billetero getBilletero() {
			return billetero;
		}

		public void setBilletero(Billetero billetero) {
			this.billetero = billetero;
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
		
		public String buscarProductoPorPosicion(int posicion) {
		    if (posicion >= 0 && posicion < productosDisponibles.size()) {
		        Producto producto = productosDisponibles.get(posicion);
		        int cantidad = producto.getCantidad();
		        
		        if (cantidad > 0) {
		            producto.setCantidad(cantidad - 1);
		            return producto.toString();
		            
		        } else {
		            return "\nEl producto en la posición " + posicion + " esta AGOTADO.\n";
		        }
		    } else {
		        return "\nLa posición " + posicion + " no EXISTE.\n";
		    }
		}
		
		
		public Producto buscarProductoPorPosicion1(int posicion) {
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
 