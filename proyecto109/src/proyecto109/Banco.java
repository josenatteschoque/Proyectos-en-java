/*Problema 
 * Un banco tiene 3 clientes que pueden hacer depositos y  extracciones.
 * Tambien el banco quiere que al final del dia se calcule la cantidad de dinero que hay depositado*/

package proyecto109;

public class Banco {
	private Cliente C1, C2, C3;
	
	//COnstructor de objetos de la clase Cliente
	public Banco() {
		C1 = new Cliente("jose");
		C2 = new Cliente("maria");
		C3 = new Cliente("carla");
	}
	
	//Metodo que permite operar
	public void Operar() {
		C1.Depositar(300);
		C2.Depositar(20);
		C3.Depositar(67);
		C1.Extraer(100);
	}
	
	//Metodo que permite calcular el monto total 
	public void DepositosTotales() {
		int total = C1.RetornarMonto() + C2.RetornarMonto() + C3.RetornarMonto();
		System.out.println("El dinero depositado en el dia es de:"+total);
		C1.Imprimir();;
		C2.Imprimir();
		C3.Imprimir();
	}
	
	//Metodo principal!
	public static void main(String[] args) {
		Banco banco1 = new Banco();
		banco1.Operar();
		banco1.DepositosTotales();
	}
}
