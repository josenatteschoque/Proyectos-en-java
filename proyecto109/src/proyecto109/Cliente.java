package proyecto109;

public class Cliente {
	private String nombre;
	private int monto;
	
	//Constructor
	public Cliente(String nombre) {
		this.nombre = nombre;
		this.monto = 0;
	}
	
	//Metodo que perimite Depositar
	public void Depositar(int n) {
		monto = monto + n;
	}
	
	//Metodo que permite Extraer 
	public void Extraer(int n) {		
		monto = monto-n;
	}
	
	//Metodo que retorna el monto
	public int RetornarMonto() {
		return monto;
	}
	
	//Metodo para imprimir
	public void Imprimir() {
		System.out.println("[Nombre: "+nombre+" Tiene depositado la suma de : "+monto+"]");
	}
}
