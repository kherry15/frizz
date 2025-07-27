package ejecios;
import java.util.Scanner;

public class decomposition {

	public decomposition() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 int number =0;
	        System.out.print("Introduce un número de 3 cifras: ");
	         number = scanner.nextInt();
		
		 if (number >= 100 && number <= 999) {
	           

	            int centenas = number / 100;
	            int decenas = (number / 10) % 10;
	            int unidades = number % 10;

	            System.out.println("Centena: " + centenas);
	            System.out.println("Decena : " + decenas);
	            System.out.println("Unidad : " + unidades);
	        } else {
	            System.out.println("El número no tiene 3 cifras.");
	        }
		
		
		
	}

}
