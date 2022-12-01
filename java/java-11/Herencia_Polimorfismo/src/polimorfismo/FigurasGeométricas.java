package polimorfismo;

public abstract class FigurasGeométricas { 
//Una clase abstracta no puede tener instancias

	//protected double pValor;
	//protected double sValor;
	protected double resultado;
	
	public abstract void pedirDatos();
	public abstract void área();
	public void visualizar() {
		System.out.println("El resultado es: " + resultado);
	}
}