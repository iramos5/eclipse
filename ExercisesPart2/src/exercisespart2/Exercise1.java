package exercisespart2;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		final int YEAR = 2022;
		int age, bornIn;
		
		System.out.print("How old are you this year? ");
		age = keyboard.nextInt();
		bornIn = YEAR - age;
		System.out.println("I think you were born in " + bornIn);
		keyboard.close();

	}

}

