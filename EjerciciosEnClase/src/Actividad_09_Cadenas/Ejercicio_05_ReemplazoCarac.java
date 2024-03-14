package Actividad_09_Cadenas;

import java.util.Scanner;

public class Ejercicio_05_ReemplazoCarac {

	public static void main(String[] args) {
		System.out.println("Ejercicio 5: reemplazar un caracter de la cadena por otro dado por el usuario");
		System.out.println("--------------------------------------------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese su cadena ");
		String cadena = sc.nextLine();
		
		System.out.println("Ingrese el caracter que desea reemplazar ");
		String reemplazado = sc.nextLine();
		
		System.out.println("Ingrese el caracter por el que desea reemplazar al anterior ");
		String reemplazo = sc.nextLine();
		
		System.out.println("La cadena introducida es: " + cadena);
		
		System.out.println("La cadena con el elemento " + reemplazado + " reemplazado por : " + reemplazo + " es ... " + cadena.replace(reemplazado,reemplazo));
		
		sc.close();
	}

}
