package ejerciciosbasicos;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Escribir un programa que le pida al usuario su nombre, dirección y teléfono. Guarda cada dato en variables distintas. A continuación, muestra los datos de la siguiente forma (en rojo serían los datos introducidos por el usuario):
		// Nombre: Elena
		// Dirección: Calle Inventada
		// Teléfono: 987654321
		String nombre, direccion, telefono;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Introduce tu nombre: ");
		nombre = scan.next();
		System.out.println("Introduce tu dirección: ");
		direccion = scan.next();
		System.out.println("Introduce tu teléfono: ");
		telefono = scan.next();
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Dirección: " + direccion);
		System.out.println("Teléfono: " + telefono);
	}

}
