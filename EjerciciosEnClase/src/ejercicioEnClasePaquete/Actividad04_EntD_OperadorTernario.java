package ejercicioEnClasePaquete;

import java.util.Scanner;

public class Actividad04_EntD_OperadorTernario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//"El primer número es mayor", "El segundo número es mayor" o "Los dos números son iguales"
		System.out.println("-----------EJERCICIO 1 hecho con Ternarias-----------");
		System.out.println("Ingrese un número: ");
		int numero1 = sc.nextInt();
		System.out.println("Ingrese otro número: ");
		int numero2 = sc.nextInt();
		
		if(numero1 != numero2) {
			String texto = (numero1 < numero2) ? "el " + numero1 + " es menor que el "+ numero2 : "el " + numero1 + " es mayor que el "+ numero2;
			System.out.println(texto);
		}else {
			System.out.println("Sus números son iguales xd  " + numero1 + " = " +  numero2 );
		}
		
		System.out.println("-----------EJERCICIO 3 hecho con Ternarias-----------");
		System.out.println("Ingrese una NOTA (entre 1 y 100): ");
		int nota = sc.nextInt();
		
		String texto2 = (nota >= 50) ? "Felicitaciones usted ha aprobado mi REY " : "Bro ponete a estudiar que estas feito merda :/" ;
		System.out.println(texto2);
		
		
		sc.close();
		
	}

}
