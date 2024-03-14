package Actividad_09_Cadenas;

import java.util.Scanner;

public class Ejercicio_06_ConteoPalabras {

	public static void main(String[] args) {
		System.out.println("Ejercicio 6: conteo de palabras de una cadena");
		System.out.println("--------------------------------------------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese su cadena ");
		String cadena = sc.nextLine();
		
		String[] fraseDividida = cadena.split(" ");
		
		System.out.println("La cantidad de palabras es: " + fraseDividida.length);
		
		sc.close();
	}

}
