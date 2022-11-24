package ejecutar;

import clases.Animal; // nombreDelPaquete.nombreDeLaClase

public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal miAnimal = new Animal("Trapo");
		miAnimal.setEdad(1);
		System.out.print("Su nombre es: " + miAnimal.getNombre());
		System.out.print(", es un gato");
		System.out.println(" y tiene " + miAnimal.getEdad() + " año de edad.");
	}

}
