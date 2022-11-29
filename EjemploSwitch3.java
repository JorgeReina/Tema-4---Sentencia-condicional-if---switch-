import java.util.Scanner;

/**
*
*	Ejemplo sentencia Switch 3, días de la semana.
* 
*	Nombre del archivo: EjemploSwitch3.java
*
*	@author Jorge Reina Romero
*
*/

public class EjemploSwitch3 {
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		System.out.println(" CÁLCULO DE ÁREAS");
		System.out.println(" ----------------");
		System.out.println(" 1. Triangulo");
		System.out.println(" 2. Rombo");
		System.out.println(" 3. Romboide");
		System.out.println(" 4. Trapecio");
		System.out.println(" 5. Salir");
		System.out.println();
		System.out.print("Elije una opción: ");
		
		int opcion = datos.nextInt();
		
		double base;
		double baseMenor;
		double altura;
		double diagonalMayor;
		double diagonalMenor;
		
		/*
		double areaTriangulo = (base * altura) / 2;
		double areaRombo = (diagonalMayor * diagonalMenor) / 2;
		double areaRomboide = base * altura;
		double areaTrapecio = ((base + baseMenor) / 2) * altura;
		*/
		
		switch (opcion) {
			
			case 1:
				System.out.print("Introduce la altura del Triangulo en cm: ");
				altura = datos.nextDouble();
				System.out.print("Introduce la base del Triangulo en cm: ");
				base = datos.nextDouble();
				
				double areaTriangulo = (base * altura) / 2;
				
				System.out.printf("El area del triangulo es %s cm2", areaTriangulo);
				
				break;
				
			case 2:
				System.out.print("Introduce la diagonal mayor del Rombo en cm: ");
				diagonalMayor = datos.nextDouble();
				System.out.print("Introduce la diagonal menor del Rombo en cm: ");
				diagonalMenor = datos.nextDouble();
				
				double areaRombo = (diagonalMayor * diagonalMenor) / 2;
				
				System.out.printf("El area del Rombo es %s cm2", areaRombo);
				
				break;
				
			case 3:
				System.out.print("Introduce la base del Romboide en cm: ");
				base = datos.nextDouble();
				System.out.print("Introduce la altura del Romboide en cm: ");
				altura = datos.nextDouble();
				
				double areaRomboide = base * altura;
				
				System.out.printf("El area del Romboide es %s cm2", areaRomboide);
				
				break;
				
			case 4:
				System.out.print("Introduce la base del Trapecio en cm: ");
				base = datos.nextDouble();
				System.out.print("Introduce la base menor del Trapecio en cm: ");
				baseMenor = datos.nextDouble();
				System.out.print("Introduce la altura del Trapecio en cm: ");
				altura = datos.nextDouble();
				
				double areaTrapecio = ((base + baseMenor) / 2) * altura;
				
				System.out.printf("El area del Trapecio es %s cm2", areaTrapecio);
				
				break;
				
			case 5:
				System.out.print("Has salido.");
				break;
			
			default:
				System.out.print("No existe esta opción.");

			
		}
		
	}
}
