package Actividad07_EntD;

import java.util.Scanner;

public class Ejercicio_08 {

	public static void main(String[] args) {
		System.out.println("Ejercicio 8, Calculadora....");
		
		Scanner sc = new Scanner(System.in);
		
		boolean exit = false;
		int numero1 = numero1();
		int numero2 = numero2();
		
		
		do {
			System.out.println("---------------------------------------------------");
			System.out.println("Para SUMAR presione 1");
			System.out.println("Para RESTAR presione 2");
			System.out.println("Para MULTIPLICAR presione 3");
			System.out.println("Para DIVIDIR presione 4");
			System.out.println("Para SALIR DEL PROGRAMA presione 5");
			System.out.println("Para cambiar los valores de sus números presione 6");
			System.out.println("---------------------------------------------------");
			int opcionMenu = sc.nextInt();
			
			if(opcionMenu == 1) {
				int suma = numero1 + numero2; 
				System.out.println(numero1 + " + " + numero2 + " = " + suma);
			}else if(opcionMenu == 2) {
				int resta = numero1 - numero2; 
				System.out.println(numero1 + " - " + numero2 + " = " + resta);
			}else if(opcionMenu == 3) {
				int multiplicacion = numero1 * numero2; 
				System.out.println(numero1 + " * " + numero2 + " = " + multiplicacion);
			}else if(opcionMenu == 4) {
				int division = numero1 / numero2; 
				System.out.println(numero1 + " / " + numero2 + " = " + division);
			}else if(opcionMenu == 5) {
				exit = true;
			}else if(opcionMenu == 6){
				numero1 = numero1();
				numero2 = numero2();
			}else{
				System.out.println("La opción que ha ingresado no es correcta, por favor reingrese un número que se encuentre en el menú");
			}
		
			
		}while(!exit);
		System.out.println("FIN DEL PROGRAMA");
		
		sc.close();
	}
	
	public static int numero1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba los números con los que quiera operar");
		System.out.println("Número 1 =");
		int numero1 = sc.nextInt();
		return numero1;
	}
	
	public static int numero2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Número 2 =");
		int numero2 = sc.nextInt();
		return numero2;
	}
}
