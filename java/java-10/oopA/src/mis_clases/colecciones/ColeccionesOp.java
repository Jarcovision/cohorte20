package mis_clases.colecciones;
import java.util.*;

public class ColeccionesOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
		  	       
        list.add("A");
        list.add(null);
        list.add("C");
        list.add("D");
        
        System.out.println("ArrayList: " + list.get(0)); //Se imprime el valor asociado al índice
        System.out.println("ArrayList: " + list.get(3));
        System.out.println("ArrayList: " + list);


        
        HashMap<Integer, String> hm  = new HashMap<Integer, String>();  
       
        hm.put(1, "A");
        hm.put(2, "B");
        hm.put(3, "C");
    //    hm.put(3, "D");
        hm.put(4, "D");
        hm.put(5, "D");
        hm.put(6, "D");
        hm.put(9, "E");

          
        System.out.println("HashMap: " + hm.get(1)); 
        System.out.println("HashMap: " + hm.get(9)); //Se imprime el valor asociado a la llave
        System.out.print("HashMap: " + hm);

	}

}
