package oop;

public class Submarino { // se refiere a subMenu

	 void submenu() {
		Menu m = new Menu();
		OperacionesAritmeticas oa = new OperacionesAritmeticas();
		do {

			switch (m.subMenuOp()) {
			case 1: {
				System.out.println(oa.add());
				break;
			}
			case 2: {
				System.out.println(oa.substract());
				break;
			}
			case 3: {
				System.out.println(oa.mult());
				break;
			}
			case 4: {
				System.out.println(oa.divide());
				break;	
			}
			case 5: {
				System.out.println("Soy la opción 5");
				break;	
			}
			default:
				break;
			}
			
		} while (opcion != 7);
	}	

			
public static void main(String[] args) {

}
	
}
		

