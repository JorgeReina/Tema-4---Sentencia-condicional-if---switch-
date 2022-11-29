import java.util.Scanner;

/**
*
*	Ejercicio 7,  Realiza un programa que calcule la media de tres notas.
* 
*	Nombre del archivo: Ejercicio7.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio7 {
	public static void main(String[] args) {
		
		//Definimos la clase.
		Scanner datos = new Scanner(System.in);
		
		//Pedimos al usuario que introduzca las notas.
		System.out.println("Introduzca la nota de tres exámenes (Ej: 5 7 9): ");
		int nota1 = datos.nextInt();
		int nota2 = datos.nextInt();
		int nota3 = datos.nextInt();
		
		//Definimos la formula para calcular la meadia
		double media = (nota1 + nota2 + nota3) / 3;
		
		System.out.printf("La nota media es %s", media);
		
	}
}
