package mis_clases.excepciones.operación;

public class División {
private float numerador;
private float denominador;

public División(float numerador, float denominador) throws OperaciónExcepción {
	if (denominador == 0) {
		throw new OperaciónExcepción("El denominador es cero.");
	}	
	this.numerador = numerador;
	this.denominador = denominador;
}
public void visualizarDiv() {
	System.out.println("Resultado de la división es " + this.numerador/this.denominador);
}
}
