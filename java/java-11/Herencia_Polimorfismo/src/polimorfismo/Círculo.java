package polimorfismo;

import java.util.Scanner;

public class Círculo extends FigurasGeométricas {
	private double radio;
	Scanner s = new Scanner(System.in);
	@Override
	public void pedirDatos() {
		System.out.println("\t\t Área del círculo");
		// TODO Auto-generated method stub
		System.out.println("Introduzca el radio: ");
		radio = s.nextDouble();
	}
	@Override
	public void área() {
		// TODO Auto-generated method stub
		resultado = (3.1416 * radio) * (3.1416 * radio);
	}

}
