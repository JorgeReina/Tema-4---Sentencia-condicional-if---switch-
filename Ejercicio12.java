import java.util.Scanner;

/**
*
*	Ejercicio 12,  Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas 
* que se imparten en el curso. Cada pregunta acertada sumará un punto. 
* El programa mostrará al final la calificación obtenida. Pásale el minicuestionario
* a tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos 
* en las diferentes asignaturas del curso.
* 
*	Nombre del archivo: Ejercicio12.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio12 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		//Definimos la variable para almacenar los puntos.
		int puntuacion = 0;
		
		//Definimos los resultados a las preguntas.
		int resultado1 = 2;
		int resultado2 = 25;
		boolean resultado3 = true;
		boolean resultado4 = false;
		boolean resultado5 = false;
		boolean resultado6 = true;
		boolean resultado7 = false;
		boolean resultado8 = true;
		boolean resultado9 = true;
		boolean resultado10 = false;
		
		//Realizamos la pregunta y valoramos el resultado para la puntuación.
		System.out.println("¿cuanto es la suma de 1 + 1?");
		int r1 = datos.nextInt();
		
		if ( r1 == resultado1 ) {
			
			puntuacion = puntuacion +1;
			
		}
		
		System.out.println("¿cuanto es 5 * 5?");
		int r2 = datos.nextInt();
		
		if ( r2 == resultado2 ) {
			
			puntuacion = puntuacion +1;
			
		}
		
		System.out.println("¿Esta expresión es correcta: x = x+1? (true o false)");
		boolean r3 = datos.nextBoolean();
		
		if ( r3 == resultado3 ) {
			
			puntuacion = puntuacion +1;
			
		}
		
		System.out.println("¿Un String puede almacenar enteros? (true o false)");
		boolean r4 = datos.nextBoolean();
		
		if ( r4 == resultado4 ) {
			
			puntuacion = puntuacion +1;
			
		}
		
		System.out.println("¿Nuestro tutor es Antonio? (true o false)");
		boolean r5 = datos.nextBoolean();
		
		if ( r5 == resultado5 ) {
			
			puntuacion = puntuacion +1;
			
		}
		
		System.out.println("¿Antonio es el profesor de S.I.? (true o false");
		boolean r6 = datos.nextBoolean();
		
		if ( r6 == resultado6 ) {
			
			puntuacion = puntuacion +1;
			
		}
		
		System.out.println("¿Una sentencia if es igual a un swicth? (true o false)");
		boolean r7 = datos.nextBoolean();
		
		if ( r7 == resultado7 ) {
			
			puntuacion = puntuacion +1;
			
		}
		
		System.out.println("¿Una variable tipo int es para numeros enteros? (true o false)");
		boolean r8 = datos.nextBoolean();
		
		if ( r8 == resultado8 ) {
			
			puntuacion = puntuacion +1;
			
		}
		
		System.out.println("¿SQL es un lenguaje para B.D.? (true o false)");
		boolean r9 = datos.nextBoolean();
		
		if ( r9 == resultado9 ) {
			
			puntuacion = puntuacion +1;
			
		}
		
		System.out.println("¿Solo existe un lenguaje de programación? (true o false)");
		boolean r10 = datos.nextBoolean();
		
		if ( r10 == resultado10 ) {
			
			puntuacion = puntuacion +1;
			
		}
		
		System.out.printf("Tu resultado es: %s", puntuacion);
		
	}
}
