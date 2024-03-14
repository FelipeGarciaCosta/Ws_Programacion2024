package main;

import java.util.ArrayList;
import java.util.Scanner;

public class mainCoche {
	
	private Scanner sc ;
	private ArrayList<Coche> listaCoches;
	
	
	public static void main(String[] args) {
		
		mainCoche main = new mainCoche();
		main.arrancarPrograma();
		
	}
	
	public String mostrarMenu() {
		System.out.println("1. Crear coche");
		System.out.println("2. Mostrar coches");
		System.out.println("3. Mostrar contadorID");
		System.out.println("4. Resetear contadorID");
		System.out.println("5. Salir del programa");
		String opcion = sc.nextLine();
		return opcion;
	}

	
	public void arrancarPrograma() {
		listaCoches = new ArrayList<Coche>();
		sc = new Scanner(System.in);
		String opcion = null;
		do {
			opcion = mostrarMenu();
			switch (opcion) {
			case "1":
				crearCoche();
				break;
			case "2":
				mostrarCoches();
				break;
			case "3":
				mostrarContadorID();
				break;
			case "4":
				resetearContadorID();
				break;
			case "5":
				System.out.println("Fin del programa");
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		}while(!opcion.equals("5"));
	}
	
	
	public void crearCoche() {
		
		System.out.println("Ingrese la matrícula del coche: ");
		String matricula = sc.nextLine();
		System.out.println("Ingrese la marca: ");
		String marca = sc.nextLine();
		Coche coche = new Coche();
		
		coche.setMarca(marca);
		coche.setMatricula(matricula);
		
		listaCoches.add(coche);
	}
	
	public void mostrarCoches() {
		System.out.println("Los autos que tiene creados son: ");
		for (Coche c : listaCoches) {
			System.out.println(c.toString());
		}
		
	}
	
	public void mostrarContadorID() {
		System.out.println("El contadorID es: " + Coche.getContadorID());
	}
	
	public void resetearContadorID() {
		System.out.println("Resetearemos el contador");
		Coche.resetearContador();
	}
}
