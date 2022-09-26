package ejerciciosbasicos;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Escribe un programa en el que declares una constante IVA de valor igual a 21. A continuación, pídele un precio al usuario (recuerda que los precios contienen decimales) y calcula cuál será el precio final con el IVA aplicado.
		final int IVA = 21;
		double precioInicial;
		double precioIVA;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un precio: ");
		precioInicial = scan.nextDouble();
		
		precioIVA = precioInicial * IVA / 100 + precioInicial;
		
		// Mostramos el resultado por pantalla
		System.out.println("El precio con el IVA aplicado es: " + precioIVA);
	}

}
