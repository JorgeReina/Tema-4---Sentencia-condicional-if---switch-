import java.util.Scanner;

/**
*
*	Ejercicio 5, Programa que resuelve una ecuación de primer grado
* (del tipo ax+b = 0).
* 
*	Nombre del archivo: Ejercicio5.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio5 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Este programa resuelve ecuaciones de primer grado del tipo 'ax + b = 0'");
		System.out.print("Introduzca el valor de a: ");
		int a = datos.nextInt();
		
		System.out.print("Introduzca el valor de b: ");
		int b = datos.nextInt();
		
		if (a >= 0) {
			
			double x = b ;
			System.out.print("X = " + x);
			
		} else {
			
			System.out.print("Esta ecuación no tiene solución real.");
			
		}
		
	}
}
