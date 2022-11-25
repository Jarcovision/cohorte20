package ejecutar;

import clases.Animal; // nombreDelPaquete.nombreDeLaClase

public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal miAnimal = new Animal("Trapo"); //Constructor
		miAnimal.setEdad(1);
		System.out.print("Su nombre es: " + miAnimal.getNombre());
		System.out.print(", es un gato");
		System.out.println(" y tiene " + miAnimal.getEdad() + " año de edad.");
	
		Animal otroAnimal;
		otroAnimal = new Animal(); //Se crea el nuevo objeto VACÍO
		otroAnimal.setNombre("Mafio");
		otroAnimal.setEdad(4);
		System.out.print("Mi primer gato fue: " + otroAnimal.getNombre()); 
		System.out.print(" y tenía " + otroAnimal.getEdad() + " años.");
	}

}
