package múltiple;

public class TestMúltiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Suma suma = new Suma(5, 5);
		OperacionesAritméticas oa = new Suma(10,5);
		Operaciones o = new Suma(3, 2);
		
		Resta resta = new Resta(10, 5);
		OperacionesAritméticas oar = new Suma(10,5);
		Operaciones or = new Resta(3, 2);
		
		o.mensajes();
		System.out.println(oa.sumar());
		System.out.println(suma.sumar());
		suma.mensajes();
		
		resta.mensajes();
		System.out.println(oar.restar());
		System.out.println(resta.restar());
		or.mensajes();
		

	}

}
