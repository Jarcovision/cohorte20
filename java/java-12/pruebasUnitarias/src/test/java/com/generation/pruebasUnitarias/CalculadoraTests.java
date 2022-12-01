package com.generation.pruebasUnitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Clase de prueba de la calculadora")
public class CalculadoraTests {

	Calculadora calc = new Calculadora(true);
	
	@Test
	@DisplayName("Método que prueba si la suma es correcta")
	void pruebaSuma() {
		assertEquals(11, calc.suma(9, 2));
	}
	
	@Test
	@DisplayName("Probar si la calculadora está encendida")
	void pruebaIsOn() {
		assertTrue(calc.isOn());
	}
	
	@Test
	@DisplayName("Método que prueba si la división es correcta")
	void pruebaDiv() {
		assertEquals(4.5, calc.division(9, 2));
	}
}
