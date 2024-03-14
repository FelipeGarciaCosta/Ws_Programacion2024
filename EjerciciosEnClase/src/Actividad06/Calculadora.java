package Actividad06;

import java.util.Scanner;

public class Calculadora {
	
	//EJERCICIO 01 y ERJERCICIO 03
	public static void main(String[] args) {
		
		System.out.println("EJERCICIO 1");
		llamarCalculadora(); //EJERCICIO01
		System.out.println("EJERCICIO 3, dados 2 numeros enteros llamar a las funciones del ejercicio 1 para operar con los mismos");
		System.out.println("----------------------------------------------------------------------");
		ejercicio3();
		
		System.out.println("FIN DEL PROGRAMA");
		
	}

	public static void calculadoraSuma(int numero1, int numero2) {
		int suma = numero1 + numero2 ;
		System.out.println("Sus números sumados con la función 1 son:" + suma);
		
		
	}
	public static void calculadoraSuma(double numero1, double numero2) {
		double suma = numero1+numero2 ;
		System.out.println("Sus números sumados con la función 2 son:" + suma);
		System.out.println("----------------------------------------------------------------------");
	}
	
	public static void calculadorResta(int numero1, int numero2) {
		double resta = numero1 - numero2;
		System.out.println("Sus números restados con la función 1 son:" + resta);
		
	}
	public static void calculadorResta(double numero1, double numero2) {
		double resta = numero1 - numero2;
		System.out.println("Sus números restados con la función 2 son:" + resta);
		System.out.println("----------------------------------------------------------------------");
	}
	
	public static void calculadoraDivision(int numero1, int numero2) {
		double numero3 = numero1;
		double numero4 = numero2;
		double division = numero3/numero4;
		System.out.println("Sus números divididos con la función 1 son:" + division);
	}
	public static void calculadoraDivision(double numero1, double numero2) {
		double division = numero1/numero2;
		System.out.println("Sus números divididos con la función 2 son:" + division);
		System.out.println("----------------------------------------------------------------------");
	}
	
	public static void calculadoraMultiplicacion(int numero1, int numero2) {
		int multiplicacion = numero1*numero2;
		System.out.println("Sus números multiplicados con la función 1 son:" + multiplicacion);
	}
	public static void calculadoraMultiplicacion(double numero1, double numero2) {
		double multiplicacion = numero1*numero2;
		System.out.println("Sus números multiplicados con la función 2 son:" + multiplicacion);
		System.out.println("----------------------------------------------------------------------");
	}
	public static void llamarCalculadora() {
		calculadoraSuma(15, 10);
		calculadoraSuma(15.5, 10.3566);
		calculadorResta(10, 20);
		calculadorResta(10.5, 20.38);
		calculadoraDivision(10, 12);
		calculadoraDivision(13.5, 5.6);
		calculadoraMultiplicacion(38,35);
		calculadoraMultiplicacion(364.356,312.124);
	}

	public static void ejercicio3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		int numero1 = sc.nextInt();
		System.out.println("Ingrese otro número: ");
		int numero2 = sc.nextInt();
		calculadoraSuma(numero1,numero2);
		calculadorResta(numero1,numero2);
		calculadoraDivision(numero1,numero2);
		calculadoraMultiplicacion(numero1,numero2);
		sc.close() ;
	}
}
