package ActividadesPackage;
import java.util.Scanner;

public class Actividad03_EntD_Ejercicio1y2 {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------------------EJERCICIO 1--------------------------");
		System.out.println("----------Operadores de comparasión entre 2 núemros--------");
		System.out.println("Ingrese número 1 por favor...");
		int numero1 = sc.nextInt();
		System.out.println("Ingrese número 2 por favor...");
		int numero2 = sc.nextInt();
		
		MayorMenor(numero1, numero2);
		

		try { Thread.sleep(1000); // Pausa de 1000 milisegundos (un segundo)
        } catch (InterruptedException e){}
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("----------------------EJERCICIO 2---------------------------");
		System.out.println("Definir que día de la semana es según el número ingresado");
		
		try { Thread.sleep(1000); // Pausa de 1000 milisegundos (un segundo)
        } catch (InterruptedException e){}
		System.out.println("-------------------------------------------------------------------------");
		

		System.out.println("Ingrese un número del 1 al 7 para ver que día de la semana es:");
		int numeroSemana = sc.nextInt();
		
		int tuNumero = verificador(numeroSemana); //llamo a la funcion verificador para chequear si el nuemero ingresado esta entre 1 y 7
		
		//System.out.println("Tu numero es:" + tuNumero);
		semana(tuNumero);
		
		sc.close();
		
	}
	
	public static void MayorMenor(int numero1, int numero2) { //EJERCICIO NUMERO 1
		if (numero1 > numero2) {
			System.out.println("El número 1 es mayor que el número 2: " + numero1 + " > " + numero2);
			
		} else if (numero1 < numero2) {
			System.out.println("El número 1 es menor que el número 2: "+ numero1 + " < " + numero2);
		} else {
			System.out.println("Los número 1 y 2 son IGUALES: "+ numero1 + " = " + numero2);
		}
	}
	
	
	public static void semana(int numeroSemana) {
		if (numeroSemana == 1) {
			System.out.println("Su número de la semana corresponde al día: LUNES");
		} else if (numeroSemana == 2) {
			System.out.println("Su número de la semana corresponde al día: MARTES");
		}else if (numeroSemana == 3) {
			System.out.println("Su número de la semana corresponde al día: MIÉRCOLES");
		}else if (numeroSemana == 4) {
			System.out.println("Su número de la semana corresponde al día: JUEVES");
		}else if (numeroSemana == 5) {
			System.out.println("Su número de la semana corresponde al día: VIERNES");
		}else if (numeroSemana == 6) {
			System.out.println("Su número de la semana corresponde al día: SÁBADO");
		}else if (numeroSemana == 7) {
			System.out.println("Su número de la semana corresponde al día: DOMINGO");
		}else {
			System.out.println("No ingresó un número entre el 1 y el 7 como le fue requerido :(");
		}
	}
	
	public static int verificador(int numeroSemana) {
		
		Scanner sc = new Scanner(System.in);
		boolean contador = true; // creo una variable para que sirva de condición para el while
		do {					//inicia el do (las sentencias se van a leer al menos 1 vez
			if (numeroSemana >= 1 && numeroSemana <= 7) {  //si el numero se encuentra entre 1 y 7 se salteará el ELSE y saldrá del bucle WHILE
				contador = false;
			}else { 			// en cambio si no se encuentra entre 1 y 7 volverá a solicitar un nuevo número y volverá a iniciar el bucle
				System.out.println("-------------------------------------------------------------------------");
				System.out.println("Usted ha ingresado un número que NO se encuentra entre 1 y 7 ");
				System.out.println("Por favor ingrese un número que SI esté entre el 1 y el 7: ");
				numeroSemana = sc.nextInt();
			}
		} while (contador == true);
		
		sc.close();
		return numeroSemana;
	}

}
