package Actividad_08_Arrays_Programacion;

import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		System.out.println("Ejercicio 10: Eliminar elemento específico");
		int[] arrayCargado = {1,2,3,4,5,2,6,7,8};
		for(int elemento : arrayCargado) { //imprimo el array
				System.out.print(" (" + elemento + ") ");
		}
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el número que desea eliminar del array");
		int numeroEliminar = sc.nextInt();
		int contadorDuplicados = 0;
		for(int i =0; i<arrayCargado.length; i++) { //cuento la cantidad de números duplicados del valor a eliminar
			if(arrayCargado[i] == numeroEliminar) {
				contadorDuplicados++;
			}
		}
		System.out.println("La cantidad de veces que se encuentra ese número en el array es: " + contadorDuplicados);
		
		System.out.println("--------------------------------------------------------------------------------------");
		
		int[] nuevoArray = new int[arrayCargado.length - contadorDuplicados];
		int j =0;
		
		for(int i = 0; i < arrayCargado.length; i++) { //copio los valores que no son el valor a eliminar
			if(arrayCargado[i] != numeroEliminar ) {
				nuevoArray[j] = arrayCargado[i];
				j++;
			}
		}
		
		System.out.println("El nuevo array es: ");
		for(int elemento : nuevoArray) {
			System.out.print(" (" + elemento + ") ");
		}
		
		
		
		sc.close();
	}

}
