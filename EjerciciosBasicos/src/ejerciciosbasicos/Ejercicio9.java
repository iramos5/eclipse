package ejerciciosbasicos;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Realiza un conversor de pesetas a euros. Para ello, pídele al usuario que te introduzca el valor en pesetas y, a posteriori, debes mostrarle el resultado de la conversión.
		double pesetas, euros;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Introduce las pesetas: ");
		pesetas = scan.nextDouble();
		
		euros = 166.386;
		euros = pesetas / euros;
		
		System.out.println("El valor de " + pesetas + " es de " + euros + " euros");
	}

}
