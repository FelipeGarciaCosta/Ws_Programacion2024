package ActividadesPackage;

import java.util.Scanner;

public class Actividad03_EntD_Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------------------EJERCICIO 3--------------------------");
		System.out.println("----------Aprobado o Suspenso según la nota --------");
		System.out.println("Ingrese nota por favor...(entre 0 y 100)");
		int nota = sc.nextInt();
		
		nota = verificador(nota);
		//System.out.println("su nota es:" + nota); LO UTILICE PARA VERIFICAR QUE LA VARIABLE NOTA HAYA SIDO CAMBIADA ADECUADAMENTE

		if (nota >= 50) {
			System.out.println(" Felicitaciones usted ha APROBADO :)");
		}else {
			System.out.println(" Muy malas noticias, usted ha SUSPENDIDO :( ");
		}
		
		sc.close();
	}
	
	public static int verificador(int numeroSemana) {
		
		Scanner sc = new Scanner(System.in);
		boolean contador = true; // creo una variable para que sirva de condición para el while
		do {					//inicia el DO (las sentencias se van a leer al menos 1 vez
			if (numeroSemana >= 0 && numeroSemana <= 100) {  //si el numero se encuentra entre 0 y 100 se salteará el ELSE y saldrá del bucle WHILE
				contador = false;
			}else { 			// en cambio si no se encuentra entre 1 y 7 volverá a solicitar un nuevo número y volverá a iniciar el bucle
				System.out.println("-------------------------------------------------------------------------");
				System.out.println("Usted ha ingresado un número que NO se encuentra entre 0 y 100 ");
				System.out.println("Por favor ingrese un número que SI esté entre el 0 y el 100: ");
				numeroSemana = sc.nextInt();
			}
		} while (contador == true);
		
		sc.close();
		return numeroSemana;
	}


}
