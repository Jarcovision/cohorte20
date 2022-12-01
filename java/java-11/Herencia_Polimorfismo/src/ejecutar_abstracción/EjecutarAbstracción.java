package ejecutar_abstracción;

import polimorfismo.*;
import polimorfismo.FigurasGeométricas;

public class EjecutarAbstracción {
	public static void main(String[] args ) {
		FigurasGeométricas t = new Triángulo();
		FigurasGeométricas c = new Cuadrado();
		FigurasGeométricas circ = new Círculo();
		FigurasGeométricas r = new Rectángulo();


		t.pedirDatos ();
		t.área();
		t.visualizar();

		c.pedirDatos ();
		c.área();
		c.visualizar();
		
		circ.pedirDatos ();
		circ.área();
		circ.visualizar();
		
		r.pedirDatos ();
		r.área();
		r.visualizar();
	}
}
