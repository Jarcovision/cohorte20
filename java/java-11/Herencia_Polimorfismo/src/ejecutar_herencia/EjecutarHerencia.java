package ejecutar_herencia;

import herencia.*;

public class EjecutarHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Padre p = new Padre("José", "Iztapalacra");
		p.mostrarDatos();
		
		Hija h = new Hija("Dora", "CDMX", 9);
		h.mostrarDatos();
		h.mostrarDatos("Exploradora");
		Hija h1 = new Hija("Lola", "Pantitlán", 17);
		h1.mostrarDatos("Trailera");
	}

}
 