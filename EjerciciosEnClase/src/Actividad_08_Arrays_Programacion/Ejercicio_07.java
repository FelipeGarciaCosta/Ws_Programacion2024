package Actividad_08_Arrays_Programacion;

import java.util.Scanner;

public class Ejercicio_07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ejercicio 7: contador de números pares e impares");
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		System.out.println("Introduzca el tamaño del array por favor: ");
		int tamanio = sc.nextInt();
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		int[] numerosEnteros = new int[tamanio];
		
		for(int i= 0; i < tamanio; i++) {
			System.out.println("Ingrese el " + i + "º valor del array");
			numerosEnteros[i] = sc.nextInt();
		}//valorizo el array
		
		int numeroPar = 0;
		int numeroImpar = 0;
		
		for(int i =0; i < numerosEnteros.length; i++) {
			if(numerosEnteros[i]%2==0) {
				numeroPar++;
			}
			if(numerosEnteros[i]%2==1) {
				numeroImpar++;
			}
		}
		System.out.println("Su array es:");
		for(int elemento : numerosEnteros) {
			System.out.print("(" + elemento + ") ");
		}
		
		System.out.println();
		System.out.println("La cantidad de números pares en su array es: " + numeroPar);
		System.out.println("La cantidad de números pares en su array es: " + numeroImpar);
		
		sc.close();
	}

}
