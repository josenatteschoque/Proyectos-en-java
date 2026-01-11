//Escribir un programa en el cual se ingresen cuatro numeros.
//calcular e informar la suma de los dos primero y el producto del tercero y cuarto.
package proyecto6;

import java.util.Scanner;

public class SumaProducto {
	public static void main(String[] pa) {
		Scanner teclado=new Scanner(System.in);
		//Declaro las variables 
		int Num1, Num2, Num3, Num4;
		int Suma, Producto;
		
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
		Suma=Num1+Num2;
		Producto=Num3*Num4;
		
		//Muestro los resultados
		System.out.print("La suma de los 2 primero numeros son:");
		System.out.println(Suma);	//println para que salte ala siguiente linea
		System.out.print("El producto de los ultimos numero es:");
		System.out.print(Producto);
	}
}
