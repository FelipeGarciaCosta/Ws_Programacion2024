package Ejercicio02_Entornos;
import java.util.Scanner;

public class Ej6Alumno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Programa 6, Notas Del Alumno: ");
		System.out.println("ingrese su examen Parcial 1: ");
		double examen1 = sc.nextDouble();
		
		System.out.println("ingrese su examen Parcial 2: ");
		double examen2 = sc.nextDouble();
		
		System.out.println("ingrese su examen Parcial 3: ");
		double examen3 = sc.nextDouble();
		
		System.out.println("ingrese su examen Final: ");
		double examenFinal = sc.nextDouble();
		
		System.out.println("ingrese su Trabajo Final: ");
		double trabajo = sc.nextDouble();
		double calificacionFinal = (55*(examen1+examen2+examen3)/300 + (30*examenFinal)/100 +(15*trabajo)/100);
		
		System.out.println("SU CALIFICACIÓN FINAL ES: " + calificacionFinal );
		
		sc.close();
	}

}
