import java.util.Scanner;

/**
*
*	Ejercicio 4, Programa que calcule el salario semanal de un trabajador 
* teniendo en cuenta que las horas ordinarias (40 primeras horas de trabajo) 
* se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros la hora.
* 
*	Nombre del archivo: Ejercicio4.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio4 {
	public static void main(String[] args) {
		
		//Definimos la clase "datos" para almacenar la respuesta.
		Scanner datos = new Scanner(System.in);
		
		//Definimos los precios a los que se pagan la hora.
		int pagos1 = 12;
		int pagos2 = 16;
		
		//Pedimos al usuario que introduzca los datos.
		System.out.print("Introduzca el número de horas trabajadas esta semana: ");
		int horas = datos.nextInt();
		
		if (horas < 40) {
			
			//Multiplicamos las horas por el precio correspondiente. 
			int resultado = horas * pagos1;
			System.out.print("El sueldo semanal que le corresponde es de: " + resultado + " Euros");
			
		} else {
			/* Si las horas son mas de 40, restamos horas - 40. El resultado
			 * lo multiplicamos por el precio2 y luego las 1º 40 horas por precios 1.
			 * Y el resultado final es la suma del resultado 1 + el resultado 2
			 */
			int y = horas - 40;
			int r1 = y * pagos2;
			int r2 = 40 * pagos1;
			int r3 = r1 + r2;
			
			System.out.print("El sueldo semanal que le corresponde es de: " + r3 + " Euros");
			
		}
		
	}
}
