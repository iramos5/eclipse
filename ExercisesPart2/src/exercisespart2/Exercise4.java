package exercisespart2;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		//The program below was written in an attempt to swap the value of two variables. However it does not give the desired result:
		
		// declare variables
		Scanner keyboard = new Scanner(System.in);
		int x, y, aux;
		// enter values
		System.out.print("Enter value for x ");
		x = keyboard.nextInt();
		System.out.print("Enter value for y ");
		y = keyboard.nextInt();
		// code attempting to swap two variables
		aux = x;
		x = y;
		y = aux;
		//display results
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		// Can you see why the program doesn’t do what we hoped?
		// --- Yes. We needed the Scanner (import and declare) 
		
		// What would be the actual output of the program?
		// --- 
		
		
		// How could you modify the program above so that the values of the two variables are swapped successfully?

		}


}
