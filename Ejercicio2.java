import java.util.Scanner;

/**
*
*	Ejercicio 2, Programa que pide una hora por teclado y que muestre luego buenos
* días, buenas tardes o buenas noches según la hora.
* 
*	Nombre del archivo: Ejercicio2.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio2 {
	public static void main(String[] args) {
		
		//Definimos la clase "n" donde vamos a guardar la respuesta.
		Scanner n = new Scanner(System.in);
		
		//Pedimos al usuario que introduzca la respuesta.
		System.out.print("Introduzca una hora entra las '0-24': ");
		int hora = n.nextInt();
		
		//Definimos las sentencias "if" cada una con su parámetro y respuesta.
		if ((hora >= 6) && (hora <= 12 )) {
			
			System.out.println("Buenos Días.");
			
		}
		
		if ((hora >= 13) && (hora <= 20 )) {
			
			System.out.println("Buenos Tardes.");
			
		}
		
		if ((hora >= 21) || (hora <= 5)) {
			
			System.out.print("Buenos Noches.");
			
		}
		
	}
}

