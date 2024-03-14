package ActividadesPackage;

import java.util.Scanner;

public class Actividad03_EntD_Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------------------EJERCICIO 5----------------------------");
		System.out.println("------------------CALCULADORA BÁSICA-------------------");
		System.out.println("Elija una de las siguientes opciones...");
		System.out.println("Para sumar pulse 1");
		System.out.println("Para restar pulse 2");
		System.out.println("Para multiplicar pulse 3");
		System.out.println("Para dividir pulse 4");
		System.out.println("Para saber el resto de una división entera pulse 5");
		
		int opcion = sc.nextInt();
		
		opcion = verificador(opcion);
		
		System.out.println("Ahora diga el 1er número con el que quiere operar");
		int numero1 = sc.nextInt();
		System.out.println("Ahora diga el 2do número con el que quiere operar");
		int numero2 = sc.nextInt();
		
		if (opcion == 1) {
			System.out.println("Sus dos números sumados son = " + suma(numero1, numero2));
		}else if (opcion == 2) {
			System.out.println("Sus dos números restados son = " + resta(numero1, numero2));
		}else if (opcion == 3) {
			System.out.println("Sus dos números multiplicados son = " + multiplicacion(numero1, numero2));
		}else if (opcion == 4) {
			System.out.println("Sus dos números divididos son = " + divison(numero1, numero2));
		}else {
			System.out.println("El resto de la division de los dos números es = " + resto(numero1, numero2));
		}
		
		sc.close();
	}
	
		
	public static int suma(int numero1, int numero2) {
		int suma = numero1 + numero2;
		return suma;
	}
	
	public static int resta(int numero1, int numero2) {
		int resta = numero1 - numero2;
		return resta;
	}
	
	public static long multiplicacion(long numero1, long numero2) {
		long multiplicacion = numero1 * numero2;
		return multiplicacion;
	}
	
	public static double divison(double numero1, double numero2) {
		double division = numero1/numero2;
		return division;
	}
	
	public static int resto(int numero1, int numero2) {
		int resto = numero1 % numero2;
		return resto;
	}
	
	public static int verificador(int numeroSemana) {
		
		Scanner sc = new Scanner(System.in);
		boolean contador = true; // creo una variable para que sirva de condición para el while
		do {					//inicia el DO (las sentencias se van a leer al menos 1 vez
			if (numeroSemana >= 1 && numeroSemana <= 5) {  //si el numero se encuentra entre 0 y 100 se salteará el ELSE y saldrá del bucle WHILE
				contador = false;
			}else { 			// en cambio si no se encuentra entre 1 y 5 volverá a solicitar un nuevo número y volverá a iniciar el bucle
				System.out.println("-------------------------------------------------------------------------");
				System.out.println("Usted ha ingresado un número que NO corresponde a ninguna opción del programa ");
				System.out.println("Por favor ingrese un número que SI se encuentre en el programa (del 1 al 5)");
				numeroSemana = sc.nextInt();
			}
		} while (contador == true);
		
		//sc.close();
		return numeroSemana;
	}
	
}
