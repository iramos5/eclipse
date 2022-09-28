package ejerciciosbasicos;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Pedir al usuario su edad y mostrar la que tendrá el próximo año.
		int edad;
		
		Scanner scan = new Scanner (System.in); 
		System.out.println("Introduce tu edad: ");
		edad = scan.nextInt ();
		edad = edad + 1;
		System.out.println("El año que viene tendrás " + edad + " años");
	}

}
