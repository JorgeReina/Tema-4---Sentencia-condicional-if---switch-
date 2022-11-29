import java.util.Scanner;

/**
*
*	Ejemplo sentencia Switch 2, días de la semana.
* 
*	Nombre del archivo: EjemploSwitch2.java
*
*	@author Jorge Reina Romero
*
*/

public class EjemploSwitch2 {
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		System.out.print("Introduze el día del mes: ");
		int mes = datos.nextInt();
		
		String nombreMes;
		
		switch (mes) {
			
			case 1:
				nombreMes = "Enero";
			
			case 2:
				nombreMes = "Febrero";
			
				System.out.println("Invierno");
			
			break;
			
			case 3:
				nombreMes = "Marzo";
			
			case 4:
				nombreMes = "Abril";
			
			case 5:
				nombreMes = "Mayo";
			
				System.out.println("Primavera");
			
			break;
			
			case 6:
				nombreMes = "Junio";
			
			case 7:
				nombreMes = "Julio";
			
			case 8:
				nombreMes = "Agosto";
			
				System.out.println("Verano");
			
			break;
			
			case 9:
				nombreMes = "Septiembre";
			
			case 10:
				nombreMes = "Octubre";
			
			case 11:
				nombreMes = "Noviembre";
			
				System.out.println("Otoño");
			
			break;
			
			case 12:
				nombreMes = "Diciembre";
			
				System.out.println("Invierno");
			
			break;
			
			default:
				nombreMes = "No existe ese mes";
			
		}
		
		System.out.printf("El numero %s del mes es: %s", mes, nombreMes);
		
	}
}
