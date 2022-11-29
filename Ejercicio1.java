import java.util.Scanner;

/**
*
*	Ejercicio 1,  Programa que pida por teclado un día de la semana y que diga qué 
* asignatura toca a primera hora ese día.
* 
*	Nombre del archivo: Ejercicio1.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio1 {
	public static void main(String[] args) {
		
		//Definimos la clase datos
		Scanner datos = new Scanner(System.in);
		
		System.out.print("Introduzca un dia de la semana: ");
		String dia = datos.next();
		
		switch (dia) {
			
			case "Lunes":
			case "Miercoles":
			
				System.out.print("Sistemas Informáticos.");
			
			break;
			
				case "Martes":
				case "Jueves":
				case "Viernes":
				
				System.out.print("Programación.");
			
			break;
			
			default:
			
				System.out.print("No hay clases estos días.");
			
			}
		
	}
}
