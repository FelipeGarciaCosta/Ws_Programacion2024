package estructuraHashMap;

import java.util.HashMap;
import java.util.Scanner;

public class mainActividad23_1 {

	public static void main(String[] args) {

		/*Hacer los siguientes ejercicios con estructura HashMap

		1. Hacer un programa que almacene un listín de números de teléfono, es decir,
		cada nombre tendrá asignado un número de teléfono. Los datos se le pedirá al usuario por pantalla 
		(5 números de teléfono) y se mostrarán después de introducirlos.*/
		
		
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> hashmapListaNumerosTel = new HashMap<>();
		
		
		int numTelefono = 0;
		String nombre;
		for(int i = 0; i<2; i++) {
			
			
			System.out.println("Ingrese el nombre ");
			nombre= sc.nextLine();
			System.out.println("Ingrese el número de teléfono");
			numTelefono = sc.nextInt();
			sc.nextLine();
			
			hashmapListaNumerosTel.put(nombre, numTelefono);
			
		}
	
		
		hashmapListaNumerosTel.forEach((K,v) -> {
			System.out.println("Nombre: " + K.toString());
			System.out.println(" Número teléfono: " + v.toString());
		});
		
		//System.out.println(hashmapListaNumerosTel.get("felipe"));
		
		sc.close();
	}
	
	
	

}
