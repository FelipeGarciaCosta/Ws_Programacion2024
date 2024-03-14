package Actividad_09_Cadenas;

import java.util.Scanner;

public class Ejercicio_08_Palindromo {

	public static void main(String[] args) {
		
		System.out.println("Ejercicio 8: ver si una palabra es un polídromo");
		System.out.println("--------------------------------------------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese su cadena ");
		String cadena = sc.nextLine();

		String invertida = ""; //creo una cadena vacía para luego valorizarla
		
		for(int i = cadena.length()-1; i >=0; i--) {
			invertida += cadena.charAt(i); //con charAt valorizo la cadena INVERTIDA con el caractér que este en la posición i 
			//de la cadena dada, en este ejemplo arranco desde el último caracter hasta el primero.
		}
		
		if(cadena.equals(invertida)) {
			System.out.println("Su palabra es un polídromo ");
		}else {
			System.out.println("Su palabra no es un polídromo");
		}
		
		sc.close();
	}

}
