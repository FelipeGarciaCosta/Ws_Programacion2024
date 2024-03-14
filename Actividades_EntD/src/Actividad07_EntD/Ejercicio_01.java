package Actividad07_EntD;

import java.util.Scanner;

public class Ejercicio_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ejercicio 1: Contador de Números Pares");
		System.out.println("Buenas, diga el primer número del rango por favor");
		int numero1 = sc.nextInt();
		
		System.out.println("Buenas, diga el último número del rango por favor");
		int numero2 = sc.nextInt();
		
		while(numero1 > numero2) {
			System.out.println("Su primer número es menor que el segundo");
			System.out.println("Por favor reeingrese los números de su rango");
			System.out.println("Diga el primer número del rango por favor");
			numero1 = sc.nextInt();
			
			System.out.println("Diga el último número del rango por favor");
			numero2 = sc.nextInt();
		}
		
		// Ejemplo del programa ------- ingresa rango 1-10
		// poner como inicio al 1er número y como final al 2do
		//crear una variable que sirva para ir contando la cantidad de números que cumplan la condición de ser pares
		//incrementar dicha variable en 1 por cada número que cumpla la condición
		//tambien hay que mostrar por pantalla cada número par
		
		int contador = 0;
		
		for(int i = numero1; i<= numero2; i++) {
			if(i%2 == 0) {
				contador++;
				System.out.println(i);
			}

		}
		System.out.println("La cantidad de números pares que existen entre su rango es: " + contador);
		sc.close();
	}

}
