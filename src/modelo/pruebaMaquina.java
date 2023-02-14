package modelo;
import java.util.Scanner;
public class pruebaMaquina {

	public static void main(String[] args) {
		
		Scanner in1 = new Scanner(System.in);
		
		Maquina maquina1 = new Maquina();
		maquina1.crearProducto();

		System.out.println(maquina1);
		System.out.print("Introduce la opcion deseada: ");
		int opcion = in1.nextInt();
		
		
	}

}
