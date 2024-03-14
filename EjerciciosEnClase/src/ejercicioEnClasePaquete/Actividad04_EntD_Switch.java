package ejercicioEnClasePaquete;

import java.util.Scanner;

public class Actividad04_EntD_Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("-----------EJERCICIO 5 realizado con Switch-----------");
		System.out.println("Ahora elija una de las siguientes opciones para operar con los números ingresados: ");
		System.out.println("Para sumar pulse 1");
		System.out.println("Para restare 2");
		System.out.println("Para multiplicar pulse 3");
		System.out.println("Para dividir pulse 4");
		System.out.println("Para averiguar el resto de una división entera pulse 5");
		int decision = sc.nextInt();

		System.out.println("Ingrese un número para operar: ");
		int numero1 = sc.nextInt();
		System.out.println("Ingrese otro número para operar: ");
		int numero2 = sc.nextInt();

		switch (decision) {
		case 1:
			System.out.println("La suma da:" + suma(numero1, numero2));
			break;
		case 2:
			System.out.println("La resta da:" +resta(numero1, numero2));
			break;
		case 3:
			System.out.println("La multiplicación da:" + multiplicar(numero1, numero2) );
			break;
		case 4:
			System.out.println("La división da:" + dividir(numero1, numero2));
			break;
		default:
			System.out.println("El resto de la división de 2 enteros da:" + resto(numero1, numero2));
			break;
		}

		System.out.println("-------------EJERCICIO 6 realizado con Switch-----------");
		System.out.println("Ingrese un número para ver si es par o impar....");
		int verSiEsPar = sc.nextInt();
		if (verSiEsPar != 0) {
			switch (verSiEsPar) {
			case 0:
				System.out.println(verSiEsPar + "es un número PAR");
				break;

			default:
				System.out.println(verSiEsPar + "es un número IMPAR");
				break;

			}
		} else {
			System.out.println("Su número es 0");
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

	public static int multiplicar(int numero1, int numero2) {
		int multiplicar = numero1 * numero2;
		return multiplicar;
	}

	public static double dividir(double numero1, double numero2) {
		double multiplicar = numero1 / numero2;
		return multiplicar;
	}

	public static int resto(int numero1, int numero2) {
		int multiplicar = numero1 % numero2;
		return multiplicar;
	}

}
