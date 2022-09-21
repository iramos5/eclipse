package ejerciciosbasicos;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Diseña un programa que pida un número al usuario y a continuación lo muestre.
		int numero;
		
		Scanner scan = new Scanner (System.in); 
		System.out.println("Introduce un número: ");
		numero = scan.nextInt ();
		System.out.println("El número introducido es: " + numero);
	}

}
