package Actividad07_EntD;

import java.util.Scanner;

public class Ejercicio_07 {

	public static void main(String[] args) {
		System.out.println("Ejercicio 07,  sucesión de Fibonacci");
		Scanner sc = new Scanner(System.in);
		System.out.println("Aviseme la cantidad de veces que quiera que la sucesión se reitere...");
		int vecesRepetir = sc.nextInt();
		System.out.println("---------------------------------------------------------");
		
		int numero1 = 0;
		int numero2 = 1;
		int suma = 0;
		
		//System.out.println("La suma da: " + suma);
		
		
		for(int i = 1; i < vecesRepetir; i++) {
			//0+1=1
			System.out.println("La suma da: " + suma);
			suma = numero1 + numero2;
			numero1 = numero2;
			numero2 = suma;
			
		}
		
		//System.out.println("La suma da: " + suma);
		sc.close();
	}

}
