import java.util.Scanner;

/**
*
*	Ejercicio 17,  Escribe un programa que diga cuál es la última cifra
* de un número entero introducido por teclado.
* 
*	Nombre del archivo: Ejercicio17.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio17 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		System.out.print("Por favor, introduce un número: ");
		int numero = datos.nextInt();
		
		int ultimaCifra = numero %10;
		
		System.out.printf("La ultima cifra del número es: %s", ultimaCifra);
		
	}
}
