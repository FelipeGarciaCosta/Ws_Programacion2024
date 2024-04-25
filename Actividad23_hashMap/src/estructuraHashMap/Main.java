package estructuraHashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	private static Scanner sc;
    public static void main(String[] args) {
    	
    	sc = new Scanner(System.in);
        HashMap<String, entidadPersona> HashMapPersonas = new HashMap<>();

        boolean salir = false;
        while (!salir) {
            System.out.println("\nMenú:");
            System.out.println("1. Introducir Persona");
            System.out.println("2. Mostrar Personas");
            System.out.println("3. Buscar persona por nombre");
            System.out.println("4. Salir del programa");
            System.out.print("Elija una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea después del número

            switch (opcion) {
                case 1:
                    introducirPersona( HashMapPersonas);
                    break;
                case 2:
                    mostrarPersonas(HashMapPersonas);
                    break;
                case 3:
                    buscarPersona(HashMapPersonas);
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
        sc.close();
    }
    
    
    
    public static void introducirPersona(HashMap<String, entidadPersona> HashMapPersonas) {
    	System.out.println("Introducir Persona:");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        if (HashMapPersonas.containsKey(nombre)) {
            System.out.println("Ya existe una persona con ese nombre.");
            System.out.print("¿Desea sobrescribir los datos? (y/n): ");
            String respuesta = sc.nextLine();
            if (!respuesta.equalsIgnoreCase("y")) {
                return;
            }
        }
        
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        System.out.print("Peso: ");
        double peso = sc.nextDouble();

        HashMapPersonas.put(nombre, new entidadPersona(nombre, edad, peso));
        System.out.println("Persona añadida correctamente.");
    }
    
    public static void mostrarPersonas( HashMap<String, entidadPersona> HashMapPersonas) {
    	if(HashMapPersonas.size() == 0) {
    		System.out.println("La lista está vacía");
    		return;
    	}
    	HashMapPersonas.forEach((K,V) -> {
			System.out.println("valor: " + V.toString());
    	});
    }
    
    
    public static void buscarPersona(HashMap<String, entidadPersona> HashMapPersonas) {
    	System.out.println("Ingrese a la persona que quiera buscar: ");
    	String personaBuscada = sc.nextLine();
    	if(HashMapPersonas.containsKey(personaBuscada)) {
    		System.out.println("La persona: " + personaBuscada + " se encuentra dentro de la lista.");
    	}else {
    		System.out.println("La persona: " + personaBuscada + " no se encuentra dentro de la lista");
    	}
    }
    
    
}