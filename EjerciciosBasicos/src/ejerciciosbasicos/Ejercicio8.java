package ejerciciosbasicos;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Escribe un programa que pida al usuario su nombre y su edad y muestre por pantalla el siguiente mensaje: “Hola Juanito, tienes 21 años, ¡qué mayor eres!”. Los datos en rojo son los datos introducidos por el usuario.
		String nombre;
		int edad;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Introduce tu nombre: ");
		nombre = scan.next();
		System.out.println("Introduce tu edad: ");
		edad = scan.nextInt();
		
		System.out.println("Hola " + nombre + " tienes " + edad + " años, ¡qué mayor eres!");
	}

}
