package Actividad_08_Arrays_Programacion;

import java.util.Scanner;

public class Ejercicio_06 {

	public static void main(String[] args) {
		/*Buscar elemento: Desarrolla un programa que permita al usuario ingresar un valor 
		y determine si ese valor está presente en un array dado. 
		Se tendrá que crear un array con valores al inicio del programa.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ejercicio 6: el usuario ingresará un número para saber si se encuentra en el array");
		
		int[] arrayLleno = {1,2,3,4,5,6,7,8,9,1,2,3};
	
		
		System.out.println("Ingrese el número que desea saber si se encuentra en el array:");
		int numBuscado = sc.nextInt();
		int contador = 0;
		boolean mensaje = false;
		int posicion = 0;
		
		for(int i =0; i < arrayLleno.length ; i++) {
			if(arrayLleno[i] == numBuscado) {
				contador++;
				mensaje = true;
				posicion = i;
				System.out.println("Su número si se encuentra en el array en la posición: " + posicion);
			}
		}
		
		if(!mensaje) {
			System.out.println("No se ha encontrado su número en el array ");
		}else {
			System.out.println("La cantidad de veces que se repite es: " + contador);
		}
		
		System.out.println("Su array normal es:");
		for(int elemento : arrayLleno) {
			System.out.print("(" + elemento +")" + " - ");
		}
		sc.close();
		
	}

}

