package mis_clases.excepciones.ejecuta;

import mis_clases.excepciones.operación.División;
import mis_clases.excepciones.operación.OperaciónExcepción;

public class TestExcepción {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			División d = new División(10, 3);
			d.visualizarDiv();
		} catch (OperaciónExcepción e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Puedes continuar.");
	}

}
