package Actividad05_Package;

import java.util.Scanner;

public class Ejercicio_XI {

	public static void main(String[] args) {
		System.out.println("Ejercicio 11: calcular la potencia de un número introducido por pantalla");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la BASE:...");
		double base = sc.nextDouble();
		System.out.println("Introduce el EXPONENTE:...");
		double exponente = sc.nextDouble();
		double potencia = 1;
		
		//TODO ESTO ES PORQUE GUILLE QUISO SABER SI SE PODIA HACER CON UN EXPONENTE NEGATIVO TERRIBLE CRACK
		boolean expoNegativo = false;
		
		if(exponente < 0) {
			exponente = (exponente *-1);
			expoNegativo = true;
		}
		
		for(int i = 0; i < exponente; i++) {
			potencia = potencia*base;// potencia empieza valiendo 1 y después de la primera vuelta vale 1*base
									// EXPLICACION PARA EL CASO DE 3^4   :)
									// en este caso es 1*3=3
									//despues en la 2da vuelta es 3*3 por lo que vale 9.... se realiza 4 veces por lo que queda
									// 1*3= 3----3*3=9---9*3=27---27*3=81 -------==== 3*3*3*3 === 3^4
		}
		
		
		//TODO ESTO ES PORQUE GUILLE QUISO SABER SI SE PODIA HACER CON UN EXPONENTE NEGATIVO TERRIBLE CRACK
		if(expoNegativo == true) {
			exponente = (exponente *-1);
		}
		
		if(exponente >= 0) {
			System.out.println("La potencia de "+ base+ "^" + exponente + " es igual a " + potencia);
		}else {
			System.out.println("BRO PORQUE QUERES SABER UN NUMERO ASI MAN");
			System.out.println("igual tu respuesta es: " + (1/potencia));
		}
		
		sc.close();
	}

}
