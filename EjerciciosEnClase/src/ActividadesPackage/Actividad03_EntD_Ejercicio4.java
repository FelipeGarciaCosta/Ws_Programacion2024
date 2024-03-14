package ActividadesPackage;

import java.util.Scanner;

public class Actividad03_EntD_Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------------------EJERCICIO 4----------------------------");
		System.out.println("------------Determinar la categoría según la EDAD------------");
		System.out.println("Ingrese una edad en años por favor...");
		int edad = sc.nextInt();
		
		if (edad >= 0 && edad <=12 ) {
			System.out.println("Su edad se encuentra en la categoía niño");
		}else if (edad >= 13 && edad <=19 ) {
			System.out.println("Su edad se encuentra en la categoía adolescente");
		}else if (edad >= 20 && edad <=64 ) {
			System.out.println("Su edad se encuentra en la categoía adulto");
		}else if (edad > 65 ) {
			System.out.println("Su edad se encuentra en la categoía adulto mayor");
		}
		sc.close();
	}

}
