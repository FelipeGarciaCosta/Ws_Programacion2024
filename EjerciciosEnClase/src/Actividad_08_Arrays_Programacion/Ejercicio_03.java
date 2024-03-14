package Actividad_08_Arrays_Programacion;

import java.util.Scanner;

public class Ejercicio_03 {

	public static void main(String[] args) {

		//Mayor elemento: Escribe un programa que solicite al usuario ingresar el tamaño de un array de números enteros
		//A continuación se le pedirá números hasta que el array esta lleno y por último recorrerá el array para buscar el mayor número y lo imprimirá.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eejrcicio 3: pedir al usuario el tamaño del array y luego buscar e imprimir el mayor valor");
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		System.out.println("Introduzca el tamaño del array por favor: ");
		int tamanio = sc.nextInt();
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		int[] numerosEnteros = new int[tamanio];
		int mayor = 0;
		
		for(int i= 0; i < tamanio; i++) {
			System.out.println("Ingrese el " + i + "º valor del array");
			numerosEnteros[i] = sc.nextInt();
			if(mayor < numerosEnteros[i] || i == 0) {
				mayor = numerosEnteros[i];
			}
		}
		
		System.out.println("El mayor de los números ingresados al array es: " + mayor);
		sc.close();
	}

}
