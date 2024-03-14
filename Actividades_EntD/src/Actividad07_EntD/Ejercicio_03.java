package Actividad07_EntD;

import java.util.Scanner;

public class Ejercicio_03 {

	public static void main(String[] args) {
		
		System.out.println("Ejercicio 3: Hacer un programa que sume números dados por el usuario y devuelva la suma de todos");
		System.out.println("Terminará cuando el usuario ingrese un número negativo");
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = false;
		int sumaTotal = 0;
		do {
			System.out.println("Ingrese un número a continuación");
			int numero1 = sc.nextInt();
			if(numero1 >= 0) {
				sumaTotal += numero1;
			}else {
				flag = true;
			}
		}while(flag == false);
		System.out.println("La suma de todos los números es: " + sumaTotal);
		
		sc.close();

	}

}
