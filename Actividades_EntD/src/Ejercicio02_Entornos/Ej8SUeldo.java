package Ejercicio02_Entornos;
import java.util.Scanner;

public class Ej8SUeldo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Programa 8, Sueldo Trabajador: ");
		System.out.println("Ingrese su sueldo Base: ");
		double sueldoBase = sc.nextDouble();
		System.out.println("ingrese sus horas extra trabajadas del mes: ");
		double horasExtra = sc.nextDouble();
		
		double sueldoTotal = sueldoBase + (horasExtra*40);
		System.out.println("(_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_)");
		System.out.println("                    Su sueldo este mes será: " + sueldoTotal + "€" );
		sc.close();

	}

}
