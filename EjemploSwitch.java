import java.util.Scanner;

/**
*
*	Ejemplo sentencia Switch, días de la semana.
* 
*	Nombre del archivo: EjemploSwitch.java
*
*	@author Jorge Reina Romero
*
*/

public class EjemploSwitch {
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		System.out.print("Por favor, introduzca un numero del 1 al 7 para el dia de la semana (siendo 1 el Lunes y 7 el Domingo): ");
		int dia = datos.nextInt();
		
		String diaSemana;
		
		switch (dia) {
			
			case 1:
			diaSemana = "Lunes";
			break;
			
			case 2:
			diaSemana = "Martes";
			break;
			
			case 3:
			diaSemana = "Miercoles";
			break;
			
			case 4:
			diaSemana = "Jueves";
			break;
			
			case 5:
			diaSemana = "Viernes";
			break;
			
			case 6:
			diaSemana = "Sabado";
			break;
			
			case 7:
			diaSemana = "Domingo";
			break;
			
			default:
			diaSemana = "No existe este dia de la semana";
			
		}
		
		System.out.printf("El numero %s de la semana es: %s", dia, diaSemana);
		
	}
}
