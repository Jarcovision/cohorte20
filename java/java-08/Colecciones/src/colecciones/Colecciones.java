package colecciones;

import java.util.*; // así se agregan las liberías necesarias

public class Colecciones {
	public static void main(String[] args) {
		
		System.out.println("---ArrayList---");
		// List - ArrayList
		//Valores de un mismo tipo

		List<String> miArray = new ArrayList<String>();
		
		miArray.add("GDL");
		miArray.add("CDMX");
		miArray.add("MTY");
		miArray.add(1, "Manzanillo");
		String valorQuitado = miArray.remove(0);
		
		System.out.println(miArray);
		System.out.println(valorQuitado);
		System.out.println(miArray.size());// .size() == .length
		imprimir(miArray);
		
		System.out.println("--- HashSet ---");
		// Set es la más rapida de todas y no permite elementos duplicados
		// NO maneja índices
		// NO guarda los elementos en un orden aparente, nisiquiera en el que se declaran
		Set<String> miSet = new HashSet<String>();
		
		miSet.add("Juan");
		miSet.add("Memo");
		miSet.add("Luis");
		miSet.add("Paco");
		miSet.add("Juan"); // como es duplicado, no se imprimirá
		System.out.println(miSet);
		imprimir(miSet);
		
		System.out.println(miSet.contains("María"));// false
		System.out.println(miSet.contains("Memo"));// true
		
		System.out.println("--- HashMap ---");
		
		Map<String, Integer> miMap = new HashMap<String, Integer>();
		miMap.put("Valor 1", 56);
		miMap.put("Valor 2", 342);
		miMap.put("VAlor 3", 56);// Se pueden duplicar los valores, pero NO las llaves
		System.out.println(miMap);
		System.out.println(miMap.get("Valor 2"));
		System.out.println(miMap.keySet());// imprime un aray con todas las llaves
		
		for(String llave : miMap.keySet()) {
			System.out.println(llave + " : " + miMap.get(llave));
		}

	}

	public static void imprimir(Collection coleccion) {
		for(Object elemento : coleccion ) {
			System.out.println("Elemento = " + elemento);
		}
	}
	
}
