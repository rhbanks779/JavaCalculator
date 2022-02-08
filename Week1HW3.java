package homework;
import java.util.Scanner;

public class Week1HW3 {
	
	
	
	 static double addition(double x, double y) {
		return x + y;
		
	}
	
	 static double subtraction(double x, double y) {
		return x - y;
	}
	
	 static double multiplication(double x, double y) {
		return x * y;
	}
	
	 static double division(double x, double y) {
		return x / y;
	}
	
	

	public static void main(String[] args) {
		 			
			double input1= 0;
			double input2 = 0;
			int input3 = 0;
			double answer = 0;
				
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter 1st number to perform calculation: ");
			input1= scan.nextDouble();
				
			System.out.println("Enter 2nd number to perform calulation: ");
			input2= scan.nextDouble();
				
			System.out.println("Enter number 1 to add, 2 to subract, 3 to multiply, 4 to divide, 5 to exit: ");
			input3= scan.nextInt();
					
		
		
		switch(input3) {
		case 1: answer = addition(input1, input2);
		break;
		case 2: answer = subtraction(input1, input2);
		break;
		case 3: answer = multiplication(input1, input2);
		break;
		case 4: answer = division(input1, input2);
		break;
		case 5: System.exit(0);
		break;
		default: System.out.println("Invalid Entry, Try Again!");
		}
		System.out.println(answer);
	}

}
