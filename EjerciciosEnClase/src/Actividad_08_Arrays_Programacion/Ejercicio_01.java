package Actividad_08_Arrays_Programacion;

import java.util.Scanner;

public class Ejercicio_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ejercico 1: pedirle el tamaño del arrray al usuario y luego pedirle numeros hasta llenar el array");
		System.out.println("--------------------------------------------------------------------------------------------------");
		
		System.out.println("Introduzca el tamaño del array por favor: ");
		int tamanio = sc.nextInt();
		
		int[] numerosEnteros = new int[tamanio];
		int suma = 0;
		
		for(int i= 0; i < tamanio; i++) {
			System.out.println("Ingrese el " + i + "º valor del array");
			numerosEnteros[i] = sc.nextInt(); //valorizamos cada posición del arrray con el número ingresado por el usuario
			suma += numerosEnteros[i]; 
		}
		System.out.println("La suma de todos los enteros es: " + suma);
		
		sc.close();
	}

}
