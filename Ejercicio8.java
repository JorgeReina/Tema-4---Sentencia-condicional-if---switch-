import java.util.Scanner;

/**
*
*	Ejercicio 8,  Realiza un programa que calcule la media de tres notas.
* 
*	Nombre del archivo: Ejercicio8.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio8 {
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Introduzca la nota de tres exámenes (Ej: 5 7 9): ");
		int nota1 = datos.nextInt();
		int nota2 = datos.nextInt();
		int nota3 = datos.nextInt();
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		if ((media > 0) && (media < 5)) {
			
			System.out.printf("La nota es un Insuficiente, y la media es %s", media);
			
		} else if ((media >= 5) && (media < 6)) {
			
			System.out.printf("La nota es un Suficiete, y la media es %s", media);
			
		} else if ((media >= 6) && (media < 7)) {
			
			System.out.printf("La nota es un Bien, y la media es %s", media);
			
		} else if ((media >= 7) && (media < 9)) {
			
			System.out.printf("La nota es un Notable, y la media es %s", media);
			
		} else if ((media >= 9) && (media == 10)) {
			
			System.out.printf("La nota es un Sobresaliente, y la media es %s", media);
		} else {
			
			System.out.print("Introduce una nota correcta.");
		
		}
		
	}
}
