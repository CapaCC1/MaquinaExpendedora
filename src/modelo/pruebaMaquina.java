package modelo;
import java.util.InputMismatchException;
import java.util.Scanner;
public class pruebaMaquina {
	public static boolean comprobarAdmin(boolean admin, int opcion) {
		
		if(opcion == 777) {
			
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner in1 = new Scanner(System.in);
		boolean comprar = false;
		boolean entrar = false;
		boolean admin = false;
		Maquina maquina1 = new Maquina();
		
		while(!entrar) {
			System.out.println(maquina1);
			
			try {		
			System.out.print("Introduce la opcion deseada: ");
			int opcion = in1.nextInt();
			
			if(comprobarAdmin(admin, opcion)) {
				System.out.println("");
				System.out.println("\t-----------------------");
				System.out.println("\t*MENU ADMINISTRADOR*");
				System.out.println("\t0- Salir");
				System.out.println("\t1- Introducir Productos");
				System.out.println("\t2- Introducir Cambios");
				System.out.println("\t3- Recaudacion");
				System.out.println("\t-----------------------");
				System.out.println("");
				System.out.println("Introduzca la opcion deseada");
				int seleccion = in1.nextInt();
				
				switch(seleccion) {
					case 0:
							System.out.println("\nVolviendo a maquina...\n");
							entrar = false;
							break;
					case 1:
							System.out.println("*Introducir Productos*\n");
							System.out.print("\t<numero_producto>");
							int posicion = in1.nextInt();
							System.out.print("\t<cantidad>");
							int cantidadIntroducir = in1.nextInt();
							System.out.println(maquina1.aniadirCantidadProducto(posicion, cantidadIntroducir));
							break;
					case 2: 
							break;
					case 3:
							System.out.println(maquina1.mostrarMonedas());
							break;
				}
			}
			while (!comprar && !comprobarAdmin(admin, opcion)) {
						
			        System.out.print("\nIntroduce una moneda de 100, 200, 10, 20 o 50 centimos: ");
			        int valorMoneda = in1.nextInt();		        
			        String resultado = maquina1.comprarProducto(opcion, valorMoneda);
			        System.out.println(resultado);
					
			        if(resultado.contains("compra")) {
			        	break;
			        }
			        
			}

			}catch (InputMismatchException e){
				System.out.println("Error, valor incorrecto");
				comprar = false;
				in1.next();
			}
			}
		in1.close();
		}
		}
	

