package oop;

import java.util.Scanner;

public class Menu {
	Scanner s = new Scanner(System.in);
	int menuOp() {
		int numero = 0;
		System.out.println("1: Suma");
		System.out.println("2: Resta");
		System.out.println("3: Multiplicación");
		System.out.println("4: División");
		System.out.println("5: Módulo");
		System.out.println("6: Booleans");
		System.out.println("7: Salir");
		
		System.out.println("Introduzca la opción");
		return numero = s.nextInt();
		}

	int subMenuOp() {
		int numero = 0;
		System.out.println("1: Suma");
		System.out.println("2: Resta");
		System.out.println("3: Multiplicación");
		System.out.println("4: División");
		System.out.println("5: Módulo");
		System.out.println("6: Booleans");
		System.out.println("7: Salir");
		
		System.out.println("Introduzca la opción");
		return numero = s.nextInt();
		}


}