package main;

import java.util.Scanner;

import mainOperaciones.Matematicas;

public class mainEjercicio13_ED {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		do {
		System.out.println("-----------Menu-----------");
		System.out.println("1.SUMA");
		System.out.println("2.RESTA");
		System.out.println("3.MULTIPLICACION");
		System.out.println("4.DIVIDIR");
		System.out.println(" OTRO. SALIR");
		opcion = sc.nextInt();
		System.out.println("INGRESE EL NUMERO 1");
		int numero1 = sc.nextInt();
		System.out.println("INGRESE EL NUMERO 2");
		int numero2 = sc.nextInt();
		
		switch (opcion) {
		case 1: {
			System.out.println("suma: " + Matematicas.suma(numero1, numero2)); 
		
		}
		case 2: {
			System.out.println("resta: " + Matematicas.resta(numero1, numero2)); 
		
		}case 3: {
			System.out.println("multiplicacion: " + Matematicas.multiplicar(numero1, numero2)); 
		
		}case 4: {
			System.out.println("division: " + Matematicas.dividir(numero1, numero2)); 
		
		}}
		
		
		}while(opcion != 5);
			
	}

}
