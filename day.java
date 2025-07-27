package ejecios;
import java.util.Scanner;

public class day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        String day = "";
        System.out.println("Introduce un dia de la semana");
         day = sc.next();
        
        switch(day){
            case "Monday":
            case "Tuesday":
            case "Wenesday":
            case "thursday":
            case "friday":
                System.out.println("Es un dia laboral");
                break;
            case "saturday":
            case "sunday":
                System.out.println("Es un dia festivo");
            default:
                System.out.println("Introduce un dia de la semana");
	
        	}

		}
	}
