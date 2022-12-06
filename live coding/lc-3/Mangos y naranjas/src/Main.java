import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		
		public int mangos;
		public int naranjas;
		
		System.out.println("Ingrese cantidad de mangos");
		mangos = entrada.nextInt();
		
		System.out.println("Ingrese cantidad de naranjas");
		naranjas = entrada.nextInt();

		
		//Instancia
		MangosNaranjas mangosNaranjas = new MangosNaranjas(mangos, naranjas);
			mangosNaranjas.imprimir();

		System.out.println("El número de mangos es: " + mangos + " y el número de naranjas es: " + naranjas);

	}
	
		


}
