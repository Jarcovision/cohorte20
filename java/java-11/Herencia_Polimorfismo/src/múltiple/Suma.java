package mĂșltiple;

public class Suma implements OperacionesAritmĂ©ticas, Operaciones{
	private double a;
	private double b;
	public Suma(double a, double b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double sumar() {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public double restar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void mensajes() {
		System.out.println("Hola, yo soy la suma.");
		// TODO Auto-generated method stub	
	}

}
