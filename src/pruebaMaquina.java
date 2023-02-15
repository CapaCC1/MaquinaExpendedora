
import java.util.Scanner;

import modelo.Maquina;
public class pruebaMaquina {
	
	public static void main(String[] args) {
		
		Scanner in1 = new Scanner(System.in);
		
		Maquina maquina1 = new Maquina();
		maquina1.crearProducto();

		while(true) {
					
		System.out.println(maquina1);
		System.out.print("Introduce la opcion deseada: ");
		int opcion = in1.nextInt();
		
		System.out.println("Introduce monedas exactas");
		int monedaIntroducida = in1.nextInt();
		
		System.out.println(maquina1.comprarProducto(opcion, monedaIntroducida));
		
		}
		
		
	}

}
