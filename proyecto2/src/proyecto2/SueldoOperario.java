//Problema:Calcular el sueldo mensual de un operario conociendo la cantidad de horas trabajadas y el pago por hora.  

package proyecto2;

import java.util.Scanner;

public class SueldoOperario {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner (System.in); //Scanner me permite cargar datos por teclado
		//declaro los tipos de variables 
		int HorasTrabajadas;
		float CostoHora;
		float Sueldo;
		
		System.out.print("ingrese las horas trabajadas:");
		HorasTrabajadas = teclado.nextInt();
		System.out.print("ingrese el costo de hora:");
		CostoHora = teclado.nextFloat();
		 
		Sueldo = HorasTrabajadas*CostoHora;
		System.out.print("su sueldo es:");
		System.out.print(Sueldo);	
		
	}
	
}
