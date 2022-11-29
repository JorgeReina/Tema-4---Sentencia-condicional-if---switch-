import java.util.Scanner;

/**
*
*	Ejercicio 14,  Realiza un programa que diga si un número introducido
* por teclado es par y/o divisible entre 5.
* 
*	Nombre del archivo: Ejercicio14.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio14 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		//Pedimos al usuario que introduzca un número.
		System.out.print("Por favor, introduce un número: ");
		int n = datos.nextInt();
		
		//Definimos las operaciones.
		boolean par = n % 2 == 0;
		
		boolean div5 = n % 5 == 0;
		
		//Mostramos el resultado por pantalla.
		System.out.printf("¿Es %s par?: %s", n, par);
		System.out.println();
		System.out.printf("¿Y divisible entre 5?: %s", div5);
		
	}
}
