package com.generation.pruebasUnitarias;

public class Main {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora(true);

		System.out.println(calc.suma(2, 3));
		System.out.println(calc.division(50, 2));
	}

}
