package Actividad07_EntD;

import java.util.Scanner;

public class Ejercicio_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ejercicio 1: Convertidor de Temperatura ");
		System.out.println("Para pasar de Celcius a Fahrenheit presione 1");
		System.out.println("Para pasar de Fahrenheit a Celcius presione 2");
		int opcionMenu = sc.nextInt();
			
		
		while(opcionMenu != 1 && opcionMenu != 2) {
			System.out.println("Usted no ha ingresado una opción del menú, reingrese su opción...");
			opcionMenu = sc.nextInt();
		}
		
		// de celcius a faren ----->  (grados Fahrenheit − 32) × 5/9
		if(opcionMenu == 1) {
			System.out.println("Ha elegido pasar de Celcius a Fahrenheit....");
			System.out.println("Ingrese su temperatura a convertir en grados centígrados, por favor");
			double grados = sc.nextDouble();
			System.out.println("Su temperatura convertida a Fahrenheit es: " + ((grados-32)*5/9));
		}else if(opcionMenu == 2) {
			System.out.println("Ha elegido pasar de Fahrenheit a Celcius");
			System.out.println("Ingrese su temperatura a convertir en grados Fahrenheit, por favor");
			double grados = sc.nextDouble();
			System.out.println("Su temperatura convertida a Celcius es: " + ((grados+32)*5/9));
		}
		
		sc.close();
		
	}

}
