package Ejercicio02_Entornos;
import java.util.Scanner;

public class Ej2Hipotenusa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Programa 2, Hipotenusa del triángulo rectángulo: ");
		System.out.println("ingrese su alttura a continuación: ");
		double altura = sc.nextDouble();
		System.out.println("ingrese su base: ");
		double base = sc.nextDouble();
		double hipo = Math.sqrt((base*base) + (altura*altura));
		System.out.println("LA HIPOTENUSA DE SU TRIÁNGULO RECTÁNGULO ES: " + hipo + " cm");
		sc.close();
		
	}

}
