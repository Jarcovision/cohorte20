package colecciones;

import java.util.Arrays;

public class Arreglos {
	public static void main(String [] args) {
		// Los arrays sólo permiten un tipo de dato (String, int, double, long)
		// Se debe especificar su tamaño
		String [] miArreglo = new String[6]; // preguntar sobre declaración de arrays
		miArreglo[0] = "Sid";
		miArreglo[1] = "Tránsito";
		miArreglo[2] = "Milaneso";
		miArreglo[3] = "Mafio";
		miArreglo[4] = "Mandarino";
		miArreglo[5] = "Sid";

	
		System.out.println(miArreglo[3]);
		
		for(int i = 0; i < miArreglo.length; i++) {
			System.out.println("Ciclo for: " + miArreglo[i]);
		}
		System.out.println("---------------------------");
		
		// forEach
		for(String nombresGatos : miArreglo) {
			System.out.println("For each: " + nombresGatos);
		}
		
		// Math.pow(2, 2
		// Arrays
		System.out.println(Arrays.toString(miArreglo));
		
		int numeros [] = new int[5];	
		numeros[0] = 23;
		numeros[1] = (int)76.5;// Casteo == cambiar el tipo de un valor
		numeros[2] = 88;
		numeros[3] = Integer.parseInt("18");// Parseo == cambiar la clase de un valor
		numeros[2] = 88;
		numeros[4] = 117;

		for(int numero : numeros) {
			System.out.println("Valores del arreglo numeros: " + numero);
		}
		
		//Arreglos de objetos
		Persona persona1 = new Persona("Pancho", 30);
		Persona persona2 = new Persona("Pedro", 32);
		
		//
		Persona [] arrPersonas = new Persona[3];
		arrPersonas[0] = persona1;
		arrPersonas[1] = persona2;
		arrPersonas[2] = new Persona("Luis", 18);

		System.out.println(arrPersonas[0].nombre);
		System.out.println(arrPersonas[1].nombre);
		System.out.println(arrPersonas[2].nombre);

		for(Persona persona : arrPersonas) {
			System.out.println("Nombre: " + persona.nombre + " edad: " + persona.edad);
		}
		
		// Arreglos literales
		String [] arrString = {"Manzana", "Pera", "12", "Hola"};
		System.out.println(Arrays.toString(arrString));
	
	}
}
