package oop;

import java.util.Scanner;

public class OperacionesAritmeticas {
	Scanner s = new Scanner(System.in);
	
	double add() {
		System.out.println("Introduce el valor 1");
		double valor0 = s.nextDouble();
		System.out.println("Introduce el valor 2");
		double valor1 = s.nextDouble();
		return valor0 + valor1;
	}
	
	double substract() {
		System.out.println("Introduce el valor 1");
		double valor0 = s.nextDouble();
		System.out.println("Introduce el valor 2");
		double valor1 = s.nextDouble();
		return valor0 - valor1;
	}
	
	double mult() {
		System.out.println("Introduce el valor 1");
		double valor0 = s.nextDouble();
		System.out.println("Introduce el valor 2");
		double valor1 = s.nextDouble();
		return valor0 * valor1;
	}
	double divide() {
		System.out.println("Introduce el valor 1");
		double valor0 = s.nextDouble();
		System.out.println("Introduce el valor 2");
		double valor1 = s.nextDouble();
		if (valor1 != 0) {
			return valor0 / valor1;
		} else {
			System.out.println("No se puede dividir sobre cero");
		}
		return valor0 / valor1;
	}


}