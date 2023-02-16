package modelo;
import java.util.InputMismatchException;
import java.util.Scanner;
public class pruebaMaquina {

	public static void main(String[] args) {
		
		Scanner in1 = new Scanner(System.in);
		boolean comprar = false;
		boolean entrar = false;
		Maquina maquina1 = new Maquina();
		maquina1.crearProducto();
		
		while(!entrar) {
			
		
		try {
		System.out.println(maquina1);
			
		System.out.print("Introduce la opcion deseada: ");
		int opcion = in1.nextInt();
		
			
		while (!comprar) {
			
		        System.out.println("Introduce una moneda de 1, 2, 10, 20 o 50 centimos:");
		        int valorMoneda = in1.nextInt();
		        
		        String resultado = maquina1.comprarProducto(opcion, valorMoneda);
		        System.out.println(resultado);
		        System.out.println(maquina1);
		        
		}
		}catch (InputMismatchException e){
			System.out.println("Error, valor incorrecto");
			comprar = false;
			in1.next();
			
		}
		}
	}
	}
	

