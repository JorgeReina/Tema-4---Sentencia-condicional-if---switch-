import java.util.Scanner;

/**
*
*	Ejercicio 19,  Realiza un programa que nos diga cuántos dígitos
* tiene un número entero que puede ser positivo o negativo.
* Se permiten números de hasta 5 dígitos.
* 
*	Nombre del archivo: Ejercicio19.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio19 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		//Pedimos al usuario que introduzca un número.
		System.out.print("Por favor, introduce un número: ");
		
		//La clase 'Math.abs' nos permite saber el los digitos totales.
		int n = Math.abs(datos.nextInt());
		int digitos = 0;
		
		//Definimos los if donde se indica los digitos del número.
		if (n < 10) {
			
			digitos = 1;
			
		} else if ((n >= 10) && (n < 100)) {
			
			digitos = 2;
			
		} else if ((n >= 100) && (n < 1000)) {
			
			digitos = 3;
			
		} else if ((n >= 1000) && (n < 10000)) {
			
			digitos = 4;
			
		} else if (n >= 10000) {
			
			digitos = 5;
			
		} else {
			
			System.out.print("Introduce un valor correcto.");
			
		}
		
		System.out.printf("El número introducido tiene: %s digitos.", digitos);
		
	}
}
