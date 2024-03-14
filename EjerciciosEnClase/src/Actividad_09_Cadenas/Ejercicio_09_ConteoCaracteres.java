package Actividad_09_Cadenas;

import java.util.Scanner;

public class Ejercicio_09_ConteoCaracteres {

	public static void main(String[] args) {
		System.out.println("Ejercicio 9: contar la cantidad de veces que aparece un caracter en una cadena");
		System.out.println("--------------------------------------------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese su cadena ");
		String cadena = sc.nextLine();
		
		System.out.println("Ingrese el caracter que desea contar la cantidad de veces que se repite ");
		char buscado = sc.next().charAt(0);
		int contador = 0;
		
		for(int i = 0; i < cadena.length();i++) {
			if(cadena.charAt(i) == buscado) {
				contador++;
			}
		}
		System.out.println("La cantidad de veces que aparece el caracter " + buscado + " es " + contador);
		sc.close();
	}

}
