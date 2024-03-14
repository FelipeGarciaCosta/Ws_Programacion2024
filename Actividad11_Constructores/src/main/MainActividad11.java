package main;

import java.util.Scanner;

import entidad.entidadVideojuego;

public class MainActividad11 {

	public static void main(String[] args) {
		entidadVideojuego v1 = new entidadVideojuego();
		entidadVideojuego v2 = new entidadVideojuego("Fortinite","15/03/2016");
		entidadVideojuego v3 = new entidadVideojuego(3, "Baldur`s gate iii", 10 , 59.95 , "03/08/2023", true);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese id");
		v1.id = sc.nextLong();
		System.out.println("Ingrese precio");
		v1.precio = sc.nextDouble();
		System.out.println("Ingrese puntuacion");
		v1.puntuacion = sc.nextDouble();
		System.out.println("Ingrese si es de segunda mano");
		v1.esSegundaMano = sc.nextBoolean();
		//
		sc.nextLine();
		System.out.println("ingreses nombre");
		v1.nombre = sc.nextLine();
		
		
		//Invocamos los métodos:
		v1.mostrarDatos();
		v1.mostrarNombrePuntuacion();
		v1.mostrarPrecioEnLibras();
		v1.mostrarFechaInvertidaSubString();
		System.out.println(v1.calcularDescuento());
		v1.mostrarEsJugable();
		v1.mostrarNumerosNaturalesHastaDiez();
		boolean esMasCaro = v1.esMasCaro(v3);
		System.out.println(esMasCaro);
		
		sc.close();
	}

}
