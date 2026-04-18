/*Confeccionar una clase que permita cargar el nombre y la edad de una persona.Mostrar
 *  los datos cargados. Imprimir un mensaje si es mayor de edad (edad >= 18)*/
package proyecto60;
import java.util.Scanner;

public class Persona {
	private String nombre;
	private int edad;
	
	//metodo para cargar los datos
	public void Inicializar() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingrese el nombre:");
		nombre = teclado.next();
		System.out.print("Ingrese la edad:");
		edad = teclado.nextInt();
	}
	
	//Metodo para Imprimir los datos
	public void Imprimir() {
		System.out.println("Nombre de la persona:"+nombre);
		System.out.println("Edad de la persona:"+edad);
	}
	
	//Metodo para saber si es mayor de edad
	public void Mayor_Edad() {
		if(edad >= 18) {
			System.out.println("Es mayor de edad!");
		}else {
			System.out.println("Es menor de edad!");
		}
	}
	
	public static void main(String[] arg) {
		Persona persona1 = new Persona();	//Creo el objeto persona
		//Agrego sus metodos
		persona1.Inicializar();
		persona1.Imprimir();
		persona1.Mayor_Edad();
		
	}
}
