import java.util.Scanner;

/**
*
*	Ejercicio 10,  Escribe un programa que nos diga el horóscopo 
* a partir del día y el mes de nacimiento.
* 
*	Nombre del archivo: Ejercicio10.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio10 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		//Pedimos al usuario que introduzca los datos.
		System.out.print("Por favor, introduce su día de nacimiento y el mes: ");
		int dia = datos.nextInt();
		String mes = datos.next();
		
		switch (mes) {
			
			case "Enero" :
				
				if (( dia > 0 ) && (dia < 20)) {
					
					System.out.println("Tu horoscopo es Caprocornio.");
					
				}else {
					
					System.out.println("Tu horoscopo es Acuario.");
					
				}
			break;
			
			case "Febrero" :
				
				if (( dia > 0 ) && (dia < 19)) {
					
					System.out.println("Tu horoscopo es Acuario.");
					
				}else {
					
					System.out.println("Tu horoscopo es Piscis.");
					
				}
			break;
			
			case "Marzo" :
				
				if (( dia > 0 ) && (dia < 20)) {
					
					System.out.println("Tu horoscopo es Piscis.");
					
				}else {
					
					System.out.println("Tu horoscopo es Aries.");
					
				}
			break;
			
			case "Abril" :
				
				if (( dia > 0 ) && (dia < 20)) {
					
					System.out.println("Tu horoscopo es Aries.");
					
				}else {
					
					System.out.println("Tu horoscopo es Tauro.");
					
				}
			break;
			
			case "Mayo" :
				
				if (( dia > 0 ) && (dia < 21)) {
					
					System.out.println("Tu horoscopo es Tauro.");
					
				}else {
					
					System.out.println("Tu horoscopo es Géminis.");
					
				}
			break;
			
			case "Junio" :
				
				if (( dia > 0 ) && (dia < 21)) {
					
					System.out.println("Tu horoscopo es Géminis.");
					
				}else {
					
					System.out.println("Tu horoscopo es Cáncer.");
					
				}
			break;
			
			case "Julio" :
				
				if (( dia > 0 ) && (dia < 22)) {
					
					System.out.println("Tu horoscopo es Cáncer.");
					
				}else {
					
					System.out.println("Tu horoscopo es Leo.");
					
				}
			break;
			
			case "Agosto" :
				
				if (( dia > 0 ) && (dia < 22)) {
					
					System.out.println("Tu horoscopo es Leo.");
					
				}else {
					
					System.out.println("Tu horoscopo es Virgo.");
					
				}
			break;
			
			case "Septiembre" :
				
				if (( dia > 0 ) && (dia < 22)) {
					
					System.out.println("Tu horoscopo es Virgo.");
					
				}else {
					
					System.out.println("Tu horoscopo es Libra.");
					
				}
			break;
			
			case "Octubre" :
				
				if (( dia > 0 ) && (dia < 22)) {
					
					System.out.println("Tu horoscopo es Libra.");
					
				}else {
					
					System.out.println("Tu horoscopo es Escorpio.");
					
				}
			break;
			
			case "Noviembre" :
				
				if (( dia > 0 ) && (dia < 22)) {
					
					System.out.println("Tu horoscopo es Escorpio.");
					
				}else {
					
					System.out.println("Tu horoscopo es Sagitario.");
					
				}
			break;
			
			case "Diciembre" :
				
				if (( dia > 0 ) && (dia < 21)) {
					
					System.out.println("Tu horoscopo es Sagitario.");
					
				}else {
					
					System.out.println("Tu horoscopo es Capricornio.");
					
				}
			break;
			
			default:
				
				System.out.print("Intruce datos validos.");
			
			}
		
	}
}
