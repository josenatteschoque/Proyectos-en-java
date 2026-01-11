//Realizar un programa que lea cuatro valores numericos e informar su suma y promedio 
package proyecto7;

import java.util.Scanner;

public class SumaPromedio {
	public static void main(String[] pa) {
		Scanner teclado = new Scanner(System.in);
		
		//Declaro las variables
		int Num1, Num2, Num3, Num4;
		int Suma, Promedio;
		
		//Solicito los datos 
		System.out.print("Ingrese el primer numero:");
		Num1=teclado.nextInt();
		System.out.print("Ingrese el segundo numero:");
		Num2=teclado.nextInt();
		System.out.print("Ingrese el tercer numero:");
		Num3=teclado.nextInt();
		System.out.print("Ingrese el cuarto numero:");
		Num4=teclado.nextInt();
		
		//Realizo las operaciones
		Suma=Num1+Num2+Num3+Num4;
		Promedio=Suma/4;
		
		//Muestro los resultados
		System.out.print("La suma es:");
		System.out.println(Suma);
		System.out.print("El promedio es:");
		System.out.print(Promedio);
	}
}
