package herencia;

public class Hija extends Padre {
	private int edad;

	public Hija(String nombre, String domicilio, int edad) {
		super(nombre, domicilio);
		this.edad = edad;
	}
	public void mostrarDatos() {
		System.out.println("El nombre es: " + nombre + ", " +
							"su domicilio es: " + domicilio + " " +
							"y su edad es: " + edad);
	}
	public void mostrarDatos(String apellido) {
		System.out.println("Su nombre completo es: " + nombre + " " +
							apellido + ", vive en " + domicilio + 
							" y tiene " + edad + " años.");
	}
	
}
