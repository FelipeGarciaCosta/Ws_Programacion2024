package Actividad07_EntD;

import java.util.Scanner;

public class Ejercicio_06 {

	public static void main(String[] args) {
		
		System.out.println("Ejercicio 6: verificar si un número dado por el usuario es primo o no");
		System.out.println("---------------------------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		boolean mensajePrimo = true;
		
		do {
			System.out.println("Ingrese su número para saber si es primo...");
			int numeroPrimo = sc.nextInt();
			
			for(int i=2; i < numeroPrimo; i++) {
				if(numeroPrimo % i == 0) {
					mensajePrimo = false;
				}
			}
			
			if(mensajePrimo == true) {
				System.out.println("Su número es Primo");
			}else if(mensajePrimo == false) {
				System.out.println("Su número NO es Primo");
			}
			
			
			System.out.println("Para ingresar un nuevo número presione 0...");
			int menu = sc.nextInt();
			if(menu !=0) {
				exit = true;
			}
			mensajePrimo = true;
			System.out.println("---------------------------------------------------------------------");
		}while(!exit);
		
		System.out.println("Fin del programa");
		
		sc.close();

	}

}
