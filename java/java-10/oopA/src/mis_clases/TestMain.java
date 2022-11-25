package mis_clases;

import mis_clases.clase_2.clase_2;
import mis_clases.clases_publicas.clase_3;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clase_3 nc3 = new clase_3();
		nc3.setValor(234);
		
		//ClasePadre cp = new ClasePadre();
		clase_2 c2 = new clase_2(123, "a", "b");
		c2.visualizar();
		c2.visualizar2();
	}

}
