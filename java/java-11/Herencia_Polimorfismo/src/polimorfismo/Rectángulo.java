package polimorfismo;

import java.util.Scanner;

public class Rectángulo extends FigurasGeométricas{
	private double base;
	private double altura;
	Scanner s = new Scanner(System.in);
	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		System.out.println("\t\t Área del rectángulo ");
		System.out.println("Introduzca la base: ");
		base = s.nextDouble();
		System.out.println("Introduzca la altura: ");
		altura = s.nextDouble();
	}
	
	@Override
	public void área() {
		// TODO Auto-generated method stub
		resultado = (base * altura);
	}
}
