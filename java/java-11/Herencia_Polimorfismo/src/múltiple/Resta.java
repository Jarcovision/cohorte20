package múltiple;

public class Resta implements OperacionesAritméticas, Operaciones{
	private double pValor;
	private double sValor;
	public Resta(double pValor, double sValor) {
		this.pValor = pValor;
		this.sValor = sValor;
	}
	@Override
	public double sumar(); {
		return 0;
	}
	
	@Override
	public double restar(); {
		return pValor - sValor;
	}
	
	@Override
	public void mensajes(); {
		System.out.println("Valores " + pValor + " " + sValor);
	}
}


