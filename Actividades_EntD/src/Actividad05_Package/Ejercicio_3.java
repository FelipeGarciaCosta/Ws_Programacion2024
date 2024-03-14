package Actividad05_Package;


import java.util.Scanner;

public class Ejercicio_3 {
	
	public static void main(String[] args) {
		System.out.println("Ejercicio 3: pedir 2 números por pantalla y que se muestren los números desde el 1ero hasta el 2do");
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese su primer número");
		int numero1 = sc.nextInt();
		System.out.println("Ingrese su segundo número");
		int numero2 = sc.nextInt();
		
		
		System.out.println("--------------------------------------------------------");
		if (numero1 < numero2) {
			System.out.println("Del número: " + numero1 + " al número " + numero2);
			for (int i = numero1; i<= numero2  ; i++) {
				System.out.println(i);
			
			}
		}else {
			System.out.println("Su número 1 es menor que el número 2");
		}
		
		
		sc.close();
	}

}
