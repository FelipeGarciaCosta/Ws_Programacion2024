package Actividad_08_Arrays_Programacion;

import java.util.Scanner;

public class Ejercicio_09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ejercicio 9: unir arrays y mostrar suma de todos los elementos por pantalla");
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		System.out.println("Introduzca el tamaño del primer array por favor: ");
		int tamanio1 = sc.nextInt();
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		System.out.println("Introduzca el tamaño del segundo array por favor: ");
		int tamanio2 = sc.nextInt();
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		int[] array1 = new int[tamanio1];
		
		for(int i= 0; i < tamanio1; i++) {
			System.out.println("Ingrese el " + i + "º valor del array 1");
			array1[i] = sc.nextInt();
		}//valorizo el array1
		
		System.out.println("--------------------Ahora pasaremos a valorizar el array 2--------------------");
		int[] array2 = new int[tamanio2];
		
		for(int i= 0; i < tamanio2; i++) {
			System.out.println("Ingrese el " + i + "º valor del array 2");
			array2[i] = sc.nextInt();
		}//valorizo el array2
		
		
		//uno los 2 arrays
		int tamanioUnido = tamanio1 + tamanio2 ;
		int[] arrayUnido = new int[tamanioUnido];
		int auxiliar = 0;
		
		for(int i = 0; i < tamanio1; i++) {
				arrayUnido[i] = array1[i];
				auxiliar++;
			
		}

		for(int i = 0; i < tamanio2; i++) {
				arrayUnido[i+auxiliar] = array2[i];
		}
		
		System.out.println("Sus array unidos son iguales a: ");
		
		for(int elemento : arrayUnido){ //imprimo los arrays unidos
			System.out.print(" (" + elemento + ") ");
		}
		
		int elementosSumados = 0;
		//sumo todos los elementos
		for(int i=0; i < arrayUnido.length; i++) {
			elementosSumados += arrayUnido[i];
		}
		System.out.println("Todos los elementos sumados son: " + elementosSumados);
		
		sc.close();
	}

}
