package exercisespart2;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args ) {
		//What would be the final output from the program below if the user entered the number 10? :
		Scanner keyboard = new Scanner(System.in);
		int num1, num2;
		num2 = 6;
		System.out.print("Enter value ");
		num1 = keyboard.nextInt(); // num1=10
		num1 = num1 + 2; // num1 = 12
		num2 = num1 / num2; // num2 = 12/6 = 2
		System.out.println("result = " + num2); 
		// el resultado seria 2 porque 10+2=12, y 12/6=2
		}

}
