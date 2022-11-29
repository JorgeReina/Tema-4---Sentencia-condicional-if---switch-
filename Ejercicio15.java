import java.util.Scanner;

/**
*
*	Ejercicio 15,  Escribe un programa que pinte una pirámide rellena con 
* un carácter introducido por teclado que podrá ser una letra, un número 
* o un símbolo como *, +, -, $, &, etc. El programa debe permitir al usuario 
* mediante un menú elegir si el vértice de la pirámide está apuntando 
* hacia arriba, hacia abajo, hacia la izquierda o hacia la derecha.
* 
*	Nombre del archivo: Ejercicio15.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio15 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		//Pedimos al usuario que introduzca un caracter.
		System.out.print("Por favor, introduce un caracter: ");
		String c = datos.next();
		
		System.out.println("--- OPCIONES ---");
		System.out.println("1. Vertice hacia arriba.");
		System.out.println("2. Vertice hacia abajo.");
		System.out.println("3. Vertice hacia izquierda.");
		System.out.println("4. Vertice hacia derecha.");
		System.out.println("--- 	ELIGE	 ---");
		System.out.print("Opcion: ");
		int opcion = datos.nextInt();
		
		switch (opcion) {
			
			case 1:
				
				System.out.printf("%5s\n", c);
				System.out.printf("%4s%s%s\n", c,c,c);
				System.out.printf("%3s%s%s%s%s\n", c,c,c,c,c);
				System.out.printf("%2s%s%s%s%s%s%s\n", c,c,c,c,c,c,c);
				System.out.printf("%s%s%s%s%s%s%s%s%s", c,c,c,c,c,c,c,c,c);
				
			break;
			
			case 2:
				
				System.out.printf("%5s\n",c);
				System.out.printf("%4s%s\n", c,c);
				System.out.printf("%2s%s%s%s\n", c,c,c,c);
				System.out.printf("%s%s%s%s%s\n", c,c,c,c,c);
				System.out.printf("%2s%s%s%s\n", c,c,c,c);
				System.out.printf("%4s%s\n", c,c);
				System.out.printf("%5s\n",c);
				
			break;
			
			case 3:
				
				System.out.printf("%5s\n",c);
				System.out.printf("%5s%s\n", c,c);
				System.out.printf("%5s%s%s%s\n", c,c,c,c);
				System.out.printf("%5s%s%s%s%s\n", c,c,c,c,c);
				System.out.printf("%5s%s%s%s\n", c,c,c,c);
				System.out.printf("%5s%s\n", c,c);
				System.out.printf("%5s\n",c);
				
			break;
			
			case 4:
				
				System.out.printf("%s%s%s%s%s%s%s%s%s\n", c,c,c,c,c,c,c,c,c);
				System.out.printf("%2s%s%s%s%s%s%s\n", c,c,c,c,c,c,c);
				System.out.printf("%3s%s%s%s%s\n", c,c,c,c,c);
				System.out.printf("%4s%s%s\n", c,c,c);
				System.out.printf("%5s\n", c);
			
			break;
			
			default:
				
				System.out.print("Introduce opciones validas.");
			
		}
		
	}
}
