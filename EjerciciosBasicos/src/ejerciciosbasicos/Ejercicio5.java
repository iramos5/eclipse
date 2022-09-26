package ejerciciosbasicos;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Diseñar una aplicación que calcule la longitud y el área de una circunferencia. Para ello, el usuario debe introducir el radio, que puede contener decimales. Usa Math.PI para tomar el valor de PI.
		double radio, longitud, area;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Introduce el radio: ");
		radio = scan.nextDouble();
		
		longitud = 2 * Math.PI * radio;
		area= Math.PI * (radio * radio);
				
		System.out.println("La longitud es de: " + longitud);
		System.out.println("El área es de: " + area);
	}

	
	


}
