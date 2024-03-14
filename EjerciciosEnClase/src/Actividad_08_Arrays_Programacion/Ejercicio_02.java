package Actividad_08_Arrays_Programacion;

import java.util.Scanner;

public class Ejercicio_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//PROMEDIO: Escribe un programa que solicite al usuario ingresar el tamaño de un array de números reales
		// A continuación se le pedirá números hasta que el array esta lleno y por último imprimirá la media aritmética de todos ellos.
		
		System.out.println("Eejrcicio 2: pedir al usuario el tamaño del array y luego hacer el promedio de los valores del array");
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		System.out.println("Introduzca el tamaño del array por favor: ");
		int tamanio = sc.nextInt();
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		int[] numerosEnteros = new int[tamanio];
		double suma = 0;
		
		for(int i= 0; i < tamanio; i++) {
			System.out.println("Ingrese el " + i + "º valor del array");
			numerosEnteros[i] = sc.nextInt(); 
			suma += numerosEnteros[i]; 
		}
		
		double promedio = suma/tamanio;
		//System.out.println(suma);
		System.out.println("El promedio de los enteros es: " + promedio);
		
		sc.close();
		
	}

}
