package Ejercicio02_Entornos;


import java.util.Scanner;

public class Ej1MainAct02Entornos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Programa 1, perímetro y áerea del rectángulo: ");
		System.out.println("ingrese su alttura a continuación: ");
		double altura = sc.nextDouble();
		System.out.println("ingrese su base: ");
		double base = sc.nextDouble();
		System.out.println("EL PERÍMETRO DE SU RECTÁNGULO ES: " + (altura+base)*2 + " cm2");
		
		
		sc.close();
		
		
	}

}
