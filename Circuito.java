import java.util.Scanner;

/**
*
*	Ejercicio Circuito,  Realiza un programa que indique la ruta que debes seguir.
* 
*	Nombre del archivo: Circuito.java
*
*	@author Jorge Reina Romero
*
*/

public class Circuito {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		//Diseño menu.
		System.out.println("*  Ruta Málaga - Madrid	 *");
		System.out.println();
		System.out.println(" Elige su punto de salida.");
		System.out.println(" -------------------------");
		System.out.println(" 1. Alhaurín de la torre");
		System.out.println(" 2. Villanueva del Rosario");
		System.out.println(" 3. Santa Fe");
		System.out.println(" 4. Valdepeñas");
		System.out.println(" 5. Getafe");
		System.out.println(" -------------------------");
		System.out.println();
		
		//Pedimos al usuario que introduzca una opción.
		System.out.print("Elije una opción: ");
		int opcion = datos.nextInt();
		
		String ruta = "La ruta que debes seguir es la siguiente: ";
		String ciudades = "Las ciudades por donde vas a pasar son: ";
		
		//Definimos las ciudades.
		String cd1 = "Málaga, ";
		String cd2 = "Granada, ";
		String cd3 = "Jaén, ";
		String cd4 = "Ciudad Real, ";
		String cd5 = "Toledo, ";
		String cd6 = "Getafe, ";
		String cd7 = "Madrid.";
		
		//Definimos las localidades.
		String rt1 = "Alhaurín de la Torre, ";
		String rt2 = "Villanueva del Rosario, ";
		String rt3 = "Loja, ";
		String rt4 = "Santa Fe, ";
		String rt5 = "Las Infantas, ";
		String rt6 = "Valdepeñas, ";
		String rt7 = "La Guardia, ";
		String rt8 = "Aranjuez, ";
		String rt9 = "Getafe, ";
		String rt10 = "Madrid.";
		
		//Definimos la sentencia Switch. que indica por donde debemos pasar.
		switch (opcion) {
			
			case 1:
				ruta += (rt1);
				ciudades += (cd1);
			case 2:
				ruta += (rt2 + rt3);
			case 3:
				ruta += (rt4 + rt5);
				ciudades += (cd2);
			case 4:
				ruta += (rt6 + rt7 + rt8);
				ciudades += (cd3 + cd4 + cd5);
			case 5:
				ruta += (rt9 + rt10);
				ciudades += (cd6 + cd7);
				
				System.out.println(ruta);
				System.out.println(ciudades);
			break;
			default:
				System.out.println("Introduce un dato valido");
			
		}
				
	}
}
