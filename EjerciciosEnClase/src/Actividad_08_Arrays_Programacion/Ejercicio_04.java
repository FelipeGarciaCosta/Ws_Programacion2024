package Actividad_08_Arrays_Programacion;

import java.util.Scanner;

public class Ejercicio_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eejrcicio 4: pedirle los valores del array al usuario y luego invertirlos e imprimirlos");
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		System.out.println("Introduzca el tamaño del array por favor: ");
		int tamanio = sc.nextInt();
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		int[] numerosEnteros = new int[tamanio];
		
		for(int i= 0; i < tamanio; i++) {
			System.out.println("Ingrese el " + i + "º valor del array");
			numerosEnteros[i] = sc.nextInt();
		}//valorizo el array
		
		int j = tamanio-1 ; //CREÉ LA VARIABLE J porque necesitaba una nueva variable que me indique las posiciones del array invertido
		//OJO, esta variable J es igual al tamanio MENOS 1 porque.... el array tiene hasta la posición n-1 r(arranca desde el 0)
		//INVIERTO EL ARRRAY
		int[] arrayInvertido = new int[tamanio];
		for(int i = 0; i < tamanio; i++) {
			arrayInvertido[i] = numerosEnteros[j];
			j--;
		}
		
		//IMPRIMO el array invertido
		for(int i = 0; i < arrayInvertido.length ; i++) {
			System.out.println("valor array invertido en la posición: "+ i + " ES " + arrayInvertido[i]);
		}
		
		
		sc.close();

	}

}
