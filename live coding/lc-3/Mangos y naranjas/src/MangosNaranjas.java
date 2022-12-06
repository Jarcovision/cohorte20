import java.util.Scanner;

public class MangosNaranjas extends Main {
	
	Scanner entrada = new Scanner(System.in);

	int mangos;
	int naranjas;
	
	public MangosNaranjas(int mangos, int naranjas) {
		this.mangos = mangos;
		this.naranjas = naranjas;
	 }
	 
	 public  int calcularMcd(int mangos, int naranjas) {
		 
	public static int numCajas() {
		
		int valor1 = 0;
		int valor2 = 0;
		
		//int valor1 = Math.max(num1,  num2);
		//int valor2 = Math.min(num1,  num2);
			
			int resultado = 0;
			
			do {
				resultado = valor2;
				valor2 = valor1 % valor2;
				valor1 = resultado;
				
			} while (valor2 != 0);
			
			return resultado;
		 
		 
		//Método
		public int mangos() {
			int numMangos = 0;
			numMangos = mangos/numCajas();
			return 0;
		}
		
		public int naranjas() {
			int numNaranjas = 0;
			numNaranjas = naranjas/numCajas();
			return numNaranjas;
		}	 
		 
	 }
	
	public void imprimir() {
		int cajas = numCajas();
		System.out.println("El número de cajas es: " + cajas);
		System.out.println("El número de mangos es: " + mangos());
		System.out.println("El número de naranjas es: " + naranjas());
	}

}