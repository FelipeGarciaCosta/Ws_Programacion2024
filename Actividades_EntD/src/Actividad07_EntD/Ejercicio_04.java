package Actividad07_EntD;

import java.util.Scanner;

public class Ejercicio_04 {

	public static void main(String[] args) {
		System.out.println("Ejercicio 4: el usuario ingresará juegos de números y después se le dirá el mayor de todos");
		System.out.println("Terminará cuando el usuario ingrese un número negativo");
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = false;
		int numMayor = 0;
		
		do {
			System.out.println("Ingrese un número a continuación");
			int numero1 = sc.nextInt();
			if(numero1 >= 0) {
				if(numMayor < numero1) {
					numMayor = numero1;
				}
			}else {
				flag = true;
			}
		}while(flag == false);
		System.out.println("El mayor de todos los juegos es: " + numMayor);
		
		sc.close();

	}

}
