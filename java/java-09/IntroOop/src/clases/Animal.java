package clases;

public class Animal {
	private String raza;
	private String nombre;
	private int edad;
	
	public Animal(String nuevoNombre) { // Constructor
		nombre =  nuevoNombre;
	}
	
	public String getRaza() {
		return raza;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int nuevaEdad) {
		edad = nuevaEdad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Animal() { //Nuevo objeto VACÍO
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
