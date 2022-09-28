package ejerciciosbasicos;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Escribir un programa que le pida dos números al usuario. A continuación, debe mostrar la suma, la resta, la multiplicación y la división de ambos números. Debe mostrarse el resultado de cada operación en una línea distinta.
		double num1, num2, suma, resta, multi, div;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Introduce el primer número: ");
		num1 = scan.nextDouble();
		System.out.println("Introduce el segundo número: ");
		num2 = scan.nextDouble();
		
		suma = num1+ num2;
		resta = num1 - num2;
		multi = num1 * num2;
		div = num1 / num2;
		
		System.out.println("Resultados: ");
		System.out.println("Suma: " + suma);
		System.out.println("Resta: " + resta);
		System.out.println("Multiplicación: " + multi);
		System.out.println("División: " + div);
		
		
	}

}
