package operadores;

import java.util.Scanner;

public class Ciclos {
	
	void saludo() { // las funciones void no requieren return
		System.out.println("Hola a las funciones en Java.");
	}

	int operacion() {
		int f = (int) Math.pow(3, 2); // el int se agrega porque el resultado sale como double
		return f;
	}

	float nuevo() {
		return 0;
	}

	static double nuevoD() {
		double h = Math.pow(8,  3);
		return h;
	}
	
	String caracteres() {
		String nombre = " ";
		return nombre;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ciclos objC;
		objC = new Ciclos();
		System.out.println("Uso de pow() " + objC.operacion());
		System.out.println("Otro uso de pow " + nuevoD());

		objC.saludo();
		Scanner scanner = new Scanner(System.in);
		System.out.print("\t\t\tIntroduzca el valor de la tabla de multiplicar --> ");
		int  tabla = scanner.nextInt();
		for(int i = 0; i < 20; i+=3) {
			System.out.println(tabla + "*" + i + " = " + (tabla * i));
		}
		
		
		int j = 1;
		System.out.print("\t\t\tIntroduzca el valor de la tabla de multiplicar --> ");
		int tablaW = scanner.nextInt();
		while (j < 10) {
			System.out.println(tablaW + "*" + j + " = " + (tabla * j));
			j++;
		}
		
	}

}
