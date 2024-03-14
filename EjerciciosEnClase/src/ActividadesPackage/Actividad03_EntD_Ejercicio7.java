package ActividadesPackage;

import java.util.Scanner;

public class Actividad03_EntD_Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----------------------------EJERCICIO 7-----------------------------");
		System.out.println("---------Determinar el descuento y el monto final de una compra------");
		System.out.println("Ingrese el monto de su compra por favor...");
		double monto = sc.nextDouble();
		
		
		if (monto >= 100) {
			System.out.println("Su descuento será del 10%");
			System.out.println("El monto final de su compra es de: " + monto*90/100 +"€" ); //hago el 10% de descuento sobre el monto
		}else if (monto >= 50 && monto <= 100) {
			System.out.println("Su descuento será del 5%");
			System.out.println("El monto final de su compra es de: " + monto*95/100 +"€" ); //hago el 5% de descuento sobre el monto
		}else {
			System.out.println("Usted no ha gastado lo necesario par conseguir desdcuentos, muy mal, GASTE MAS POR FAVOR");
			System.out.println("El monto final de su compra es de: " + monto +"€");
		}

		
		sc.close();
	}

}
