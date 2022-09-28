package ejerciciosbasicos;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Escribir una aplicación que pida el año actual y el año de nacimiento del usuario. Debe calcular su edad.
		int actual;
		int nacimiento;
		int edad;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Introduce el año actual: ");
		actual = scan.nextInt();
		System.out.println("Introduce tu año de nacimiento: ");
		nacimiento = scan.nextInt();
		
		edad = actual - nacimiento;
		
		System.out.println("Tu edad es de " + edad + " años");
	}

}
