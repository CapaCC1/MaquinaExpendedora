package modelo;
import java.util.InputMismatchException;
import java.util.Scanner;
public class pruebaMaquina {
	public static boolean comprobarEntrada(int opcion) {
		if(opcion > 3) {
			return false;
		}else {
			return true;
		}
	}
	public static void main(String[] args) {
		
		Scanner in1 = new Scanner(System.in);
		boolean comprar = false;
		boolean entrar = false;
		Maquina maquina1 = new Maquina();
		
		System.out.println(maquina1);
		while(!entrar) {
			
			try {
				
			System.out.print("Introduce la opcion deseada: ");
			int opcion = in1.nextInt();
			
			if (comprobarEntrada(opcion) == true) {
				
			while (!comprar) {
						
			        System.out.print("\nIntroduce una moneda de 100, 200, 10, 20 o 50 centimos: ");
			        int valorMoneda = in1.nextInt();		        
			        String resultado = maquina1.comprarProducto(opcion, valorMoneda);
			        System.out.println(resultado);
					System.out.println(maquina1);
					
			        if(resultado.contains("compra")) {
			        	break;
			        }
			}
			}else {
				System.out.println("\nOpcion NO Disponible!\n");
				entrar = false;
				
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
	

