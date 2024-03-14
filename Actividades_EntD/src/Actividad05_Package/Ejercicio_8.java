package Actividad05_Package;

import java.util.Scanner;

public class Ejercicio_8 {

	public static void main(String[] args) {
		System.out.println("Ejercicio 8: Calcular el factorial de un número pedido por pantalla");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un número y YO le diré su factorial: ...");
		int numero = sc.nextInt();
		
		//calculo del factorial del numero pedido
		int factorial = 1;
		
		for(int i = numero; i> 0; i-=1) {
			factorial *=  i;
			if(i==1) {
				System.out.println("El factorial de "+ numero + " es " + factorial);
			}
			
		}
		
		sc.close();
	}

}
