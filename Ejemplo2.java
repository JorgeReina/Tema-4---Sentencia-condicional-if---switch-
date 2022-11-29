import java.util.Scanner;

/**
*
*	Ejemplo 2, Programa que muestra un ejemplo de la sentencia if.
* 
*	Nombre del archivo: Ejemplo2.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejemplo2 {
	public static void main(String[] args) {
		
		//Definimos nuestra clase.
		Scanner idioma = new Scanner(System.in);
		
		String respuesta;
		
		
		//Preguntamos al usuario.
		System.out.println("¿Cuál es el idioma oficial de Italia?");
		respuesta = idioma.next();
		
		//Definimos la setencia "if" para comprobar la respuesta.
		if (respuesta.equals("Italiano")) {
			System.out.println("La respuesta es correcta.");
		}else {
			System.out.println("Lo siento, la respuesta es incorrecta.");
		}
		
	}
}
