package variables;

public class TipoVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// byte, short, int, long
		byte numeroB = 127;
		System.out.println("Tamaño de un byte: " + Byte.SIZE);
		System.out.println("El valor máximo de un byte es: " + Byte.MAX_VALUE);
		System.out.println("El valor mínimo de un byte es: " + Byte.MIN_VALUE);
		
		System.out.println("----------------------------------");
		int entero =123456789;
		System.out.println("Tamaño de un entero en bits: " + Integer.SIZE);
		System.out.println("Tamaño: " + Integer.BYTES);
		System.out.println("Valor max: " + Integer.MAX_VALUE);
		System.out.println("Valor min: " + Integer.MIN_VALUE);
		System.out.println("El valor de entero: " + entero);
		
		System.out.println("--------short--------");
		short variableS = 6;
		System.out.println("Tamaño de short en bits: " + Short.SIZE);
		System.out.println("Cantidad de bytes en short: " + Short.BYTES);
		System.out.println("Valor máximo de short: " + Short.MAX_VALUE);
		System.out.println("Valor mínimo de short: " + Short.MIN_VALUE);
		
		long variableL = 1234;
		System.out.println("--------long--------");
		System.out.println("Tamaño de long en bits: " + Long.SIZE);
		System.out.println("Cantidad de bytes en long: " + Long.BYTES);
		System.out.println("Valor máximo de long: " + Long.MAX_VALUE);
		System.out.println("Valor mínimo de long: " + Long.MIN_VALUE);
		
		var num = 12;
		System.out.println("Esta es la variable con var: " + num);
		
		var sistemNum = 0b10101; // colocar 0b antes de un número binario, lo convierte a sistema decimal
		System.out.println(sistemNum);
		
		System.out.println("--------float--------");
		System.out.println("Tamaño de float en bits: " + Float.SIZE);
		System.out.println("Cantidad de bytes en float: " + Float.BYTES);
		System.out.println("Valor máximo de float: " + Float.MAX_VALUE);
		System.out.println("Valor mínimo de float: " + Float.MIN_VALUE);
		float comaF = 100;
		System.out.println("Este es un número float: " + comaF);
		
		System.out.println("--------double--------");
		System.out.println("Tamaño de double en bits: " + Double.SIZE);
		System.out.println("Cantidad de bytes en double: " + Double.BYTES);
		System.out.println("Valor máximo de double: " + Double.MAX_VALUE);
		System.out.println("Valor mínimo de double: " + Double.MIN_VALUE);
		double comaD = 100000.10E3;
		System.out.println("Este es un número double: " + comaD);
		
		System.out.println("--------boolean--------");
		boolean estado = true;
		System.out.println("Esto es un valor boolean: " + estado);
		System.out.println("Boolean true: " + Boolean.TRUE);
		System.out.println("Boolean false: " + Boolean.FALSE);
		
		var edad =10;
		// var adulto = edad >= 18;
		
		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("No eres mayor de edad");
		}
	}
}
