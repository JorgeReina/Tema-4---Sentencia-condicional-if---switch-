import java.util.Scanner;

/**
*
*	Ejercicio 13,  Escribe un programa que ordene tres números
* enteros introducidos por teclado.
* 
*	Nombre del archivo: Ejercicio13.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio13 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		System.out.println("ORDENAR DE MAYOR A MENOR");
		System.out.println();
		System.out.print("Por favor, introduce tres numeros enteros: ");
		int n1 = datos.nextInt();
		int n2 = datos.nextInt();
		int n3 = datos.nextInt();
		
		if ((n1 > n2) && (n1 > n3)) {
			
			if (n2 > n3) {
				System.out.printf("El orden es el siguiente: %s %s %s", n1, n2, n3);
			} else {
				System.out.printf("El orden es el siguiente: %s %s %s", n1, n3, n2);
			}
			
		} else if ((n2 > n1) && (n2 > n3)) {
			
			if (n1 > n3) {
				System.out.printf("El orden es el siguiente: %s %s %s", n2, n1, n3);
			} else {
				System.out.printf("El orden es el siguiente: %s %s %s", n2, n3, n1);
			}
			
		} else if (n3 > n1) {
			
			if (n1 > n2) {
				System.out.printf("El orden es el siguiente: %s %s %s", n3, n1, n2);
			} else {
				System.out.printf("El orden es el siguiente: %s %s %s", n3, n2, n1);
			}
			
		} else {
			
			System.out.print("Introduce datos validos.");
			
		}
		
	}
}
