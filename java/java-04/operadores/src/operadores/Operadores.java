package operadores;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//System.out.println("--- Introduce un dato ---");
		//String dato = scanner.nextLine();
		//System.out.println("El dato es: " + dato);
	
		
		
		System.out.println("-----Menú-----");
		System.out.println("1: Suma");
		System.out.println("2: Resta");
		System.out.println("3: Multiplicación");
		System.out.println("4: División");
		System.out.println("5: Módulo");
		System.out.println("6: Booleans");

		
		System.out.println("Introduzca la opción");
		int  numero = scanner.nextInt();
		
		String msj = " "; 
		switch(numero) {
		case 1:
			System.out.println("uno");
			System.out.println("Introduce el valor 1");
			int sum1 = scanner.nextInt();
			System.out.println("Introduce el valor 2");
			int sum2 = scanner.nextInt();
			int suma = sum1 + sum2;
			System.out.println("La suma es: " + suma);
			break;
		case 2:
			System.out.println("dos");
			System.out.println("Introduce el valor 1");
			int res1 = scanner.nextInt();
			System.out.println("Introduce el valor 2");
			int res2 = scanner.nextInt();
			int resta = res1 - res2;
			System.out.println("La resta es: " + resta);
			break;
		case 3:
			System.out.println("tres");
			System.out.println("Introduce el valor 1");
			int mul1 = scanner.nextInt();
			System.out.println("Introduce el valor 2");
			int mul2 = scanner.nextInt();
			int producto = mul1 * mul2;
			System.out.println("El producto es: " + producto);
			break;
		case 4:
			System.out.println("cuatro");
			System.out.println("Introduce el valor 1");
			int div1 = scanner.nextInt();
			System.out.println("Introduce el valor 2");
			int div2 = scanner.nextInt();
			int div = div1 / div2;
			System.out.println("La división es: " + div);
			break;
		case 5:
			System.out.println("cinco");
			System.out.println("Introduce el valor 1");
			int mod1 = scanner.nextInt();
			System.out.println("Introduce el valor 2");
			int mod2 = scanner.nextInt();
			int modulo = mod1 % mod2; // se debe dividir sobre 2
			System.out.println("El residuo es es: " + modulo);
			if(modulo != 0) {
				System.out.println("El número no es par");
			} else {
				System.out.println("El número es par");
			}
			break;
		case 6:
			System.out.println("seis");
			int a = 3;
			int b = 5;
			boolean comparar = a > b;
			boolean logica = false;
			if (comparar && logica) {
				System.out.println("Hola, sí soy verdadero.");
			} else {
				System.out.println("Hola, soy falso.");
			}
			break;
		case 7:
			System.out.println("siete");
			break;
		default:
		}	
		
		int i = 0;
		do {
			System.out.println("Loop Do while");
			System.out.println(numero);
			i++; 
		} while (numero != 99);
		
	}
}
