package oop;

import java.util.Scanner;

public class Tablas {
// cuando una clase no tiene método main, se le conoce como clase concreta
	Scanner scanner = new Scanner(System.in);
	void tabla() {
		System.out.println("Introduzca el número de tabla");		
		int nTabla = scanner.nextInt();
		int i = 1;
		while (i <= 10) {
			System.out.println(nTabla + " * " + i + " = " + (nTabla * i));
			i++;
		}
	}
}
