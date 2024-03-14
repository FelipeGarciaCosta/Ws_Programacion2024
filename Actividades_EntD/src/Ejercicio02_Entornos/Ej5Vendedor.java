package Ejercicio02_Entornos;
import java.util.Scanner;

public class Ej5Vendedor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Programa 5, Problema del Vendedor: ");
		System.out.println("ingrese sueldo base del Vendedor: ");
		double sueldoBase = sc.nextDouble();
		
		System.out.println("ingrese su venta 1: ");
		double venta1 = sc.nextDouble();
		
		System.out.println("ingrese su venta 2: ");
		double venta2 = sc.nextDouble();
		
		System.out.println("ingrese su venta 3: ");
		double venta3 = sc.nextDouble();
		
		double comision = 0.1*(venta1 + venta2 + venta3);
		
		System.out.println("El pago que recibirá por comisiones es = " + comision + "$");
		System.out.println("Dinero total que recibirá en el mes(base+comisiones) = " + (comision+ sueldoBase) + "$");
		sc.close();
	}

}
