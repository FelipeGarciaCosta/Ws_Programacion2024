package Actividad07_EntD;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_05 {

	public static void main(String[] args) {
		
		System.out.println("Ejercicio 5: Juego en el que el usuario adivinará un número aleatorio elegido por el programa");
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int numeroRandom = r.nextInt(10)+1;// Genera un número aleatorio del 1 al 10, ambos incluidos.
		//System.out.println(numeroRandom); lo imprimo para verificar que funcione el programa
		boolean flag = true;

		System.out.println("Ingrese un número");
		int numeroUsuario = sc.nextInt();
		
		do {
			if(numeroRandom == numeroUsuario) {
				System.out.println("JODER, HAS ADIVINADO, QUE SUERTE.... el número era: " + numeroRandom); //evaluo si le pegó al número
				flag = false;
			}else if(numeroRandom < numeroUsuario) {
				System.out.println("Muy alto bro, intenta de vuelta...");		//evaluo si se pasó del número
				numeroUsuario = sc.nextInt();
			}else if(numeroRandom > numeroUsuario) {
				System.out.println("Muy bajo bro, intenta de vuelta...");		//evaluo si le faltó para el número
				numeroUsuario = sc.nextInt();
			}
		}while(flag == true);
		
		sc.close();

	}

}
