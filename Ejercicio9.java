import java.util.Scanner;

/**
*
*	Ejercicio 9,  Realiza un programa que resuelva una ecuación de 
* segundo grado (del tipo ax2 + bx + c = 0).
* 
*	Nombre del archivo: Ejercicio9.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio9 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		//Pedimos al usuario que introduzca los valores de a b y c.
		System.out.println("Por favor, introduce el valor de a, de b y de c(Ej:4 7 2).");
		int a = datos.nextInt();
		int b = datos.nextInt();
		int c = datos.nextInt();
		
		//Definimos las operaciones.
		double cuadrado = Math.pow(b,2);
		double operacion = cuadrado - 4 * a * c;
		double raiz = Math.sqrt(operacion);
		double positivo = (-b + operacion) / (2 * a);
		double negativo = (-b - operacion) / (2 * a);
		
		//A traves de la sentencia if mostramos los resultados.
		if ( a == 0 ) {
			
			System.out.println("Esta ecuacion es de primer grado.");
			
		}else if ( operacion < 0) {
			
			System.out.println("No tiene solución.");
			
		} else {
			
			System.out.printf("X puede ser los siguientes resulatados, x1= %s y X2= %s", positivo, negativo);
			
		}
		
	}
}
