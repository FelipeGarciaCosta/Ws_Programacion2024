package Actividad05_Package;


import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		System.out.println("Ejercicio 5: solicitar un número e imprimir su tabla de multiplicar");
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un número y YO le daré su tabla de multiplicar");
		int numero = sc.nextInt();
		System.out.println("Su tabla es:");
		for (int i = 1;i<=10; i++){
			System.out.println(numero + " * " + i + " = " + numero*i);
			
		}
		sc.close();
		
	}

}
