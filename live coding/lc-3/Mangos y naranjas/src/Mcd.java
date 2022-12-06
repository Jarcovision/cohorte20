import java.util.Scanner;

public class Mcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Introduce el primer número.");
		int num1 = sc1.nextInt();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Introduce el primer número.");
		int num2 = sc2.nextInt();
		
		int res = MCD(num1, num2);
		
		System.out.println("El máximo común divisor es: " + res);
	}
		
		//Función para calcular el MCD
		public static int MCD(int num1, int num2) {
			
			int valor1 = Math.max(num1,  num2);
			int valor2 = Math.min(num1,  num2);
			
			int resultado = 0;
			
			do {
				resultado = valor2;
				valor2 = valor1 % valor2;
				valor1 = resultado;
				
			} while (valor2 != 0);
			
			return resultado;
		}
		
	//Método
	public int mangos() {
		int numMangos = 0;
		numMangos = valor1/numCajas();
		return 0 =
		
			
			
			
			
		
		
	}

}
