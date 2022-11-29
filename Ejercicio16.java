import java.util.Scanner;

/**
*
*	Ejercicio 16,  Realiza un programa que nos diga si hay probabilidad
* de que nuestra pareja nos está siendo infiel.
* 
*	Nombre del archivo: Ejercicio16.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio16 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		boolean respuesta;
		int puntuacion = 0;
		
		System.out.println("¿Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente? (true o false)");
		respuesta = datos.nextBoolean();
		
		if (respuesta == true) {
			
			puntuacion = puntuacion + 3;
			
		}
		
		System.out.println("¿Ha aumentado sus gastos de vestuario? (true o false)");
		respuesta = datos.nextBoolean();
		
		if (respuesta == true) {
			
			puntuacion = puntuacion + 3;
			
		}
		
		System.out.println("¿Ha perdido el interés que mostraba anteriormente por ti? (true o false)");
		respuesta = datos.nextBoolean();
		
		if (respuesta == true) {
			
			puntuacion = puntuacion + 3;
			
		}
		
		System.out.println("¿Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)? (true o false)");
		respuesta = datos.nextBoolean();
		
		if (respuesta == true) {
			
			puntuacion = puntuacion + 3;
			
		}
		
		System.out.println("¿No te deja que mires la agenda de su teléfono móvil? (true o false)");
		respuesta = datos.nextBoolean();
		
		if (respuesta == true) {
			
			puntuacion = puntuacion + 3;
			
		}
		
		System.out.println("¿A veces tiene llamadas que dice no querer contestar cuando estás tú delante? (true o false)");
		respuesta = datos.nextBoolean();
		
		if (respuesta == true) {
			
			puntuacion = puntuacion + 3;
			
		}
		
		System.out.println("¿Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a? (true o false)");
		respuesta = datos.nextBoolean();
		
		if (respuesta == true) {
			
			puntuacion = puntuacion + 3;
			
		}
		
		System.out.println("¿Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo? (true o false)");
		respuesta = datos.nextBoolean();
		
		if (respuesta == true) {
			
			puntuacion = puntuacion + 3;
			
		}
		
		System.out.println("¿Has notado que últimamente se perfuma más? (true o false)");
		respuesta = datos.nextBoolean();
		
		if (respuesta == true) {
			
			puntuacion = puntuacion + 3;
			
		}
		
		System.out.println("¿Se confunde y te dice que ha estado en sitios donde no ha ido contigo? (true o false)");
		respuesta = datos.nextBoolean();
		
		if (respuesta == true) {
			
			puntuacion = puntuacion + 3;
			
		}
		
		if ((puntuacion > 0) && (puntuacion < 10)) {
			
			System.out.print("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
			
		}else if ((puntuacion > 11) && (puntuacion < 22)) {
			
			System.out.print(" Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
			
		}else {
			
			System.out.print("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
			
		}
		
	}
}
