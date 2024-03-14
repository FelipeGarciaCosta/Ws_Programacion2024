package ActividadesPackage;

import java.util.Scanner;

public class Actividad03_EntD_Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------------------EJERCICIO 6----------------------------");
		System.out.println("------------Determinar si un número es par o impar------------");
		System.out.println("Ingrese su número por favor...");
		double numero = sc.nextDouble();
		
		double num = numero%2;
		System.out.println("su numero dividido por 2 tiene resto =" + num);
		
		double parNoPar = numero%2; //creo una variable para ver el resto de dividir a la parte entera del número dado por 2
		if (parNoPar == 0) {
			System.out.println("su número es par");
		}else {
			System.out.println("su número es impar");
		}
		
		sc.close();
	}

}
