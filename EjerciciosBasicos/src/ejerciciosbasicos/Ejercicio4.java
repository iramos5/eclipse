package ejerciciosbasicos;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Crear una aplicación que calcule la media aritmética de dos notas enteras. Hay que tener en cuenta que la nota media puede tener decimales.
		double nota1, nota2, media;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Introduce la primera nota: ");
		nota1 = scan.nextDouble();
		System.out.println("Introduce la segunda nota: ");
		nota2 = scan.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		System.out.println("La nota media es de: " + media);
		
		
	}

}
