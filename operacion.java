package ejecios;
import java.util.Scanner;
public class operacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
	double number1 = 0 ;
	double number2 = 0;
	
	System.out.println("with the fisrt number");
	number1 = keyboard.nextInt();
	System.out.println("with the second number");
	number2 = keyboard.nextInt();
	System.out.println("with the fisrt number" +(number1 + number2 ));
	System.out.println("with the fisrt number" +(number1 - number2 ));
	System.out.println("with the fisrt number" +(number1 * number2 ));
	System.out.println("with the fisrt number" +(number1 / number2 ));
	System.out.println("with the fisrt number" +(number1 % number2 ));
	}

}
