package Ejercicio02_Entornos;
import java.util.Scanner;

public class Ej7CalculadoraExamen {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int puntos = 0;
		
		System.out.println("Programa 7, Calculador de Examen del Alumno: ");
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("El examen constará de 3 preguntas. Se le darán 3 opciones y debe marcar su respuesta utilizando los números 1,2,3 Y 0: ");
		System.out.println("Presione enter para empezar el examen....");
		sc.nextLine();

		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("Pregunta 1: ¿En que año cruzó los Andes San Martín?: ");
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("Opción 1)1810");
		System.out.println("Opción 2)1920");
		System.out.println("Opción 3)17 de enero de 1817");
		System.out.println("No sabe/No contesta presione 0");
		System.out.println("Ingrese su respuesta utilizando 1, 2 o 3");
		int respuesta1 = sc.nextInt();
		
		if (respuesta1 == 3) {
			System.out.println("Su respuesta es correcta ganó 5 puntos");
			puntos = puntos +5;
			
		}else if (respuesta1 == 1 || respuesta1 == 2) {
			System.out.println("Su respuesta es incorrecta se le restó 1 punto");
			puntos = puntos -1;
			
		}else if (respuesta1 == 0  ) {
			System.out.println("Usted no ha respondido la pregunta ");
		}
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		
		
		
		System.out.println("Pregunta 2: ¿Es posible capturar Pokemones en clase?: ");
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("Opción 1)No");
		System.out.println("Opción 2)Si, pero que Felix no se entere");
		System.out.println("Opción 3)Si, pero esta mal");
		System.out.println("No sabe/No contesta presione 0");
		System.out.println("Ingrese su respuesta utilizando 1, 2, 3 o 0");
		int respuesta2 = sc.nextInt();
		
		if (respuesta2 == 2) {
			System.out.println("Su respuesta es correcta ganó 5 puntos");
			puntos = puntos +5;
			
		}else if (respuesta2 == 1 || respuesta2 == 3) {
			System.out.println("Su respuesta es incorrecta se le restó 1 punto");
			puntos = puntos -1;
			
		}else if (respuesta2 == 0  ) {
			System.out.println("Usted ha respondido la pregunta con No sabe/No contesta ");
		}
		
		
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		
		System.out.println("Pregunta 3: ¿De que Nacionalidad es Erjie?: ");
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("Opción 1)ESPAÑOL");
		System.out.println("Opción 2)COLOMBIANO");
		System.out.println("Opción 3)CHINO");
		System.out.println("No sabe/No contesta presione 0");
		System.out.println("Ingrese su respuesta utilizando 1, 2, 3 o 0");
		int respuesta3 = sc.nextInt();
		
		if (respuesta3 == 1) {
			System.out.println("COMO VAS A DECIR QUE ERJIE ERA ESPAÑOL HOMBRE NI PINTA TIENE XD");
			System.out.println("Su respuesta es correcta ganó 5 puntos");
			puntos = puntos +5;
			
		}else if (respuesta3 == 2 || respuesta3 == 3) {
			System.out.println("Su respuesta es incorrecta se le restó 1 punto");
			puntos = puntos -1;
			
		}else if (respuesta3 == 0  ) {
			System.out.println("Usted ha respondido la pregunta con No sabe/No contesta ");
		}
		
		
		System.out.println("---FIN DEL EXAMEN---");
		System.out.println("Presione enter para ver su puntaje....");
		sc.nextLine();
		sc.nextLine();
		System.out.println("PUNTAJE FINAL OBTENIDO....... MUCHA SUERTE.....:" + puntos);
		sc.close();
		
	}

}
