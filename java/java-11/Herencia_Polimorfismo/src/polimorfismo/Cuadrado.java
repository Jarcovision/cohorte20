package polimorfismo;

import java.util.Scanner;

public class Cuadrado extends FigurasGeométricas {
	Scanner s = new Scanner(System.in);
	private double lado;
	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		System.out.println("\t\t Área del cuadrado ");
		System.out.println("Introduzca el lado: ");
		lado = s.nextDouble();
	}
		
	
	@Override
	public void área() {
		// TODO Auto-generated method stub
		resultado = lado * lado;
	}

}
