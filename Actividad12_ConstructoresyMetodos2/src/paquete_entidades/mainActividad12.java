package paquete_entidades;

import java.util.Scanner;

public class mainActividad12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		objetos c1 = new objetos();
		System.out.println("A continuación ingrese los datos de su coche 1: ");
		System.out.println("Ingrese modelo: ");
		c1.modelo = sc.nextLine();
		System.out.println("Ingrese marca: ");
		c1.marca = sc.nextLine();
		System.out.println("Ingrese fecha matriculacion ");
		c1.fecha_matric = sc.nextLine();

		System.out.println("Ingrese precio: ");
		c1.precio = sc.nextDouble();
		System.out.println("Ingrese id del coche: ");
		c1.id = sc.nextInt();
		System.out.println("Ingrese km del coche: ");
		c1.km = sc.nextDouble();

		
		objetos c2 = new objetos();
		System.out.println("A continuación ingrese los datos de su coche 2: ");
		sc.nextLine();
		System.out.println("Ingrese fecha matriculacion ");
		c2.fecha_matric = sc.nextLine();
		System.out.println("Ingrese precio: ");
		c2.precio = sc.nextDouble();
		System.out.println("Ingrese id del coche: ");
		c2.id = sc.nextInt();
		System.out.println("Ingrese km del coche: ");
		c2.km = sc.nextDouble();

		System.out.println("-----------------------------------------------------------------------------");
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println("-----------------------------------------------------------------------------");
		c1.mostrarPrecio();
		c2.mostrarPrecio();
		System.out.println("-----------------------------------------------------------------------------");
		c1.mostrarAnio();
		c2.mostrarAnio();
		System.out.println("-----------------------------------------------------------------------------");
		c1.anioBisiesto();
		c2.anioBisiesto();
		System.out.println("-----------------------------------------------------------------------------");
		c1.precio = c1.precioSegunKm();
		c2.precio = c2.precioSegunKm();
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("El precio final de su primer coche es : " + c1.precio);
		System.out.println("El precio final de su segundo coche es : " + c2.precio);
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("El número de km del auto es primo: " + c1.esPrimo());
		System.out.println("El nú,ero de km del auto 2 es primo: " + c2.esPrimo());
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Le faltan " + c1.cuantosFaltan200K() + "al coche 1 para los 200K");
		System.out.println("Le faltan " + c2.cuantosFaltan200K() + "al coche 2 para los 200K");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("La cantidad de caracteres de la marca y modelo del coche 1 es: " + c1.cuantosCaracteresHay() );
		System.out.println("La cantidad de caracteres de la marca y modelo del coche 2 es: " + c2.cuantosCaracteresHay() );
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("La diferencia de km entre el coche 1 y el 2 es: " + c1.diferenciaKmCoches(c2.km));
		System.out.println("-----------------------------------------------------------------------------");
		switch (c1.cocheMasCaro(c2.precio)) {
			case 0: {
				System.out.println("Los coches tienen el mismo precio ");
				break;
			}case 1: {
				System.out.println("El coche 1 es más caro que el 2 ");
				break;
			} case 2:  {
				System.out.println("El coche 2 es más caro que el 1 ");
				break;
			} 
		}
		sc.close();

	}

}