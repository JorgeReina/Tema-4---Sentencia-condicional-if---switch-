import java.util.Scanner;

/**
*
*	Ejercicio 18,  Escribe un programa que diga cuál es la primera
* cifra de un número entero introducido por teclado. Se permiten 
* números de hasta 5 cifras.
* 
*	Nombre del archivo: Ejercicio18.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio18 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		System.out.print("Por favor, introduce un número: ");
		int n = datos.nextInt();
		
		int primerNumero = 0;
		
		if (n < 10) {
			
			primerNumero = n;
			
		}else if ((n >= 10) && (n < 100)) {
			
			primerNumero = n / 10;
			
		}else if ((n >= 100) && (n < 1000)) {
			
			primerNumero = n / 100;
			
		}else if ((n >= 1000) && (n < 10000)) {
			
			primerNumero = n / 1000;
			
		}else {
			
			System.out.print("Introduce un valor correcto");
			
		}
		
		System.out.printf("La primera cifra es: %s", primerNumero);
		
	}
}
