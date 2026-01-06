//Realizar la carga de dos numeros enteros por teclado e imprimir su suma y producto
package proyecto4;

import java.util.Scanner;

public class SumaProducto {
	public static void main(String[] pa) {
		Scanner teclado=new Scanner(System.in);
		//declaro las variables
		int Numero1, Numero2;
		int Suma, Producto;
		//solicito los datos
		System.out.print("ingrese el primer numero:");
		Numero1=teclado.nextInt();
		System.out.print("ingrese el segundo numero:");
		Numero2=teclado.nextInt();
		//realizo las operaciones 
		Suma=Numero1+Numero2;
		Producto=Numero1*Numero2;
		//muestro los resultados
		System.out.print("la suma es:");
		System.out.println(Suma);	//println permite saltar ala siguiengte linea 
		System.out.print("el producto es:");
		System.out.print(Producto);
	}
}
