package Ejercicio02_Entornos;
import java.util.Scanner;

public class Ej4MediaTresNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Programa 4, Media de tres números: ");
		System.out.println("ingrese su número 1 a continuación: ");
		double numero1 = sc.nextDouble();
		System.out.println("ingrese su número 2: ");
		double numero2 = sc.nextDouble();
		System.out.println("ingrese su número 3: ");
		double numero3 = sc.nextDouble();
		double media = (numero1 + numero2 + numero3)/3 ;
		System.out.println("LA MEDIA DE SUS 3 NÚMEROS ES: " + media ) ;
		sc.close();

	}

}
