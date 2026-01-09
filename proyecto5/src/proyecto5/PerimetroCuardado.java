//Realizar la carga del lado de un cuadrado, mostrar por pantalla el perimetro del mismo
//(El perimetro de un cuadrado se calcula multiplicando el valor del lado por cuatro)
package proyecto5;

import java.util.Scanner;

public class PerimetroCuardado {
	public static void main(String[] pa) {
		Scanner teclado=new Scanner(System.in);
		//Declaro las variables 
		int Lado, Perimetro;
		//Solicito los datos
		System.out.print("Ingrese el valor del lado:");
		Lado=teclado.nextInt();
		//Realizo la operacion
		Perimetro=Lado*4;
		//Muestro el resultado por pantalla
		System.out.print("El perimetro del cuadrado es:");
		System.out.print(Perimetro);
		
	}
}
