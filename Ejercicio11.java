import java.util.Scanner;

/**
*
*	Ejercicio 11,  Escribe un programa que dada una hora determinada (horas y minutos),
* calcule los segundos que faltan para llegar a la medianoche.
* 
*	Nombre del archivo: Ejercicio11.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio11 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);

		//Pedimos al usuario que introduzca los datos.
		System.out.print("Por favor, introduce una hora y minutos deseados(En digital): ");
		int hora = datos.nextInt();
		int minutos = datos.nextInt();
		
		int mediaNoche = 24;
		
		int opSegundos = minutos * 60;
		int op = (((mediaNoche - hora) * 60) * 60) + opSegundos;
		
		if (hora < 24) {
			
			if (minutos < 30) {
				
				System.out.printf("Los segundos que faltan para llegar a medianoche son: %s segundos.", op);
				
			} else {
				
				System.out.printf("Los segundos que faltan para llegar a medianoche son: %s segundos.", op - 3600);
				
			}
			
			
		} else {
			
			System.out.printf("Introduce datos validos");
			
		}
		
	}
}
		
		
