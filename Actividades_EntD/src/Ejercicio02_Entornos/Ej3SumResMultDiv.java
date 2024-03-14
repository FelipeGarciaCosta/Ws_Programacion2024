package Ejercicio02_Entornos;
import java.util.Scanner;

public class Ej3SumResMultDiv {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Programa 3, Operaciones entre números: ");
		System.out.println("ingrese su 1er número a continuación: ");
		double numero1 = sc.nextDouble();
		System.out.println("ingrese su 2do número a continuación: ");
		double numero2 = sc.nextDouble();
		
		System.out.println("Las operaciones que usted a solicitado son Suma/Resta/Multiplicación/División entre el 1er y el 2do número: ");
		double suma = numero1+numero2;
		double resta = numero1-numero2;
		double producto = numero1*numero2;
		double division = numero1/numero2;
		
		System.out.println("Suma= " + suma );
		System.out.println("Resta= " + resta);
		System.out.println("Multiplicación= " + producto);
		System.out.println("División= " + division);
		sc.close();
	}
	

}
