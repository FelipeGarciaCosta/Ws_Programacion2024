package Actividad_08_Arrays_Programacion;

import java.util.Scanner;

public class Ejercicio_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ejercicio 8: multiplicador de elementos");
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		System.out.println("Introduzca el tamaño del array por favor: ");
		int tamanio = sc.nextInt();
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		int[] numerosEnteros = new int[tamanio];
		
		for(int i= 0; i < tamanio; i++) {
			System.out.println("Ingrese el " + i + "º valor del array");
			numerosEnteros[i] = sc.nextInt();
		}//valorizo el array
		
		int valorMultiplicacion = 1;
		
		for(int i= 0; i < numerosEnteros.length; i++) {
			valorMultiplicacion *= numerosEnteros[i];
		}
		
		System.out.println("El valor de todos los elementos del array multiplicado es: " + valorMultiplicacion);
		
		sc.close();
	}

}
