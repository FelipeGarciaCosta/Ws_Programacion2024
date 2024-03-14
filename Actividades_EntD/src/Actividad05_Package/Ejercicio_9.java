package Actividad05_Package;

import java.util.Scanner;

public class Ejercicio_9 {

	public static void main(String[] args) {
		
		System.out.println("Ejercicio 9: hacer los ejercicios 3, 5 y 8 como funciones y pasarle los valores como parámetros de entrada");
		System.out.println("--------------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su primer número");
		int numero1 = sc.nextInt();
		System.out.println("Ingrese su segundo número");
		int numero2 = sc.nextInt();
		System.out.println("-------------------------LLAMO A LA FUNCION EJ3------------------------------");
		ej3(numero1, numero2);
		System.out.println("-------------------------LLAMO A LA FUNCION EJ5 para el numero1-------------------------------");
		ej5(numero1);
		System.out.println("-------------------------LLAMO A LA FUNCION EJ5 para el numero2-------------------------------");
		ej5(numero2);
		System.out.println("-------------------------LLAMO A LA FUNCION EJ8 para el numero1-------------------------------");
		ej8(numero1);
		System.out.println("-------------------------LLAMO A LA FUNCION EJ8 para el numero2-------------------------------");
		ej8(numero2);
		
		sc.close();
		
	}

	
	
	public static void ej3(int numero1,  int numero2) {
		if (numero1 < numero2) {
			System.out.println("Del número: " + numero1 + " al número " + numero2);
			for (int i = numero1; i<= numero2  ; i++) {
				System.out.println(i);
			
			}
		}else {
			System.out.println("Su número 1 es menor que el número 2");
		}
	}
	
	public static void ej5(int numero1) {
		int numero = numero1;
		System.out.println("Su tabla del " + numero+ " es:");
		for (int i = 1;i<=10; i++){
			System.out.println(numero + " * " + i + " = " + numero*i);
			
		}
	}
	
	public static void ej8(int numero1) {
		int factorial = 1;
		int numero = numero1;
		for(int i = numero; i> 0; i-=1) {
			factorial *=  i;
			if(i==1) {
				System.out.println("El factorial de "+ numero + " es " + factorial);
			}
			
		}
	}
}
