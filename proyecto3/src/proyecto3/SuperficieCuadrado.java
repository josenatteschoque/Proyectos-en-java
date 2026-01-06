//Hallar la superficie de un cuadrado conociendo el valor de un lado
package proyecto3;

import java.util.Scanner;

public class SuperficieCuadrado {
	public static void main(String[] pa) {
		Scanner teclado=new Scanner(System.in); //permite recibir datos por teclado
		int lado;
		int superficie;
		System.out.print("ingrese el valor del lado:");
		lado=teclado.nextInt(); //recibe el valor por consola 
		superficie=lado*lado; //realiza la operacio 
		System.out.print("la superficie es: ");
		System.out.print(superficie);
	}
}
